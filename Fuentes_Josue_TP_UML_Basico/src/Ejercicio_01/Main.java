package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
    
        
        Titular titular=new Titular("Josue","40800700");
        Pasaporte pasaporte=new Pasaporte("1122459", "02-01-2022","foto.jpg", "jpg");
        titular.setPasaporte(pasaporte);
        System.out.println(titular);
        System.out.println(pasaporte);
    }
    
}
