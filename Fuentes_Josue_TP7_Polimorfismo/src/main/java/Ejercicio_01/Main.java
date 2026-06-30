package Ejercicio_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fosue
 */
public class Main {
    public static void main(String[] args) {
 
        Vehiculo v = new Auto("Toyota", "Corolla", 4);
        v.mostrarInfo();   
 
        System.out.println();
 
        if (v instanceof Auto) {
            Auto a = (Auto) v;
            System.out.println("Es un Auto. Downcasting exitoso.");
            a.mostrarInfo();
        }
    }
}