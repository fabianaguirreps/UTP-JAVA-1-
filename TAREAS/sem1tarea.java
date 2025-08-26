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
public class sem1tarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del Circulo: ");
        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo con radio " + radio + " es " + area);
    }
}
