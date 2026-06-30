/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author fosue
 */
public class Animal {
    protected String nombre;
 
    public Animal(String nombre) {
        this.nombre = nombre;
    }
 
    public String hacerSonido() {
        return "...";
    }
 
    public void describirAnimal() {
        System.out.println("Animal : " + nombre);
        System.out.println("Sonido : " + hacerSonido()+"\n");
    }
}
 
// ------ Subclases ------
 

 

 
