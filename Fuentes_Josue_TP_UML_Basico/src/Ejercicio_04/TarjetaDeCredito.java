package Ejercicio_04;

public class TarjetaDeCredito {
    private String numero;
    private String fechaDeVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaDeVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.banco = banco;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    public void mostrarBanco() {
        if(banco != null) {
            System.out.println("Banco: " + banco.getNombre() + ", CUIT: " + banco.getCuit());
        } else {
            System.out.println("La tarjeta no tiene un banco asociado.");
            }
    }       
    public void mostrarCliente() {
        if(cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre() + ", DNI: " + cliente.getDni());
        } else {
            System.out.println("La tarjeta no tiene un cliente asociado.");
        }
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }


    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public Banco getBanco() {
        return banco;
    }


    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaDeVencimiento=" + fechaDeVencimiento + "]";
    }
}
