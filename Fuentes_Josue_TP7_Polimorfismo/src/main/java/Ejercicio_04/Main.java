/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fosue
 */

 
public class Main {
    public static void main(String[] args) {
 
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Duko"));
        animales.add(new Gato("Luna"));
 
        for (Animal a : animales) {
            a.describirAnimal();  
        }
 

        for (Animal a : animales) {
            if (a instanceof Perro) {
                Perro p = (Perro) a;
                System.out.println(p.nombre + " dice: " + p.hacerSonido());
            }
        }
    }
}