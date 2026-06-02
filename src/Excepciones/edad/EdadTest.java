/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.edad;

/**
 *
 * @author magae
 */
public class EdadTest {
    public static void main(String[] args) {
        probarPersona("Blanca Nieves", 58);
        probarPersona("Peter Pan", -5);
        probarPersona("Pinocho", 150);
        probarPersona("Caperucita", 0);
        probarPersona("Lara Croft", 120);
        
        // Casos opcionales para probar nombre inválido
        probarPersona("", 30);
        probarPersona("    ", 70);

        
    }

    private static void probarPersona(String nombre, int edad) {
        try {
            PersonaDePrueba p = new PersonaDePrueba(nombre, edad);
            System.out.println("Persona creada correctamente: " + p.getNombre() + " (" + p.getEdad() + ")");
        } catch (EdadInvalidaException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
        
     
