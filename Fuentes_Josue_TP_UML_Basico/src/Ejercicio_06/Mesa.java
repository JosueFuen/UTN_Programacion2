package Ejercicio_06;

public class Mesa {
    private String numero;
    private int capacidad;
    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    @Override
    public String toString() {
        return "Mesa [numero=" + numero + ", capacidad=" + capacidad + "]";
    }

}
