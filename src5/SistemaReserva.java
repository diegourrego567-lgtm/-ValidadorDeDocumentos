public class SistemaReserva {

    public static void main(String[] args) {

        SalaCine sala = new SalaCine();

        sala.mostrarSala();

        sala.reservarAsiento(2, 5);
        sala.reservarAsiento(2, 6);

        sala.mostrarSala();

        sala.buscarDosLibres(2);
    }
}