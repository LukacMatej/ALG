/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cz.tul.alg1.week2;

/**
 *
 * @author matej.lukac
 */
public class BanknotesCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputMoney = 163456;
        System.out.println(inputMoney);
        int moneyCount;
        while(inputMoney != 0){

        if(inputMoney >= 100)
        {
            moneyCount = inputMoney / 100;
            inputMoney = inputMoney%100;
            System.out.println("Počet stovek: " + moneyCount);
        }
        else if(inputMoney >= 50)
        {
            moneyCount = inputMoney / 50;
            inputMoney = inputMoney%50;
            System.out.println("Počet padesatikorun: " + moneyCount);
        }        
        else if(inputMoney >= 20)
        {
            moneyCount = inputMoney / 20;
            inputMoney = inputMoney%20;
            System.out.println("Počet dvacetikorun: " + moneyCount);
        }        
        else if(inputMoney >= 10)
        {
            moneyCount = inputMoney / 10;
            inputMoney = inputMoney%10;
            System.out.println("Počet desetikorun: " + moneyCount);
        }        
        else if(inputMoney >= 5)
        {
            moneyCount = inputMoney / 5;
            inputMoney = inputMoney%5;
            System.out.println("Počet pětikorun: " + moneyCount);
        }        
        else if(inputMoney >= 2)
        {
            moneyCount = inputMoney / 2;
            inputMoney = inputMoney%2;
            System.out.println("Počet dvoukorun: " + moneyCount);
        }        
        else if(inputMoney >= 1)
        {
            moneyCount = inputMoney / 1;
            inputMoney = inputMoney%1;
            System.out.println("Počet korun: " + moneyCount);
        }    
        }
    }
    
}
