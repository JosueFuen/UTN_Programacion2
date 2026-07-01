/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fosue
 */
public class TryWithResources {

    public static void main(String[] args) {
        String[] archivos = { "datos.txt", "no_existe.txt" };

        for (String nombreArchivo : archivos) {
            try (BufferedReader br =
                    new BufferedReader(new FileReader(nombreArchivo))) {

                System.out.println("Leyendo '" + nombreArchivo + "':");
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println("  " + linea);
                }

            } catch (FileNotFoundException e) {
                System.out.println("[ERROR] Archivo no encontrado: " + nombreArchivo);

            } catch (IOException e) {
                System.out.println("[ERROR] Error de E/S: " + e.getMessage());
            }
        }
    }
}
