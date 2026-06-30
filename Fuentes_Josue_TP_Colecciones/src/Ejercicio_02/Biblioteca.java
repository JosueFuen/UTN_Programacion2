/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fosue
 */

 
public class Biblioteca {
    private String nombre;
    private List<Libros> libros;
 
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
 
    public String getNombre() { 
        return nombre; 
    }
 
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libros libro = new Libros(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("=== LIBROS EN " + nombre.toUpperCase() + " ===");
        for (Libros l : libros) {
            l.mostrarInfo();
        }
    }
 
    public Libros buscarLibroPorIsbn(String isbn) {
        for (Libros l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }
 
    public void eliminarLibro(String isbn) {
        Libros encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro con ISBN '" + isbn + "' eliminado.");
        } else {
            System.out.println("No se encontro libro con ISBN: " + isbn);
        }
    }
 
    public int obtenerCantidadLibros() {
        return libros.size();
    }
 
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrado = false;
        for (Libros l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en ese año.");
        }
    }
 
    public void mostrarAutoresDisponibles() {
        System.out.println("=== AUTORES DISPONIBLES EN " + nombre + " ===");
        List<String> idsVistos = new ArrayList<>();
        for (Libros l : libros) {
            Autor a = l.getAutor();
            if (!idsVistos.contains(a.getId())) {
                idsVistos.add(a.getId());
                a.mostrarInfo();
                System.out.println();
            }
        }
    }
}