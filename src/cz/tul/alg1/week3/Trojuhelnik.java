/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week3;

/**
 *
 * @author matej.lukac
 */
public class Trojuhelnik {
    public static void main(String[] args) {
        double Ax,Ay,Bx,By,Cx,Cy;
        Ax = 3;
        Ay = 3;
        Bx = 0;
        By = 2;
        Cx = 6;
        Cy = 2;
        
        double AB,BC,AC,s,S,O;
        AB = Math.sqrt(Math.pow((Ax-Bx),2)) + Math.sqrt(Math.pow((Ay - By),2));
        AC = Math.sqrt(Math.pow((Ax-Cx),2)) + Math.sqrt(Math.pow((Ay - Cy),2));
        BC = Math.sqrt(Math.pow((Bx-Cx),2)) + Math.sqrt(Math.pow((By - Cy),2));
        
        s = (AB + BC + AC)/2;
        S = Math.sqrt(s*(s-AB)*(s-AC)*(s-BC));
        O = AB + BC + AC;
        System.out.println("Obsah trojůhelníku je "+ S);
        System.out.println("Obvod trojůhelníku je "+ O);
    }
    
}
