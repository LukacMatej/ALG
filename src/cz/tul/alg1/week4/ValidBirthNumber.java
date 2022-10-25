/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week4;

/**
 *
 * @author matej.lukac
 */
public class ValidBirthNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IN
        int first,second;
        first = 020426;
        second = 3730;
        long together;
        double zbytek;
        boolean valid;
        //COM
        together = first * 1000 + Math.round(second/10);
        zbytek = together % 11;
        if(zbytek == 0)
            valid = true;
        else if(zbytek == 10 && second % 10 == 0)
            valid = true;
        else if(together % 10 == zbytek)
            valid = true;
        else 
            valid = false;
        
        System.out.println((valid? "je": "není") + " validní");
    }
    
}
