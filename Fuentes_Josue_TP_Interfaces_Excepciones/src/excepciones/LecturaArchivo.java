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


public class LecturaArchivo {

    public static void main(String[] args) {
        String[] archivos = { "datos.txt", "archivo_inexistente.txt" };

        for (String nombreArchivo : archivos) {
            try {
                FileReader     fr = new FileReader(nombreArchivo);
                BufferedReader br = new BufferedReader(fr);

                System.out.println("Contenido de '" + nombreArchivo + "':");
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println("  " + linea);
                }
                br.close();

            } catch (FileNotFoundException e) {
                System.out.println("[ERROR] Archivo no encontrado: " + nombreArchivo);

            } catch (IOException e) {
                System.out.println("[ERROR] Error de lectura: " + e.getMessage());
            }
        }
    }
}