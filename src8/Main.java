package src8;

public class Main {

    public static void main(String[] args) {

        SistemaTicketsSoporte callCenter = new SistemaTicketsSoporte();

       
        callCenter.llegadaCliente("Cliente A");
        callCenter.llegadaCliente("Cliente B");
        callCenter.llegadaCliente("Cliente C");

        System.out.println();

        
        callCenter.siguienteCliente();

        System.out.println();

       
        callCenter.atenderCliente();
        callCenter.atenderCliente();
        callCenter.atenderCliente();

       
        callCenter.atenderCliente();

        System.out.println("\nProbando remove():");
        callCenter.probarRemove();
    }
}
