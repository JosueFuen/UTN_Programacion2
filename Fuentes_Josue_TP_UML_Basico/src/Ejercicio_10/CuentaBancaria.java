package Ejercicio_10;

public class CuentaBancaria {
    private String cbu;
    private int saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, int saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular!=null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    public void mostrarTitular() {
        if(titular != null) {
            System.out.println("Titular: " + titular.getNombre() + ", DNI: " + titular.getDni());
        } else {
            System.out.println("No hay titular asignado a esta cuenta bancaria.");
        }
    }
    public void mostrarClaveSeguridad() {
        if(claveSeguridad != null) {
            System.out.println("Clave de Seguridad: " + claveSeguridad.getCodigo() + ", Última Modificación: " + claveSeguridad.getUltimaModificacion());
        } else {
            System.out.println("No hay clave de seguridad asignada a esta cuenta bancaria.");
        }
    }
    
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getCbu() {
        return cbu;
    }
    public int getSaldo() {
        return saldo;
    }
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }
    public Titular getTitular() {
        return titular;
    }
    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + "]";
    }
    
}
