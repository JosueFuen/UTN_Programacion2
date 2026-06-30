/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author fosue
 */

public abstract class Empleado {
    protected String nombre;
    protected String legajo;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public abstract double calcularSueldo();

    public void mostrarInfo() {
        System.out.println("Legajo : " + legajo);
        System.out.println("Nombre : " + nombre);
        System.out.printf( "Sueldo : "+ calcularSueldo()+"\n\n");
    }
}
