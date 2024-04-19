/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01;

/**
 *
 * @author jhon
 */
public class Ejercicio02_conversion_de_tipos{

    public static void main(String[] args) {
        int numero = 10;

        double numeroDouble = (double) numero;

        String numeroString = String.valueOf(numero);

        System.out.println("El Tipo y valor de las variables son las siguientes: ");
        System.out.println("1. El numero de tipo Entero tiene el valor de: " + numero + ", El tipo de variable es: int");
        System.out.println("2. El numero de tipo Double tiene el valor de: " + numeroDouble + ", El tipo de variable es: double");
        System.out.println("3. El numero de tipo String tiene el valo de: " + numeroString + ", El tipo de variable es: String");
    }
}
