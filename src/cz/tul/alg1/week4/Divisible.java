/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week4;

/**
 *
 * @author matej.lukac
 */
public class Divisible {
    public static void main(String[] args) {
        //IN
        int a=10;
        int b=6;
        boolean divisible;
        //COM
        //boolean divisible = a % b == 0;
        /*
        if(a%b==0)
            System.out.println("Čísla jsou dělitelná");
        else
            System.out.println("Čísla nejsou dělitelná");
        */
        divisible = (a % b == 0);
        
        //OUT
        System.out.println(divisible);
        
    }
    
}
