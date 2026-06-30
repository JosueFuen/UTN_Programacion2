/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author fosue
 */
public class Libros {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
 
    public Libros(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
 
    public String getIsbn() { 
        return isbn; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public int getAnioPublicacion() { 
        return anioPublicacion; 
    }
    public Autor getAutor() { 
        return autor; 
    }
 
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Titulo: " + titulo + " | Anio: " + anioPublicacion + " | Autor: " + autor.getNombre());
    }
 
    @Override
    public String toString() {
        return "Libro{isbn='" + isbn + "', titulo='" + titulo + "', anio=" + anioPublicacion
                + ", autor=" + autor.getNombre() + "}";
    }
}