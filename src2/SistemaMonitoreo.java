package src2;

public class SistemaMonitoreo {

    public static void main(String[] args) {

        EstacionClimatica estacion = new EstacionClimatica();

        estacion.generarTemperaturas();
        estacion.mostrarTemperaturaMediodia();
        estacion.probarLimite();
        estacion.mostrarRegistroCompleto();
    }
}
