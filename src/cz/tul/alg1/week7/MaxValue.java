/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week7;

import java.util.Scanner;

/**
 *
 * @author matej.lukac
 */
public class MaxValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max1, max2, numberOfNumbers, inputNumber;
        int max1N = 0;
        int max2N = 0;
        System.out.println("Zadejte počet čísle, které chcete zadat");
        numberOfNumbers = sc.nextInt();
        max1 = -9999;
        max2 = -9999;
        for (int i = 1; i < numberOfNumbers; i++) {
            inputNumber = sc.nextInt();
            if (max1 < inputNumber) {
                max1 = inputNumber;
                max2N = max1N;
                max1N = 0;
            } else if (inputNumber > max2 && max1 > inputNumber) {
                max2 = inputNumber;
                max2N = 1;
            } else if (inputNumber == max1) {
                max1N++;
            } else if (inputNumber == max2) {
                max2N++;
            }

        }
        System.out.println("Největší číslo je " + max1 + " a objevilo se " + max1N);
        System.out.println("Největší číslo je " + max2 + " a objevilo se " + max2N);

    }

}
