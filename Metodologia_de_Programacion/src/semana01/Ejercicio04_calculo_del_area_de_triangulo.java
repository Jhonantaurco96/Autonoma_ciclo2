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
public class Ejercicio04_calculo_del_area_de_triangulo {

    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la base del triangulo: ");
            double base = scanner.nextDouble();

            System.out.print("Ingrese la altura del triangulo: ");
            double altura = scanner.nextDouble();

            double area = calcularAreaTriangulo(base, altura);

            System.out.println("El area del triangulo es: " + area);

        } catch (Exception e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
    }
}
