/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week9;

/**
 *
 * @author matej.lukac
 */
public class ArrayTools {
    private ArrayTools(){
        
    }
    
    public static boolean IsArrayAscending(int[] ar){
        for(int i = 1; i < ar.length ; i++)
        {
            if (ar[i-1] > ar[i])
                return false;
        }
        return true;
    }
    
    public static boolean IsArrayDescending(int[] ar){
        for(int i = 1; i < ar.length ; i++)
        {
            if (ar[i-1] < ar[i])
                return false;
        }
        return true;
    }
    
    public static int[] ReverseArrayOutput(int[] ar){
        int[] arr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            //System.out.print(arr[i]);
            arr[i] = ar[ar.length-1 -i];
        }
        return arr;
    }
    
    public static void ReverseArray(int[] ar){
        int[] arr = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            //System.out.print(arr[i]);
            arr[i] = ar[ar.length-1 -i];
        }
        for (int i = 0; i < ar.length; i++) {
            ar[i] = arr[i];
        }
        
    }
    
    public static int contains(int[] a, int number){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == number){
                return i;
            }
        }
        return -1;
    }
    
    public static int[] GenerateArray(int size, int min, int max){
        int[] array = new int[size];
        for(int i = 0; i < array.length ; i++){
            array[i] = (int)(Math.random()*(max-min+1)+min);
        }
        return array;
    }
    public static int[] GenerateArrayUnique(int size, int min, int max){
        int[] array = new int[size];
        for(int i = 0; i < array.length ; i++){
            array[i] = (int)(Math.random()*(max-min+1)+min);
            for (int j = 0; j < i; j++) {
                if(array[i] == array[j]){
                    i--;
                    break;
                }
            }
        }
        return array;
    }
    
    //testovací main
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {9,8,7,6,5,4,3,2,1};
        /*
        boolean bool;
        bool = IsArrayAscending(array);
        System.out.println(bool);
        bool = IsArrayDescending(array2);
        System.out.println(bool);
        
        ReverseArray(array);
        */
        //int[] reverseArray = ReverseArrayOutput(array);
        /*
        for(int i = 0; i < array.length ; i++){
            System.out.print(array[i]+ " ");
            //System.out.print(reverseArray[i]+ " ");
        }
        */
        System.out.println("");
        int[] randomArray = GenerateArray(15,-10,10);
        for(int i = 0; i < randomArray.length ; i++){
            System.out.print(randomArray[i]+ " ");
        }
    }
}
