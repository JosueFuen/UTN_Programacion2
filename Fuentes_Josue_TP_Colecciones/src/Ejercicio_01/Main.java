/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author fosue
 */
public class Main {
    public static void main(String[] args) {
 
        Inventario inventario = new Inventario();
 
        Producto p1 = new Producto("001", "Arroz 1kg",     850.0,  100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("002", "Auriculares",  2500.0,   30, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("003", "Remera",1200.0,   50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("004", "Sarten",  3500.0,   20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("005", "Aceite", 950.0,  80, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("006", "Teclado",  1800.0,   15, CategoriaProducto.ELECTRONICA);
 
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);


        inventario.listarProductos();
        System.out.println();
 
        System.out.println("=== BUSQUEDA POR ID ===");
        Producto encontrado = inventario.buscarProductoPorId("003");
        encontrado.mostrarInfo();
        System.out.println();
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        inventario.eliminarProducto("001");
        System.out.println();
        
        inventario.listarProductos();
        inventario.actualizarStock("002", 45);
        System.out.println();
        
        System.out.println("=== TOTAL DE STOCK: "+inventario.obtenerTotalStock() +"  ===");
        System.out.println();
 
        System.out.println("=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        mayor.mostrarInfo();
        System.out.println();
 
        inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println();
        
        inventario.mostrarCategoriasDisponibles();
    }
}