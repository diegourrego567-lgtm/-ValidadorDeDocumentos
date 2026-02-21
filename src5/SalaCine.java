public class SalaCine {

    private int[][] sala;

    //  8x10
    public SalaCine() {
        sala = new int[8][10];

        // Inicialización en 0 (Libre)
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = 0;
            }
        }
    }

    //Reservar asiento
    public void reservarAsiento(int fila, int col) {

        if (fila >= 0 && fila < 8 && col >= 0 && col < 10) {

            if (sala[fila][col] == 0) {
                sala[fila][col] = 1;
                System.out.println("Asiento reservado correctamente.");
            } else {
                System.out.println("El asiento ya está ocupado.");
            }

        } else {
            System.out.println("Coordenadas fuera de rango.");
        }
    }

    // Buscar si existen 2 asientos libres 
    public void buscarDosLibres(int fila) {

        if (fila >= 0 && fila < 8) {

            for (int j = 0; j < 9; j++) {
                if (sala[fila][j] == 0 && sala[fila][j + 1] == 0) {
                    System.out.println("Hay dos asientos libres consecutivos en la fila " + fila);
                    return;
                }
            }

            System.out.println("No hay dos asientos libres consecutivos en la fila " + fila);

        } else {
            System.out.println("Fila fuera de rango.");
        }
    }

    // Mostrar la matriz completa
    public void mostrarSala() {

        System.out.println("\nEstado actual de la sala:");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println(); // salto de línea por fila
        }
    }
}