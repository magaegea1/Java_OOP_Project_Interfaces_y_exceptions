/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.edad;

import Excepciones.edad.EdadInvalidaException;

/**
 *
 * @author magae
 */
public class PersonaDePrueba {
    //Clase para probar la Excepción hecha EdadInvalidaException
    
    //Atributos
    private String nombre;
    private int edad;

    // Constructor que valida nombre y edad, lanzando excepciones personalizadas

    public PersonaDePrueba(String nombre, int edad) throws EdadInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe ser un número entero entre 0 y 120");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }    
}
