package cz.tul.alg1.week9;
import java.util.Scanner;
import java.util.Random;

public class NahodnaPermutaceDoN {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a[];
        System.out.println("K ukončení programu napište 0");
        do {
        System.out.println("Zadejte kládné číslo n menší než 1000");
        n = sc.nextInt();
        a = GenerateRandomPermutation(n);
        print(a);
        }
        while (n > 0);
    }
    //Yates metoda
    public static int[] GenerateRandomPermutation(int n){
        Random rand = new Random();
        int randomIndex;
        int swap;
        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
            
        }
        for (int i = a.length - 1; i > 0; i--){
            randomIndex = rand.nextInt(0,i + 1);
            swap = a[randomIndex];
            a[randomIndex] = a[i];
            a[i] = swap;
        }
        return a;
    }
    
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
}
