package src9;

import java.util.Map;
import java.util.HashMap;

public class InventarioPorCodigo {

    private Map<String, String> inventario;

    
    public InventarioPorCodigo() {
        inventario = new HashMap<>();
    }

    // Insertar producto
    public void agregarProducto(String sku, String nombre) {
        inventario.put(sku, nombre);
        System.out.println("Producto agregado/actualizado: " + sku + " -> " + nombre);
    }

    // Verificar producto por código
    public void verificarProducto(String sku) {
        String producto = inventario.get(sku);

        if (producto != null) {
            System.out.println("Producto encontrado: " + sku + " -> " + producto);
        } else {
            System.out.println("No existe producto con código: " + sku);
        }
    }

    // Mostrar todo el inventario
    public void mostrarInventario() {
        System.out.println("\nInventario completo:");
        for (Map.Entry<String, String> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}