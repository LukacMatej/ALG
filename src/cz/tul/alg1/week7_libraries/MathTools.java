/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.alg1.week7_libraries;

/**
 *Library class with methods operating on natural numbers
 * @author matej.lukac
 */
public class MathTools {
    private MathTools(){
        
    }
    /**
     * Tests if the given number is perfect, it means the sum of 
     * its divisors equals to the number
     * @param number
     * @return true if is perfect, false otherwise
     */
    public static boolean IsPerfect(int number){
        int soucet = 0;
        boolean result=false;
        while (number > 1){
            for (int i = 1; i < number; i++){
                if(number % i == 0){
                    soucet += i;
                }
            }
            if(soucet == number)
                result = true;
            else
                result = false;
        }
        return result;
    }
    
    
    /**
     * 
     * @param x in radians
     * @param precision
     * @return 
     */
    public static double cos(double x, double precision){
        double vypocet = 1;
        double cislo;
        int operace = -1;        
        for(double n = 1; n < 100;n+=2){
            cislo = (Math.pow(x,n)/factorial(n) * operace);
            if(Math.abs(cislo) < precision)
                break;
            vypocet = vypocet + cislo;
            operace = operace * -1;
        }
        return vypocet;
    }
    
    public static long factorial(double n) {
    long fact = 1;
    for (int i = 2; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
}
    
    public static void main(String[] args) {
        double x = 7;
        double precision = 0.0001f;
        double result = MathTools.cos(x, precision);
        System.out.println(Math.round(result));
  
    }
}
