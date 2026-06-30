/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author fosue
 */
public class EmpleadoTemporal extends Empleado {
    private double valorHora;
    private int horasTrabajadas;
 
    public EmpleadoTemporal(String nombre, String legajo, double valorHora, int horasTrabajadas) {
        super(nombre, legajo);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
 
    @Override
    public double calcularSueldo() {
        return valorHora * horasTrabajadas;
    }
}
