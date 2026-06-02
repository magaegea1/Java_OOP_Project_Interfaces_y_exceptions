/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.lecturaArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author magae
 */
public class LecturaArchivo {
        public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Excepciones/tryResources/TextoDePrueba.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
    
}
