package _21y._10m._14d_15;
//importuj všechny třídy balíčku awt

import java.awt.*;


public class WindowGUI {
    Button helloBT;
    Label lab;

    WindowGUI(Frame myFrame) {
        //vytvoření anonymní instance třídy FlowLayout a její přidání
        //do ramecku (instance třídy Frame)
        myFrame.setLayout(new FlowLayout());
        //nová  instance třídy Button
        this.helloBT = new Button("Ahoj");
        //nová instance třídy Label (Návěští)
        this.lab = new Label("Nazdar");
        //přidání tlačítka do rámečku
        myFrame.add(this.helloBT);
        //přidání návěští do rámečku
        myFrame.add(this.lab);
        myFrame.setSize(170, 65);
    }

    public static void main(String[] args) {
        Frame myFrame = new Frame("Muj Ramec");
        WindowGUI window = new WindowGUI(myFrame);
        myFrame.setVisible(true);
    }
}
