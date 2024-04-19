/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import javax.swing.JOptionPane;

/**
 *
 * @author jhon
 */
public class ejercicio07_patron_de_asteriscos {
     public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
        String asterisco = "";

        for (int i = 1; i <= numero; i++) {
            asterisco = asterisco + "* ";
            System.out.println(asterisco);
        }
    }
}

