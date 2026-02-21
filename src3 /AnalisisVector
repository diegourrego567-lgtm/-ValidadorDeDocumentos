package Src3;
import java.util.ArrayList;
import java.util.Vector;

public class AnalisisVector {


    public void simularTransacciones() {


        Vector<String> logTransacciones = new Vector<>();

        for (int i = 1; i <= 5; i++) {
            logTransacciones.add("Transacción #" + i);
        }

        System.out.println("Registro de transacciones:");
        for (String t : logTransacciones) {
            System.out.println(t);
        }
    }


    public void compararRendimiento() {

        int cantidad = 1_000_000;

      
        Vector<String> vector = new Vector<>();
        long inicioVector = System.currentTimeMillis();

        for (int i = 0; i < cantidad; i++) {
            vector.add("T" + i);
        }

        long finVector = System.currentTimeMillis();
        long tiempoVector = finVector - inicioVector;

      
        ArrayList<String> arrayList = new ArrayList<>();
        long inicioArray = System.currentTimeMillis();

        for (int i = 0; i < cantidad; i++) {
            arrayList.add("T" + i);
        }

        long finArray = System.currentTimeMillis();
        long tiempoArray = finArray - inicioArray;

        System.out.println("\nTiempo Vector: " + tiempoVector + " ms");
        System.out.println("Tiempo ArrayList: " + tiempoArray + " ms");
    }
}

