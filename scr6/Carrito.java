import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> carrito;

    public Carrito() {
        carrito = new ArrayList<>();
    }

    // Agregar producto evitando duplicados
    public void agregarProducto(Producto nuevoProducto) {

        if (!carrito.contains(nuevoProducto)) {
            carrito.add(nuevoProducto);
            System.out.println("Producto agregado.");
        } else {
            System.out.println("El producto ya existe en el carrito.");
        }
    }

    // Eliminar producto
    public void eliminarProducto(Producto producto) {

        if (carrito.remove(producto)) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Mostrar carrito
    public void mostrarCarrito() {

        System.out.println("\nContenido del carrito:");
        for (Producto p : carrito) {
            System.out.println(p);
        }
    }

    // Calcular total
    public double calcularTotal() {

        double total = 0;

        for (Producto p : carrito) {
            total += p.getPrecio();
        }

        return total;
    }
}