/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week8;

import java.util.Scanner;

/**
 *
 * @author matej.lukac
 */
public class UI {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadej délku pole");
        int lenght = sc.nextInt();
        System.out.println("Zadej hodnoty");
        int[] yourArray = readArray(lenght);
        ArrayTools.print(yourArray);
        int sum = ArrayTools.sumArray(yourArray);
        System.out.println(sum);
    }
    
    public static int[] readArray(int n){
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
