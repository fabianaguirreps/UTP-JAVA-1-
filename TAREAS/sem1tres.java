/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp;

import java.util.Scanner;

/**
 *
 * @author FNX
 */
public class sem1tres {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double num3 = sc.nextDouble();
        double promedio = (num1 + num2 + num3)/3;
        System.out.println("El promedio de los 3 números es: " + promedio);
    }
}
