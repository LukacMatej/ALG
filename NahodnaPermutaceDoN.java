/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domaciukol;
import java.util.Scanner;
import java.util.Random;
public class NahodnaPermutaceDoN {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a[];
        System.out.println("Zadejte kládné číslo n menší než 1000");
        n = sc.nextInt();
        a = GenerateArray(n);
        print(a);
        
    }

    public static int[] GenerateArray(int n){
        Random rand = new Random();
        int random;
        int swap ;
        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
            
        }
        for (int i = a.length - 1; i > 0; i--){
            random = rand.nextInt(0,i + 1);
            swap = a[random];
            a[random] = a[i];
            a[i] = swap;
        }
        return a;
    }
    
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
