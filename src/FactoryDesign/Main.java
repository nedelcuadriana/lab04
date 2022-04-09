package FactoryDesign;

public class Main {
    public static void main(String[] args) {
        Factory pachetCazare = new FactoryPachetCazare();
        PachetTuristic pachetCazare2 = pachetCazare.crearePachet();

        pachetCazare2.afiseazaDetalii();
    }
}
