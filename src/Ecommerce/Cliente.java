/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Cliente implements Notificable {
    
    // Atributos
    private String nombre;

    // Constructor
    public Cliente(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }
    
    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }
    
    // Métodos 
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación para: " + nombre + "\n  Mensaje: " + mensaje);
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre = " + nombre + '}';
    }
      
}
