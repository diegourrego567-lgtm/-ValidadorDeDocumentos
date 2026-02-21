package src7;

import java.util.Stack;
import java.util.EmptyStackException;

public class HistorialNavegador {

    private Stack<String> historial;

    
    public HistorialNavegador() {
        historial = new Stack<>();
    }

    // Navegar (push)
    public void navegar(String url) {
        historial.push(url);
        System.out.println("Navegando a: " + url);
    }

    // Página actual (peek)
    public void paginaActual() {
        if (!historial.empty()) {
            System.out.println("Página actual: " + historial.peek());
        } else {
            System.out.println("No hay páginas en el historial.");
        }
    }

    // Regresar (pop)
    public void regresar() {
        if (!historial.empty()) {
            String pagina = historial.pop();
            System.out.println("Regresando desde: " + pagina);
        } else {
            System.out.println("No se puede regresar, historial vacío.");
        }
    }

    // Vaciar historial
    public void vaciarHistorial() {
        while (!historial.empty()) {
            System.out.println("Eliminando: " + historial.pop());
        }
    }

    // Forzar error para validación
    public void probarError() {
        try {
            historial.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: No se puede hacer pop, la pila está vacía.");
        }
    }
}
