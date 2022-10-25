/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week5;
import java.util.Scanner;
/**
 *
 * @author matej.lukac
 */
public class ZadavaniKladnychCisel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte kladné čísla. Při zadaní zaporného nebo nulového čísla ukončíte zadávání.");
        int pocet;
        double cislo,soucet,prumer;
        soucet = 0;
        pocet = 0;
        prumer = 0;
        cislo = sc.nextDouble();
        while (cislo>0){
            soucet += cislo;
            pocet++;
            cislo = sc.nextDouble();
            
        }
        prumer = soucet / pocet;
        if(cislo <= 0)
            prumer = 0;
        System.out.println("Součet čísel je " + soucet);
        System.out.println("Počet čísel je " + pocet);
        System.out.println("Průměr čísel je " + prumer);
    }
    
}
