/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author fosue
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular       = titular;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cargo de $"+ monto +" a la tarjeta " + numeroTarjeta + " del titular "+ titular);
    }

    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        double descuento  = monto * porcentaje;
        double montoFinal = monto - descuento;
        System.out.println("Descuento de "+ porcentaje*100 +"% aplicado: $"+ descuento+" | Total: $" + montoFinal+ "\n");
        return montoFinal;
    }
}
