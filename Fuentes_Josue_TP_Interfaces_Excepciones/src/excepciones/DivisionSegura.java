/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author fosue
 */
public class DivisionSegura {

    public static void main(String[] args) {
        int[] divisores = { 4, 0, -2 };

        for (int divisor : divisores) {
            try {
                int resultado = 100 / divisor;
                System.out.println("100 / " + divisor + " = " + resultado);

            } catch (ArithmeticException e) {
                System.out.println("[ERROR] " + e.getMessage());

            } finally {
                System.out.println("[finally] Intento con divisor=" + divisor + " finalizado.");
            }
        }
    }
}