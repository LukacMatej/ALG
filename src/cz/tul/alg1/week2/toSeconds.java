/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week2;

import java.util.Scanner;
        
public class toSeconds {
    public static void main(String[] args) {
        
        final int SECONDS_IN_HOUR = 3600;
        final int SECONDS_IN_MINUTE = 60;
        //in
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte počet hodin");
        int hours = sc.nextInt();
        System.out.println("Zadejte počet minut");
        int minutes = sc.nextInt();
        System.out.println("Zadejte počet sekund");
        int seconds = sc.nextInt();
        
        int time = hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;
         //out
        System.out.println("Čas závodníka v sekundách: " + time);
    }
    
}
