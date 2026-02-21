public class SistemaCarrito {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Producto p1 = new Producto(1, "Laptop", 2500);
        Producto p2 = new Producto(2, "Mouse", 80);
        Producto p3 = new Producto(1, "Laptop Duplicada", 2500);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3); 

        carrito.mostrarCarrito();

        carrito.eliminarProducto(p2);

        carrito.mostrarCarrito();

        System.out.println("Total: $" + carrito.calcularTotal());
    }
}