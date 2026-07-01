/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author fosue
 */
    public class EdadInvalidaException extends Exception {
    private int edadIngresada;

    public EdadInvalidaException(int edad) {
        super("Edad invalida: " + edad + ". Debe estar entre 0 y 120.");
        this.edadIngresada = edad;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }
}
