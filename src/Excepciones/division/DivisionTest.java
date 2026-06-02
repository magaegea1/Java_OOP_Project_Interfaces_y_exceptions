/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.division;

import Excepciones.division.DivisionSegura;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author magae
 */
public class DivisionTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DivisionSegura div = new DivisionSegura();
        
        boolean valido = false;
        
        while (!valido){
            try {
                System.out.println("Ingrese el dividendo");
                String input1 = sc.nextLine();
                input1 = input1.replace(",", "."); 
                double dividendo = Double.parseDouble(input1);
                
                System.out.println("Ingrese el divisor");
                String input2 = sc.nextLine();
                input2 = input2.replace(",", "."); 
                double divisor = Double.parseDouble(input2);
                
                double resultado = div.dividir(dividendo, divisor);
                System.out.println("El resultado de dividir " 
                        + dividendo + '/' + divisor 
                        + " es: " + resultado);
                
                valido = true;
                
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                
            } catch (NumberFormatException e) {
                System.out.println("Error - Ingrese números válidos");
            }
        }
        
        sc.close();
    }    
}
