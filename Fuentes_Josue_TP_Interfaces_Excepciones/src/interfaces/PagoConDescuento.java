/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author fosue
 */
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto, double porcentaje);
}
