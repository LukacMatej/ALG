/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week3;

import java.util.Locale;

/**
 *
 * @author matej.lukac
 */
public class VypocetRychlostiVUseku {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        double rychlost, limit;
        double lenght, time = 0;
        limit = 50;
        lenght = 300;
        double timeStart[] = {4,30,8};
        double timeEnd[] = {5,20,30};
        time += timeStart[0]*3600 + timeStart[1] * 60 + timeStart[2];
        time = (timeEnd[0] * 3600 + timeEnd[1] * 60 + timeEnd[2]) - time;
        System.out.println(time);
        time = time/3600;
        
        
        rychlost = lenght/time;
        if(limit<rychlost)
            System.out.println("Řidič vozidla překročil maximální rychlost v úseku " + limit + "km/h");
        else
            System.out.println("Řidič vozidla nepřekročil maximální rychlost v úseku " + limit + "km/h");
        System.out.println("Průměrná rychlost v úseku je " + rychlost);
        
    }
    
}
