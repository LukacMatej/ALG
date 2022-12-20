/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author matej.lukac
 */
public class HadaciHra {
    static Scanner sc = new Scanner(System.in);
    static int lowerBound = 1;
    static int upperBound = 100;
    
    
    public static void main(String[] args) {
        int choice;
        boolean end = false;
        
        do{
        displayMenu();
        choice = sc.nextInt();
        switch(choice){
            case 1: ComputerGuesses(); break;
            case 2: userGuesses(); break;
            case 0: end = true; break;
            default: System.out.println("Nevalidní volba");
        }
        }
        while(!end);
    }

    private static void displayMenu() {
        System.out.println("**************************");
        System.out.println("* Hra: Hadej cislo       *");
        System.out.println("* 0. Konec               *");
        System.out.println("* 1. Hada pocitac        *");
        System.out.println("* 2. Hada uzivatel       *");
        System.out.println("**************************");
    }

    private static void ComputerGuesses() {
        int min  = lowerBound;
        int max = upperBound;
        int guess;
        int userAnswer;
        boolean end = false;
        
        System.out.println("Uživateli mysli si číslo v rozsahu od " + lowerBound + " do "+ upperBound);
        
        do{
            guess = (min + max)/2;
        System.out.println("Uživatel, myslíš si číslo " + guess + "?");
        System.out.println("Uživateli odpověz: -1 je menší, 1 je vetší, 0 trefa");
        
        userAnswer = sc.nextInt();
            switch (userAnswer) {
                case -1:
                    max = guess -1;
                    break;
                case 1:
                    min = guess + 1;
                    break;
                case 0:
                    end = true;
                    System.out.println("Trefa");
                    break;       
            }
        }
        while(!end);
    }

    private static void userGuesses() {
        ThreadLocalRandom gen = ThreadLocalRandom.current();
        int secretNumber = gen.nextInt(lowerBound,upperBound + 1);
        boolean end = false;
        
        System.out.println("Myslím si číslo v rozsahu od " + lowerBound + " do " + upperBound);
        do{
        System.out.println("Hádej číslo");
        int userGuess = sc.nextInt();
        if(secretNumber == userGuess){
            System.out.println("Trefa");
            //else if ()
        }
        
        }
        while(!end);
    }
    
}
