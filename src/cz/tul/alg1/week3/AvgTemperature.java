/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week3;
import java.util.Scanner;
/**
 *
 * @author matej.lukac
 */
public class AvgTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first,second,third;
        System.out.println("Zadejte hodnotu naměřenou v 6 hodin");
        first = sc.nextDouble();
        System.out.println("Zadejte hodnotu naměřenou v 12 hodin");
        second = sc.nextDouble();
        System.out.println("Zadejte hodnotu naměřenou v 18 hodin");
        third = sc.nextDouble();
        
        double avg = (first + second + 2*third) / 4;
        System.out.println("Průměrná teplota je " + avg + "°C");
        
    }
    
}
