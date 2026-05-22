package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1= new Cuenta("Josue", 3000000.00);
        System.out.println(cuenta1);

        Cuenta.mostrarTotalCuentas();

        Cuenta cuenta2= new Cuenta("Juan");
        System.out.println(cuenta2);

        cuenta2.depositar(500000.00);
        cuenta2.depositar(-500000.00);
        cuenta2.extraer(5000.00);
        cuenta2.extraer(500000.00);
        cuenta2.extraer(-500.00);
        cuenta2.consultarSaldo();
        cuenta2.consultarSaldo(1380);
        cuenta2.getSaldo();
        System.out.println(cuenta2);
        Cuenta.mostrarTotalCuentas();




    }
}
