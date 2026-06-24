package Ejercicio_06;

public class Main {
    public static void main(String[] args) {
        Mesa mesa1 = new Mesa("1", 4); 
        Cliente cliente1 = new Cliente("Josue", "123-456-7890");
        Reserva reserva1 = new Reserva("2024-06-15", "19:00", mesa1);
        reserva1.setCliente(cliente1);
        
        System.out.println(reserva1);
        reserva1.mostrarCliente();
        reserva1.mostrarMesa();
        
    }
}
