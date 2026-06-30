/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fosue
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
 
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
 
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
        System.out.println("Profesor '" + p.getNombre() + "' agregado.");
    }
 
    public void agregarCurso(Curso c) {
        cursos.add(c);
        System.out.println("Curso '" + c.getNombre() + "' agregado.");
    }
 

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
 
        if (curso == null) {
            System.out.println("No se encontro el curso: " + codigoCurso);
            return;
        }
        if (profesor == null) {
            System.out.println("No se encontro el profesor: " + idProfesor);
            return;
        }
        curso.setProfesor(profesor);
        System.out.println("Profesor '" + profesor.getNombre()
                + "' asignado al curso '" + curso.getNombre() + "'.");
    }
 
    public void listarProfesores() {
        System.out.println("=== PROFESORES DE " + nombre.toUpperCase() + " ===");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }
 
    public void listarCursos() {
        System.out.println("=== CURSOS DE " + nombre.toUpperCase() + " ===");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
 
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }
 
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }
 

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null); 
            cursos.remove(c);
            System.out.println("Curso '" + codigo + "' eliminado.");
        } else {
            System.out.println("Curso no encontrado: " + codigo);
        }
    }
 

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            List<Curso> copia = new ArrayList<>(p.getCursos());
            for (Curso c : copia) {
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor '" + p.getNombre() + "' eliminado. Sus cursos quedaron sin profesor.");
        } else {
            System.out.println("Profesor no encontrado: " + id);
        }
    }
 

    public void reporteCursosPorProfesor() {
        System.out.println("=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " -> " + p.getCursos().size() + " curso(s)");
        }
        int sinProfesor = 0;
        for (Curso c : cursos) {
            if (c.getProfesor() == null) sinProfesor++;
        }
        if (sinProfesor > 0) {
            System.out.println("(Sin profesor asignado): " + sinProfesor + " curso(s)");
        }
    }
}