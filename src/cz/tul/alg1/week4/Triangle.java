/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week4;

/**
 *
 * @author matej.lukac
 */
public class Triangle {
    public static void main(String[] args) {
        //IN
        int a,b,c;
        a=5;
        b=10;
        c=12;
        boolean exist=false;
        if (!(a<=0 || b<=0 || c<=0))
            exist = ((a+b)>c) && (Math.abs(a-b)<c);
        //COM
        /*
        if(((a+b)>c) && (Math.abs(a-b)<c))
            System.out.println("Trojúhelník jde sestrojit");
        else
            System.out.println("Trojúhelník nejde sestrojit");
            */
        System.out.println(exist);
    }
    
}
