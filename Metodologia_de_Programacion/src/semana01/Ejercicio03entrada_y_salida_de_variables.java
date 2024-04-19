/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class Ejercicio03entrada_y_salida_de_variables {

    public static void main(String[] args) {
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Por favor, ingresa tu nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Ahora, ingresa tu edad: ");
                int edad = scanner.nextInt();
                
                System.out.println("Hola " + nombre + ", tienes " + edad + " anios.");
            }

        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
    }
}
