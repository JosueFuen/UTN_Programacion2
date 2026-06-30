/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author fosue
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double presentismo;
 
    public EmpleadoPlanta(String nombre, String legajo, double sueldoBase, double presentismo) {
        super(nombre, legajo);
        this.sueldoBase = sueldoBase;
        this.presentismo = presentismo;
    }
 
    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * presentismo);
    }
}
