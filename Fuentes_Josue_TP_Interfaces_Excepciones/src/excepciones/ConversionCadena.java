/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author fosue
 */
public class ConversionCadena {

    public static void main(String[] args) {

        String[] entradas = { "42", "abc", "100", "12.5", "-7" };

        for (String entrada : entradas) {
            try {
                int numero = Integer.parseInt(entrada);
                System.out.println("'" + entrada + "' -> int: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("[ERROR] '" + entrada + "' no es un entero valido.");
            }
        }
    }
}