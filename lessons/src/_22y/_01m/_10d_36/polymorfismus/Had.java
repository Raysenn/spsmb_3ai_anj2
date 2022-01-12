package _22y._01m._10d_36.polymorfismus;

public class Had extends Zivocich {
    int delkaTela;

    public Had(String typ, int delka) {
        super(typ);
        this.delkaTela = delka;
    }

    @Override
    public void vypisDelku() {
        System.out.println("delka tela: " + this.delkaTela);
    }
}
