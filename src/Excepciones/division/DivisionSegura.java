/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.division;

/**
 *
 * @author magae
 * 
 * Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.  
 * 
 */
public class DivisionSegura {
    public double dividir(double dividendo, double divisor){
        if (divisor == 0){
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return dividendo/divisor;
    }
}
