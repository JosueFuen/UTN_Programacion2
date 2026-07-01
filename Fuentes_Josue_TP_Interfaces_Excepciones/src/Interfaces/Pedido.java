/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fosue
 */
public class Pedido implements Pagable {

    public enum Estado { PENDIENTE, CONFIRMADO, ENVIADO, ENTREGADO, CANCELADO }

    private int           numero;
    private List<Producto> productos;
    private Cliente       cliente;
    private Estado        estado;

    public Pedido(int numero, Cliente cliente) {
        this.numero    = numero;
        this.cliente   = cliente;
        this.productos = new ArrayList<>();
        this.estado    = Estado.PENDIENTE;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("Su pedido " + numero + " cambio a: " + nuevoEstado);
    }

    public void mostrarDetalle() {
        System.out.println("Pedido " + numero + " | Cliente: " + cliente.getNombre());
        System.out.println("Estado : " + estado);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("TOTAL  : " + calcularTotal()+"\n");
    }
}
