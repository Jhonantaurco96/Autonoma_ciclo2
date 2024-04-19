/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jhon
 */
public class ejercicio_pares {
  
    public static void main(String[] args) {

    int ultimoNumero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ultimo nuemero"));
    int sumatotalpares = 0;
    
    for (int i = 1; i <= ultimoNumero ;i++){
        System.out.println("imprimiendo : " + i);
    }
  }
}

