package cz.tul.alg1.week5;
import java.util.Scanner;
public class Prvocisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte čísla, zadání 0 nebo menšího čísla ukončíte program");
        int delitele;
        delitele = 0;
        int cislo = sc.nextInt();
        while (cislo > 0){
                for(int i = 1; i <= cislo; i++){
                    if(cislo % i == 0){
                        delitele++;
                    }
                }
                System.out.println("Počet dělitelů je "+delitele);
                if(delitele == 2)
                    System.out.println("Číslo " + cislo + " je prvočíslo");
                else
                    System.out.println("Číslo " + cislo + " není prvočíslo");
            delitele = 0;
            System.out.println("");
            cislo = sc.nextInt();
        }
    }
}
