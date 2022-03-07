package _22y._02m._17d_46.piskorky;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//add --module-path "Y:\stemberk\verejne_zaci\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
public class PiskorkyFX extends Application {
    private final String VERSION = "1.0";
    private final String TITULEK = "Piškorky" + this.VERSION;
    private PiskorkyStatus ps = null;
    private Button[][] herniTlacitka;

    private Label labelKdoTahne = new Label("Táhne: ");
    private Label labelKdoTahne2 = new Label();
    private HBox panelKdoHraje = new HBox(labelKdoTahne, labelKdoTahne2);
    private String hostname = "localhost";
    private int port = 8081;

    private void restorePiskvorkyStatus(){
        Socket socket = null;
        try {
            socket = new Socket(hostname, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (var writer = socket.getOutputStream()) {
            writer.write(20);
            //writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket = new Socket(hostname, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (var reader = new ObjectInputStream(socket.getInputStream())){
            this.ps = (PiskorkyStatus) reader.readObject();
            System.out.println(ps.aktivniHrac);
            System.out.println(ps.hraci.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void putPiskvorkyStatus() {

        Socket socket = null;
        try {
            socket = new Socket(hostname, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (var writer = socket.getOutputStream()) {
            writer.write(30);
            //writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket = new Socket(hostname, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (var writer = socket.getOutputStream()) {
            var writerObject = new ObjectOutputStream(writer);
            writerObject.writeObject(this.ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void obnovaPlochy() {
        for (int i = 0; i < this.ps.rozmerHraciPlochy + 1; i++) {
            for (int j = 0; j < this.ps.rozmerHraciPlochy + 1; j++) {
                Button b = this.herniTlacitka[i][j];
                //b.getProperties().clear();
                //b.getProperties().putAll(this.ps.herniTlacitka[i][j]);
                int hracId = (int) this.ps.herniTlacitka[i][j].get("player");
                //System.out.println(b.getProperties());
                b.setText(hracId < 0 ? "" : this.ps.hraci.get(hracId).toString().substring(0, 1));
            }
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            GridPane gp = new GridPane();
            this.restorePiskvorkyStatus();
            this.herniTlacitka = new Button[this.ps.rozmerHraciPlochy + 1][this.ps.rozmerHraciPlochy + 1];
            for (int i = 0; i < this.ps.rozmerHraciPlochy + 1; i++) {
                for (int j = 0; j < this.ps.rozmerHraciPlochy + 1; j++) {
                    Button b = new Button();
                    b.setPrefSize(28, 28);
                    this.herniTlacitka[i][j] = b;
                    //node, sloupec, řádek - ano je to obráceně oproti dosavaním principům
                    gp.add(b, j, i);
                    //Aktivní budou tlačítka, která nejsou na okraji
                    if (i != 0 && j != 0) {
                        b.setOnAction(this::tlacitkoStisknuto);
                    } else {
                        //b.setStyle("-fx-border-width: 10.0; -fx-border-color: navy;");
                        // b.setStyle(" -fx-background-color: navy;");
                        b.setStyle("-fx-border-color: navy;");
                        b.setText(i == 0 ? String.valueOf(j) : String.valueOf(i));
                    }
                }
            }

            BorderPane root = new BorderPane();
            root.setTop(this.panelKdoHraje);
            root.setCenter(gp);
            Scene scene = new Scene(new Group(root));
            stage.setScene(scene);
            stage.show();
            this.obnovaPlochy();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void tlacitkoStisknuto(ActionEvent actionEvent) {
        //aktuální souřadnice tlačítka
        int i = 0, j = 0;
        Button stisknuteTlacitko = ((Button) actionEvent.getSource());
        System.out.println(stisknuteTlacitko.getProperties());
        i = (int) stisknuteTlacitko.getProperties().get("gridpane-row");
        j = (int) stisknuteTlacitko.getProperties().get("gridpane-column");
        System.out.format("i:%d, j:%d%n", i, j);
        //stisknuteTlacitko.setText(this.ps.hraci.get(this.ps.aktivniHrac).toString().substring(0, 1));
        //this.ps.herniPlochaHracu[i][j] = this.ps.aktivniHrac;
        //stisknuteTlacitko.getProperties().put("player",Integer.valueOf(this.ps.aktivniHrac));
        this.ps.herniTlacitka[i][j].put("player", this.ps.aktivniHrac);

        //přepnutí hráče
        if (++this.ps.aktivniHrac >= this.ps.hraci.size()) {
            this.ps.aktivniHrac = 0;
        }
        stisknuteTlacitko.getProperties().put("player", this.ps.aktivniHrac);
        //aktualizace panelu kdo táhne
        this.labelKdoTahne2.setText(this.ps.hraci.get(this.ps.aktivniHrac).toString());
        System.out.println();
        int N = 3;
        System.out.format("verticalWin:%b, horizontalWin:%b, diagonalwin:%b, isReverseDiagonalWin:%b%n",
                this.isVerticalWin(i, j, N),
                this.isHorizontalWin(i, j, N),
                this.isDiagonalWin(i, j, N),
                this.isReverseDiagonalWin(i, j, N));
        int y = i;
        int x = j;
        //pozor, potřeba použít operátor úplného vyhodnocení
        while (--y > 0 & --x > 0) ;
        //System.out.format("x:%d, y:%d%n", x,y);
        for (; y < this.ps.rozmerHraciPlochy && x < this.ps.rozmerHraciPlochy; y++, x++) {
            if (this.isReverseDiagonalWin(y, x, N)) {
                System.out.println("ReverseDiagonal");
                break;
            }
        }
        y = i;
        x = j;
        if (y != this.ps.rozmerHraciPlochy) {
            while (++y < this.ps.rozmerHraciPlochy & --x > 0) ;
        }
        System.out.format("x:%d, y:%d%n", x, y);
        for (; y > 0 && x < this.ps.rozmerHraciPlochy; y--, x++) {
            if (this.isDiagonalWin(y, x, N)) {
                System.out.println("Diagonal");
                break;
            }
        }
        for (int radek1 = 0; radek1 < this.ps.rozmerHraciPlochy; radek1++) {
            for (int sloupec1 = 0; sloupec1 < this.ps.rozmerHraciPlochy; sloupec1++) {
                if (this.isVerticalWin(radek1, sloupec1, N)) {
                    System.out.println("Win vertical");
                }
                if (this.isHorizontalWin(radek1, sloupec1, N)) {
                    System.out.println("Win horizontal");
                }
                if (this.isDiagonalWin(radek1, sloupec1, N)) {
                    System.out.println("Win diagonal");
                }
                if (this.isReverseDiagonalWin(radek1, sloupec1, N)) {
                    System.out.println("Win reverseDiagonal");
                }
            }
        }
        stisknuteTlacitko.setOnAction(null);
        System.out.println("Vypis");
        //vypis
        for (i = 0; i < this.ps.rozmerHraciPlochy; i++) {
            for (j = 0; j < this.ps.rozmerHraciPlochy; j++) {
                //System.out.format(" %02d ",this.ps.herniPlochaHracu[i][j]);
                int player = (int) this.ps.herniTlacitka[i][j].get("player");
                System.out.format("%02d ", player);
            }
            System.out.println();
        }
        this.obnovaPlochy();
        this.putPiskvorkyStatus();
    }

    private boolean isVerticalWin(int radek, int sloupec, int n) {
        int aktualniHrac = (int) this.ps.herniTlacitka[radek][sloupec].get("player");
        if (aktualniHrac < 0) {
            return false;
        }
        for (int i = radek; i < radek + n; i++) {
            if (this.ps.rozmerHraciPlochy < i) {
                return false;
            }
            if (aktualniHrac != (int) this.ps.herniTlacitka[i][sloupec].get("player")) {
                return false;
            }
        }
        return true;
    }

    private boolean isHorizontalWin(int radek, int sloupec, int n) {
        int aktualniHrac = (int) this.ps.herniTlacitka[radek][sloupec].get("player");
        if (aktualniHrac < 0) {
            return false;
        }
        for (int j = sloupec; j < sloupec + n; j++) {
            if (this.ps.rozmerHraciPlochy < j) {
                return false;
            }
            if (aktualniHrac != (int) this.ps.herniTlacitka[radek][j].get("player")) {
                return false;
            }
        }
        return true;
    }

    private boolean isDiagonalWin(int radek, int sloupec, int n) {
        int aktualniHrac = (int) this.ps.herniTlacitka[radek][sloupec].get("player");
        if (aktualniHrac < 0) {
            return false;
        }
        int j = sloupec;
        for (int i = radek; i > radek - n; i--, j++) {
            if (i <= 0) {
                return false;
            }
            if (j > this.ps.rozmerHraciPlochy) {
                return false;
            }
            if (aktualniHrac != (int) this.ps.herniTlacitka[i][j].get("player")) {
                return false;
            }
        }
        return true;
    }

    private boolean isReverseDiagonalWin(int radek, int sloupec, int n) {
        int aktualniHrac = (int) this.ps.herniTlacitka[radek][sloupec].get("player");
        if (aktualniHrac < 0) {
            return false;
        }
        int j = sloupec;
        for (int i = radek; i < radek + n; i++, j++) {
            if (i > this.ps.rozmerHraciPlochy) {
                return false;
            }
            if (j > this.ps.rozmerHraciPlochy) {
                return false;
            }
            if (aktualniHrac != (int) this.ps.herniTlacitka[i][j].get("player")) {
                return false;
            }
        }
        return true;
    }

    private PiskorkyStatus getPiskorkyStatus() {
        var hostname = "localhost";
        int port = 8081;
        PiskorkyStatus ps = null;
        try (var socket = new Socket(hostname, port)) {
            try (var writer = socket.getOutputStream()) {
                writer.write(20);
            }
            try (var reader = new ObjectInputStream(socket.getInputStream())) {
                ps = (PiskorkyStatus) reader.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ps;
    }
}
