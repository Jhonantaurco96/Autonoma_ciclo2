/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class ejercico06_contador_de_digitos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El numero ingresado no es positivo.");
            return;
        }
        
        int contador = 0;
        int numTemp = numero;
        while (numTemp != 0) {
            numTemp /= 10;
            contador++;
        }

        System.out.println("El numero " + numero + " tiene " + contador + " dígitos.");
    }
}

