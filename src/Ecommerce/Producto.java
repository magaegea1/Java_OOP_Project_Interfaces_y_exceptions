/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecommerce;

/**
 *
 * @author magae
 */
public class Producto implements Pagable  {
    // Atributos
    private String nombre;
    private double precio;
     
    // Constructor

    public Producto(String nombre, double precio) {
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }        
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }        
        this.precio = precio;
    }
    
    //Métodos
    
    @Override
    public double calcularTotal() {
        return this.precio;
        
    }
    
    @Override
    public String toString() {
        return "Producto{" +
                "Nombre = '" + nombre + '\'' +
                ", precio = $" + precio +
                '}';
    }

 
}
