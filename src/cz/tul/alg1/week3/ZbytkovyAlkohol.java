/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week3;
import java.util.Scanner;
/**
 *
 * @author matej.lukac
 */
public class ZbytkovyAlkohol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  objemAlko, alkoProcent, konzumentVaha;
        final double r,beta;
        final double rho = 0.8;
        var gender = "muz";
        if(gender == "muz"){
            r=0.7;
            beta = 0.1;
        }
        else{
            r=0.6;
            beta = 0.085;
        }
        objemAlko = 500;
        alkoProcent = 30;
        konzumentVaha = 80;
        
        double ethanol = (objemAlko * alkoProcent * rho) / 100;
        double promile = ethanol /(konzumentVaha * r);
        double rychlostAlko = konzumentVaha * beta;
        double timeAlkoFree = ethanol / rychlostAlko;
        System.out.println("Promile alkoholu v krvi: "+promile);
        System.out.println("Za "+timeAlkoFree+"h budete bez alkoholu");
        
    }
    
}
