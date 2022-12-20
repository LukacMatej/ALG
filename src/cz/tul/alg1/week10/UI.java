/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week10;

/**
 *
 * @author matej.lukac
 */
public class UI {
    public static void print(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%6.2f", a[i][j]);
            }
            System.out.println("");
            
        }
    }

    
}
