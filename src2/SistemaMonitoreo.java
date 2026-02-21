package src2;

public class SistemaMonitoreo {

    public static void main(String[] args) {

        EstacionClimatico estacion = new EstacionClimatico();

        estacion.generarTemperaturas();
        estacion.mostrarTemperaturaMediodia();
        estacion.probarLimite();
        estacion.mostrarRegistroCompleto();
    }
}
