/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.conversion;

import Excepciones.conversion.ConversionCadena;
import java.util.Scanner;

/**
 *
 * @author magae
 */
public class ConversionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversionCadena convertir = new ConversionCadena();
        boolean valido = false;
        
        while (!valido){
            try {
                System.out.println("Ingrese un número entero: ");
                String cadena = sc.nextLine();
                int numero = convertir.convertirCadena(cadena);
                System.out.println("El número entero ingresado es: " + numero);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error - Ingrese un número entero válido");
            }
        }
        
        sc.close();
    }
}