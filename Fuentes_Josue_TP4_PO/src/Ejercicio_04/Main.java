package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
    Producto producto1= new Producto("Azucar", 2500.00);
    System.out.println(producto1);

    Producto producto2= new Producto ("Arroz");
    System.out.println(producto2);
    
    Producto producto3= new Producto ("Yerba", -5000);
    System.out.println(producto3);
    
    producto1.aplicarDescuento(10.0);

    producto2.aplicarDescuento(10, 90.0);

    System.out.println(producto1);
    System.out.println(producto2);

    Producto.cambiarIVA(0.10);

    System.out.println(producto3);
    
    }
}
