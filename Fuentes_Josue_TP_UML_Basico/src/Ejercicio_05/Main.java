package Ejercicio_05;

public class Main {
    static public void main(String[] args){
        Computadora computadora1=new Computadora("HP", "123456", "Z490", "Intel");
        Propietario propietario1=new Propietario("Josue Fuentes", "12345678");
        computadora1.setPropietario(propietario1);
        
        System.out.println(computadora1);
        computadora1.mostrarPropietario();
        computadora1.mostrarPlacaMadre();
    }
}