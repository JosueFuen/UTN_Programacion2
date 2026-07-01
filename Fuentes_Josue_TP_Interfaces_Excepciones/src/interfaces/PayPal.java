/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author fosue
 */
public class PayPal implements PagoConDescuento {
    private String cuentaEmail;

    public PayPal(String cuentaEmail) {
        this.cuentaEmail = cuentaEmail;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $"+monto+" desde la cuenta "+ cuentaEmail);
    }

    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        double descuento  = monto * porcentaje;
        double montoFinal = monto - descuento;
        System.out.println("Descuento de " + porcentaje*100 + "% aplicado: $" + descuento + " | Total: $" + montoFinal);
        return montoFinal;

    }
}
