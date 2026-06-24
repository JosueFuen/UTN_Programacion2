package Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", 1000, "ABC123", "2024-06-01");
        Titular titular1 = new Titular("Josue Fuentes", "12345678");

        cuenta1.setTitular(titular1);

        System.out.println(cuenta1);
        cuenta1.mostrarTitular();
        cuenta1.mostrarClaveSeguridad();

        System.out.println(titular1);
        titular1.mostrarCuentaBancaria();
    }
    
}
