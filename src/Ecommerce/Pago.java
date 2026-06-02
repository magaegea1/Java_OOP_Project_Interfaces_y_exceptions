/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ecommerce;

/**
 *
 * @author magae
 * 
 * Ampliar con interfaces Pago y PagoConDescuento para distintos medios de 
 * pago (TarjetaCredito, PayPal), con métodos procesarPago(double) y 
 * aplicarDescuento(double).  
 * 
 */
public interface Pago {
    void procesarPago(double monto);    
}
