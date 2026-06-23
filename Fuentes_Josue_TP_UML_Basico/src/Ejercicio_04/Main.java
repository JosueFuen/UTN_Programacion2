package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Central", "30-12345678-9");
        Cliente cliente = new Cliente("Josue", "12345678");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456","01/01/2025", banco);
        tarjeta.setCliente(cliente);

        System.out.println(banco);
        tarjeta.mostrarBanco();
        tarjeta.mostrarCliente();
    }

}
