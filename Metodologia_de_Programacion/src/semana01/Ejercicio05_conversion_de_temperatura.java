/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio05_conversion_de_temperatura {

    public static double celsiusAFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la temperatura en grados Celsius: ");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = celsiusAFahrenheit(celsius);
            
            System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        }
    }
}
