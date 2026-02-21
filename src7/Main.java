package src7;

public class Main {

    public static void main(String[] args) {

        HistorialNavegador navegador = new HistorialNavegador();

        navegador.navegar("google.com");
        navegador.navegar("youtube.com");
        navegador.navegar("github.com");

        System.out.println();
        navegador.paginaActual();

        System.out.println();
        navegador.regresar();
        navegador.paginaActual();

        System.out.println("\nVaciando historial...");
        navegador.vaciarHistorial();

        navegador.probarError();
    }
}