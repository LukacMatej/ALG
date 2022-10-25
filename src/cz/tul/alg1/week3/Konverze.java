/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week3;

public class Konverze {

    public static void main(String[] args) {
        //IN
        double x,y,r,fi;
        x = 5;
        y = 8;
        //COM
        r = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        fi = Math.atan(y/x);
        /*
        x = r* Math.cos(fi);
        y = r* Math.sin(fi);
        */
        //OUT
        System.out.println("Nové polární souřadnice X:" + r + " Y:" + fi);
    }

}
