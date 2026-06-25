package Ejercicio_12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente= new Contribuyente("Josue"," 12-12345678-1");
        Impuesto impuesto= new Impuesto(20);
        impuesto.setContribuyente(contribuyente);
        Calculadora calculadora=new Calculadora();

        calculadora.calcular(impuesto);

    }
}
