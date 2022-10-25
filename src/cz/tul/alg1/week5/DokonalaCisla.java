/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week5;
import java.util.Scanner;
        
public class DokonalaCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo;
        System.out.println("Zadejte kladné číslo, nulou a menšími čísly ukončíte program");
        cislo = sc.nextInt();
        int soucet = 0;
        while (cislo > 0){
            for (int i = 1; i < cislo; i++){
                if(cislo % i == 0){
                    soucet += i;
                }
            }
            if(soucet == cislo)
                System.out.println(cislo + " je číslo dokonalé \n");
            else
                System.out.println(cislo + " není číslo dokonalé \n");
            soucet = 0;
            cislo = sc.nextInt();
        }
    }
}
