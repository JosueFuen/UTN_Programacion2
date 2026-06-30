/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fosue
 */


public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Maria",  "E001", 150000, 0.10));
        empleados.add(new EmpleadoTemporal("Juan",  "E002", 2500, 80));
        empleados.add(new EmpleadoPlanta("Laura",  "E003", 200000, 0.10));
        empleados.add(new EmpleadoTemporal("Carlos", "E004", 3000, 60));

        for (Empleado e : empleados) {

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: PLANTA");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: TEMPORAL");
            }
            e.mostrarInfo();
        }

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoPlanta) {
                EmpleadoPlanta ep = (EmpleadoPlanta) e; 
                System.out.println(ep.nombre + " -> sueldo con presentismo: $" +  ep.calcularSueldo());
            }
        }
    }
}
