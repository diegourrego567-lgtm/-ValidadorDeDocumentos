package src8;

import java.util.Queue;
import java.util.LinkedList;

public class SistemaTicketsSoporte {

    private Queue<String> colaSoporte;

 
    public SistemaTicketsSoporte() {
        colaSoporte = new LinkedList<>();
    }

    // Llegada de cliente (Enqueue)
    public void llegadaCliente(String nombre) {
        colaSoporte.offer(nombre); // Agrega al final de la cola
        System.out.println("Cliente agregado: " + nombre);
    }

    // Ver siguiente cliente sin atender (Peek)
    public void siguienteCliente() {
        if (!colaSoporte.isEmpty()) {
            System.out.println("Siguiente en la cola: " + colaSoporte.peek());
        } else {
            System.out.println("No hay clientes en espera.");
        }
    }

    // Atender cliente (Dequeue con poll)
    public void atenderCliente() {
        String cliente = colaSoporte.poll(); // Devuelve null si está vacía

        if (cliente != null) {
            System.out.println("Atendiendo a: " + cliente);
        } else {
            System.out.println("No hay clientes para atender.");
        }
    }

    // Diferencia entre poll y remove
    public void probarRemove() {
        try {
            String cliente = colaSoporte.remove(); // Lanza excepción si está vacía
            System.out.println("Atendiendo con remove(): " + cliente);
        } catch (Exception e) {
            System.out.println("Error: No se puede usar remove(), la cola está vacía.");
        }
    }
}