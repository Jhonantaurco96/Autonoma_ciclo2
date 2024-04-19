/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhon
 */
public class ejercico06_contador_de_digitos {
    
    public static void main(String[] args) {
      try {
            int numeroEntero = Integer.parseInt(JOptionPane.showInputDialog("ingresa numero entero:"));
            int cantidadDeDigitos = Integer.toString(numeroEntero).length();
   

            System.out.println("Numero ingresado: " + numeroEntero);
            System.out.println("Cantidad de digitos: " + cantidadDeDigitos);
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("El valor ingresado no es un numero");
        }
    }
}