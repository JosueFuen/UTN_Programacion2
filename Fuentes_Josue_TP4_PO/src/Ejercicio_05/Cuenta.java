package Ejercicio_05;

public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero=100;
    private static int totalCuentas;
    
    
    public Cuenta( String titular, double saldoInicial) {
        setSaldo(saldoInicial);
        setTitular(titular);
        this.numero=++ultimoNumero;
        totalCuentas++;
    }
    
    public Cuenta(String titular){
        this(titular, 0.0);
    }

    public double consultarSaldo(){
        System.out.println("Su saldo en pesos es: $"+getSaldo());
        return getSaldo();
    }
    public double consultarSaldo(double cotizacionDolar){
        System.out.println("Su saldo en dolares es: $"+getSaldo()/cotizacionDolar);
        return getSaldo()/cotizacionDolar;
    }
    public void depositar(double deposito){
        if (deposito>0){
        saldo+=deposito;
        System.out.println("Deposito: $"+deposito+" - -  Saldo actual: $"+saldo);
        }

    }
    public void extraer(double extraccion){
        if(extraccion>0 && (saldo-extraccion)>=0){
            saldo-=extraccion;
            System.out.println("Extraccion: $"+extraccion+" - -  Saldo actual: $"+saldo);
        } else if((saldo-extraccion)<0){
            System.out.println("No tiene saldo suficiente en su cuenta para realizar la extraccion.");
        }
    }
    public static int mostrarTotalCuentas(){
        return getTotalCuentas();
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        }
    }

    public void setSaldo(double saldo) {
        if(saldo>=0){
            this.saldo = saldo;
        }
        
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public static int getUltimoNumero() {
        return ultimoNumero;
    }

    public static int getTotalCuentas() {
        System.out.println("Total de cuentas: "+totalCuentas);
        return totalCuentas;
    }

    @Override
    public String toString() {
        return "Cuenta \nTitular: "+titular+"\nSaldo: " + String.format("%.2f", saldo) +  "\n------------------";
    }

}
