/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author fosue
 */

public class ExcepcionPersonalizada {

    public static void main(String[] args) {
        int[] edades = { 25, -5, 150, 0, 120 };

        for (int edad : edades) {
            try {
                validarEdad(edad);
                System.out.println("Edad " + edad + " -> valida.");

            } catch (EdadInvalidaException e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
        }
    }

    static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad);
        }
    }
}
