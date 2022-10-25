package cz.tul.alg1.week5;
import java.util.Scanner;
public class Delitele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte kladné číslo, k ukončení programu zadejte číslo nula nebo menší");
        int cislo = sc.nextInt();
        double delitel;
        while (cislo > 0)
        {
            for (int i = 1; i <= cislo; i++){
                if(cislo % i == 0){
                delitel = cislo / i;
                System.out.println(i + " je dělitelem čísla " +cislo );
                }
            }   
            cislo = sc.nextInt();
        }
        System.out.println("konec");
    }
}
