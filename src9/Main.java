package src9;

public class Main {

    public static void main(String[] args) {

        Inventario almacen = new Inventario();

        // Inserciones
        almacen.agregarProducto("A001", "Televisor Sony");
        almacen.agregarProducto("A002", "Laptop Dell");

        
        almacen.agregarProducto("A001", "Laptop HP"); 
        

       
        almacen.mostrarInventario();

        System.out.println();

        
        almacen.verificarProducto("A001"); // Existe
        almacen.verificarProducto("A999"); // No existe
    }
}
