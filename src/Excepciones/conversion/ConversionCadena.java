/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.conversion;

/**
 *
 * @author magae
 * 
 * Leer texto del usuario e intentar convertirlo a int. Manejar 
 * NumberFormatException si no es válido. 
 */
public class ConversionCadena {
   public int convertirCadena(String cadena){
       return Integer.parseInt(cadena);
   } 
}
