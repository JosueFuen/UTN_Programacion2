package Ejercicio_12;

public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Calculando impuesto por un monto de: " + impuesto.getMonto());
        } else {
            System.out.println("No hay impuesto para calcular.");
        }
    }
}