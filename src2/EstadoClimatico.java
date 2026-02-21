package src2;

public class EstacionClimatica {

    private double[] temperaturas;

    // Constructor
    public EstacionClimatica() {
        temperaturas = new double[24];
    }

    // Llenar arreglo con datos simulados
    public void generarTemperaturas() {
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 40;
        }
    }

    // Acceso directo O(1)
    public void mostrarTemperaturaMediodia() {
        System.out.println("Temperatura a las 12:00 -> " + temperaturas[12]);
    }

    // Prueba de límites
    public void probarLimite() {
        try {
            temperaturas[24] = 25.0; // índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango.");
            System.out.println("El arreglo tiene tamaño fijo de 24 posiciones (0 a 23).");
        }
    }

    // Mostrar todo el registro
    public void mostrarRegistroCompleto() {
        System.out.println("\nRegistro completo de temperaturas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Hora " + i + ":00 -> " + temperaturas[i]);
        }
    }
}
