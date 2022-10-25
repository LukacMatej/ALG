package cz.tul.alg1.week2;
import java.util.Scanner;
/**
 *
 * @author matej.lukac
 */
public class rodneCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int birthNumber = sc.nextInt();
        int year = birthNumber / 10000;
        if(year > 54)
            year = year + 1900;
        else 
            year = year + 2000;
        birthNumber = birthNumber % 10000;
        int month = birthNumber / 100;
        birthNumber = birthNumber % 100;
        int day = birthNumber;
        var gender = "";
        if(month > 50){
            gender = "žena";
            month = month - 50;
        }
        else 
            gender = "muž";
        System.out.println("Váš rok narození je: " + day + "." + month + "." + year);
        System.out.println("Jste " + gender);
    }
    
}
