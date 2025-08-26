
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FNX
 */
public class sem1dos {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Ingrese la temperatura en grados Celsius: ");
           double celsius = sc.nextDouble();
           double fahrenheit = (celsius * 9.0 / 5.0)+ 32;
           System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F");
       }
    }
}
