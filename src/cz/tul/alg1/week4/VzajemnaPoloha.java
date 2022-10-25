/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week4;

/**
 *
 * @author matej.lukac
 */
public class VzajemnaPoloha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IN
        double x,y,Sx,Sy,r;
        x=3;
        y=2;
        Sx=2;
        Sy=2;
        r=1;
        int vysledek;
        final int IN = 1;//v kružnici
        final int ON = 2;//na kružnici
        final int OUT = 3;//mimo kružnici
        final double PRECISION = 0.0001;
        //COM
        double delkaX = x-Sx;
        double delkaY = y-Sy;
        double vzdalenostMeziBody = Math.sqrt(Math.pow(delkaX, 2) - Math.pow(delkaY,2));
        
        if (Math.abs(r - vzdalenostMeziBody)< PRECISION)
            vysledek = ON;
        else if(vzdalenostMeziBody < r)
            vysledek = IN;
        else 
            vysledek = OUT;
        //OUT
        switch (vysledek){
                case IN -> System.out.println("Bod je v kružnici");
                case ON -> System.out.println("Bod je na kružnici");
                case OUT -> System.out.println("Bod je mimo kružnici");
        }
    }
    
}
