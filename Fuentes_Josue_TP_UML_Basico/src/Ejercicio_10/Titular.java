package Ejercicio_10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria!=null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }
    public void mostrarCuentaBancaria() {
        if(cuentaBancaria != null) {
            System.out.println("Cuenta Bancaria: " + cuentaBancaria.getCbu() + ", Saldo: " + cuentaBancaria.getSaldo());
        } else {
            System.out.println("No hay cuenta bancaria asignada a este titular.");
        }
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
    
}
