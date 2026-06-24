package Ejercicio_06;

public class Reserva {
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva (String fecha, String hora, Mesa mesa){
        this.fecha=fecha;
        this.hora=hora;
        this.mesa=mesa;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void mostrarCliente(){
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre() + " (Teléfono: " + cliente.getTelefono() + ")");
        } else {
            System.out.println("No hay cliente asignado a esta reserva.");
        }
    }
    public void mostrarMesa(){
        if (mesa != null) {
            System.out.println("Mesa: " + mesa.getNumero() + " (Capacidad: " + mesa.getCapacidad() + ")");
        } else {
            System.out.println("No hay mesa asignada a esta reserva.");
        }
    }
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Reserva [fecha=" + fecha + ", hora=" + hora + "]";
    }
    
}
