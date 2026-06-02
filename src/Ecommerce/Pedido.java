/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecommerce;

import java.util.ArrayList;

/**
 *
 * @author magae
 */
public class Pedido implements Pagable {

    private ArrayList<Producto> productos;
    private Cliente cliente;
    private EstadoPedido estado;

    public Pedido(ArrayList<Producto> productos, Cliente cliente) {
        if (productos == null || productos.isEmpty()) {
            throw new IllegalArgumentException("El pedido debe tener al menos un producto");
        }
        if (cliente == null) {
            throw new IllegalArgumentException("El pedido debe tener un cliente asociado");
        }

        this.productos = productos;
        this.cliente = cliente;
        this.estado = EstadoPedido.CREADO; // estado inicial
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;

        // Notificar al cliente
        cliente.notificar("El pedido cambió de estado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido{\n");

        for (Producto producto : productos) {
            sb.append("  ").append(producto).append("\n");
        }

        sb.append("Estado = ").append(estado).append("\n");
        sb.append("Total = $").append(calcularTotal()).append("\n");
        sb.append("Cliente = ").append(cliente.getNombre()).append("\n");
        sb.append("}");

        return sb.toString();
    }
}