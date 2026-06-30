/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author fosue
 */
public class Main {
    public static void main(String[] args) {

        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 7),
            new Circulo(3),
            new Rectangulo(10, 2)
        };

        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}
