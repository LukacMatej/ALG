package cz.tul.alg1.week11;
import java.util.Scanner;
public class SymetricMatrix {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int m;
        System.out.println("Zadejte velikost čtvercové matice");
        m = sc.nextInt();
        double[][] matrix = new double[m][m];
        System.out.println("Zadejte hodnoty");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        isSymetricVertical(matrix);
        isSymetricHorizontal(matrix);
    }
    
    public static void isSymetricVertical(double[][] a){
        boolean bool = false;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length/2; j++) {
                    if (a[i][j] == (a[i][a[j].length - 1 -j]))
                        bool = true;
                    else{
                        bool = false;
                        break;
                    }
                }
            }
        if(bool == true)
            System.out.println("Je vertikálně symetrická");
        else
            System.out.println("Neni vertikálně symetrická");
    }
    public static void isSymetricHorizontal(double[][] a){
        boolean bool = false;
            for (int i = 0; i < a.length/2; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == (a[a.length -1 - i][j]))
                        bool = true;
                    else{
                        bool = false;
                        break;
                    }
                }
            }
        if(bool == true)
            System.out.println("Je horizontálně symetrická");
        else
            System.out.println("Neni horizontálně symetrická");
        
    }
}
