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
public class vlajka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte šírku vlajky");
        int sirka = sc.nextInt();
        double vyska = (sirka*2)/3;
        System.out.println(vyska);
        for(int i = 0; i <= vyska/2;i++ ){
            if(vyska%2==0){
                for(int y = 1; y <= i;y++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else{
                for(int y = 0; y <= i;y++){
                    System.out.print("*");
                }
                System.out.print("\n");}
        }
        //SPODNÍ ČÁST
        for(int i = 1; i <= vyska/2;i++ ){
            for(double y = (vyska/2)-i; y >= 0;y--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
