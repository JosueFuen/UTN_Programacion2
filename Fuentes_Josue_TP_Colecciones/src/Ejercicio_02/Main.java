/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author fosue
 */
public class Main {
    public static void main(String[] args) {
 
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UTN");
 
        Autor a1 = new Autor("A01", "Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("A02", "Jorge Luis Borges",      "Argentina");
        Autor a3 = new Autor("A03", "Isabel Allende",         "Chilena");
 
        biblioteca.agregarLibro("978-0001", "Cien anios de soledad",  1967, a1);
        biblioteca.agregarLibro("978-0002", "El amor en los tiempos del colera", 1985, a1);
        biblioteca.agregarLibro("978-0003", "Ficciones",             1944, a2);
        biblioteca.agregarLibro("978-0004", "El Aleph",              1949, a2);
        biblioteca.agregarLibro("978-0005", "La casa de los espiritus", 1982, a3);
        System.out.println();
 
        biblioteca.listarLibros();
        System.out.println();
 
        System.out.println("=== BUSQUEDA POR ISBN: 978-0003 ===");
        Libros encontrado = biblioteca.buscarLibroPorIsbn("978-0003");
        encontrado.mostrarInfo();

        System.out.println();
 
        biblioteca.filtrarLibrosPorAnio(1949);
        System.out.println();
 
        biblioteca.eliminarLibro("978-0002");
        System.out.println();
        biblioteca.listarLibros();
        System.out.println();
 
        System.out.println("=== CANTIDAD TOTAL DE LIBROS: "+ biblioteca.obtenerCantidadLibros()+ "  ===");
        System.out.println();
 
        biblioteca.mostrarAutoresDisponibles();
    }
}