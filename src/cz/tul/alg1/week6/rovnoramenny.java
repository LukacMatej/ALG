/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week6;

import java.util.Scanner;

/**
 *
 * @author matej.lukac
 */
public class rovnoramenny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte velikost strany trojuhelnika");
        int N = sc.nextInt();
        for(int i = 1;i <= N ;i++){
            for(int y = N-i; y > 0; y--){
                System.out.print(" ");
            }
            for(int x = 1; x <= i; x++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
