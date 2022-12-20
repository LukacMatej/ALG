package cz.tul.alg1.week7_libraries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int hours,minutes,seconds;
        
        System.out.println("Zadejte hodiny");
        hours = sc.nextInt();
        System.out.println("Zadejte minuty");
        minutes = sc.nextInt();
        System.out.println("Zadejte sekundy");
        seconds = sc.nextInt();
        
        int result = DateTimeTools.TimeToSeconds(hours,minutes,seconds);
        System.out.println("Vysledek je: "+ result);*/
        
        double x = Math.PI/2;
        double precision = 0.0001;
        double result = MathTools.cos(x, precision);
        System.out.println(result);
    }
    
}
