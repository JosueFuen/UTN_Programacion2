/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

import java.util.ArrayList;

/**
 *
 * @author fosue
 */

 
public class Inventario {
    private ArrayList<Producto> productos;
 
    public Inventario() {
        this.productos = new ArrayList<>();
    }
 
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
 
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
        System.out.println("=== LISTADO DE PRODUCTOS ===");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
 
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
 
    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto con ID '" + id + "' eliminado.");
        } else {
            System.out.println("No se encontro producto con ID: " + id);
        }
    }
 
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + p.getNombre() + "' actualizado a " + nuevaCantidad + " unidades.");
        } else {
            System.out.println("No se encontro producto con ID: " + id);
        }
    }
 
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("=== PRODUCTOS DE CATEGORIA: " + categoria + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en esta categoria.");
        }
    }
 
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
 
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }
 
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("=== PRODUCTOS CON PRECIO ENTRE $" + min + " Y $" + max + " ===");
        boolean encontrado = false;
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos en ese rango de precios.");
        }
    }
 
    public void mostrarCategoriasDisponibles() {
        System.out.println("=== CATEGORIAS DISPONIBLES ===");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println("- " + cat.name() + ": " + cat.getDescripcion());
        }
    }
}