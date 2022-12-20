/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week8;

/**
 *
 * @author matej.lukac
 */
public final class ArrayTools {
    private ArrayTools(){
        
    }
    
    public static int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
    public static void print(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length-1]+ "]");
    }
    
    
    
    //testing main
    public static void main(String[] args) {
        int[] b = {4,8,3,1};
        int sum = sumArray(b);
        System.out.println(sum);
        print(b);
    }
    
    
}
