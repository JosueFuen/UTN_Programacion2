/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author fosue
 */
public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Teclado",8500.00);
        Producto p2 = new Producto("Mouse", 4200.00);
        Producto p3 = new Producto("Monitor", 55000.00);


        Cliente cliente = new Cliente("Josue", "josue@gmail.com");


        Pedido pedido = new Pedido(1001, cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        pedido.mostrarDetalle();

        pedido.cambiarEstado(Pedido.Estado.CONFIRMADO);
        pedido.cambiarEstado(Pedido.Estado.ENVIADO);
        pedido.cambiarEstado(Pedido.Estado.ENTREGADO);

        TarjetaCredito tarjeta = new TarjetaCredito("1234567890112", "Josue");
        double totalConDesc = tarjeta.aplicarDescuento(pedido.calcularTotal(), 0.10);
        tarjeta.procesarPago(totalConDesc);

        PayPal paypal = new PayPal("josue@gmail.com");
        double totalPaypal = paypal.aplicarDescuento(pedido.calcularTotal(), 0.05);
        paypal.procesarPago(totalPaypal);

        Pago[] mediosDePago = { tarjeta, paypal };
        for (Pago medio : mediosDePago) {
            medio.procesarPago(pedido.calcularTotal());

        }
    }
}
