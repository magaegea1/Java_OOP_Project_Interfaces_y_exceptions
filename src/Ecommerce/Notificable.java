/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ecommerce;

/**
 *
 * @author magae
 * 
 * Crear una interfaz Notificable para notificar cambios de estado. La clase 
 * Cliente implementa dicha interfaz y Pedido debe notificarlo al cambiar de 
 * estado.  
 */
public interface Notificable {    
    // Métodos 
    void notificar(String mensaje);
    
}
