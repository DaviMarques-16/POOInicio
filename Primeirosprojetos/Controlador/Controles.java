package Controlador;

public class Controles {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.maisVolume();
        c1.maisVolume();
        c1.play();
        c1.abrirMenu();
        c1.FecharMenu();

    }
}
