/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week2;
import java.util.Scanner;

public class BanknotesCountsArray {

    public static void main(String[] args) {
        int moneyCount[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte počet peněz");
        int inputMoney = sc.nextInt();
        int money[] = {1,2,5,10,20,50,100};
        for(int i = money.length-1 ; i >= 0; i--){
            if(inputMoney >= money[i]){
                moneyCount[i] = inputMoney / money[i];
                inputMoney = inputMoney % money[i];
                if (inputMoney == 0)
                break;
            }
            
        }
        System.out.println("Počet korun: " + moneyCount[0]);
        System.out.println("Počet dvoukorun: " + moneyCount[1]);
        System.out.println("Počet pětikorun: " + moneyCount[2]);
        System.out.println("Počet desetikorun: " + moneyCount[3]);
        System.out.println("Počet dvacetikorun: " + moneyCount[4]);
        System.out.println("Počet padesátikorun: " + moneyCount[5]);
        System.out.println("Počet stovek: " + moneyCount[6]);
                
    }
    
}
