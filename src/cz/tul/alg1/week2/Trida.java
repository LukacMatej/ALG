package cz.tul.alg1.week2;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Trida {

    public static void main(String[] args) {
        String[] pole = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte hodnoty ve formátu jméno rok třída");
        var input = sc.next();
        pole = input.split(" ");
        int yearNow = LocalDateTime.now().getYear();
        int yearCount = yearNow - Integer.valueOf(pole[1]);
        int classN = yearCount - 6;
        

        System.out.println("Dite " + pole[0] + " ma " + yearCount + " let a chodi do " + classN + pole[2]);
    }
}
    
