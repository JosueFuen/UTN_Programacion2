/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author fosue
 */
public class Main {
    public static void main(String[] args) {
 
        Universidad uni = new Universidad("UTN ");
 
        Profesor prof1 = new Profesor("P01", "Ana Gomez",    "Programacion");
        Profesor prof2 = new Profesor("P02", "Luis Martinez","Bases de Datos");
        Profesor prof3 = new Profesor("P03", "Marta Lopez",  "Ingles");
 
        Curso c1 = new Curso("C01", "Programacion I");
        Curso c2 = new Curso("C02", "Programacion II");
        Curso c3 = new Curso("C03", "Bases de Datos I");
        Curso c4 = new Curso("C04", "Ingles");
        Curso c5 = new Curso("C05", "Laboratorio de Redes");
 
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
 
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
 
        uni.asignarProfesorACurso("C01", "P01");
        uni.asignarProfesorACurso("C02", "P01");
        uni.asignarProfesorACurso("C03", "P02");
        uni.asignarProfesorACurso("C04", "P03");
        uni.asignarProfesorACurso("C05", "P03");
 
        System.out.println();
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();
 
        System.out.println("");
        uni.asignarProfesorACurso("C02", "P02");
 
        System.out.println("\nVerificacion - Cursos de Ana Gomez:");
        prof1.listarCursos();
        System.out.println("Verificacion - Cursos de Luis Martinez:");
        prof2.listarCursos();
 
        System.out.println("");
        uni.eliminarCurso("C04");
        System.out.println("Cursos de Marta Lopez despues de eliminar C04:");
        prof3.listarCursos();
 
        System.out.println("");
        uni.eliminarProfesor("P02");
        System.out.println("Profesor de C02 luego de eliminar a Luis:");
        c2.mostrarInfo();
        System.out.println("Profesor de C03 luego de eliminar a Luis:");
        c3.mostrarInfo();
 

        System.out.println();
        uni.reporteCursosPorProfesor();
    }
}