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
public class Main {
    public static void main(String[] args) {

        // --- Crear cliente ---
        Cliente cliente = new Cliente("Rumi");

        // --- Crear productos ---
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Mouse", 5000));
        productos.add(new Producto("Teclado", 12000));

        // --- Crear pedido ---
        Pedido pedido = new Pedido(productos, cliente);

        // Mostrar pedido inicial
        System.out.println(pedido);

        // --- Cambiar estado del pedido ---
        pedido.cambiarEstado(EstadoPedido.PROCESANDO);

        // --- Calcular total del pedido ---
        double total = pedido.calcularTotal();

        // --- Pago con tarjeta ---
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuentoT = tarjeta.aplicarDescuento(total, 10);
        tarjeta.procesarPago(totalConDescuentoT);

        // --- Pago con PayPal ---
        PayPal paypal = new PayPal();
        double totalConDescuentoPP = paypal.aplicarDescuento(total, 15);
        paypal.procesarPago(totalConDescuentoPP);

        // --- Cambiar estado final ---
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
    }
}
