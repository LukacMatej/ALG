package cz.tul.alg1.week11;

import java.util.Scanner;

public class NormAppZkouska1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadejte rozmery matice:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Zadejte cisla matice:");
        double[][] matrix = new double[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        //vypocet
        double absMaxValue = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (absMaxValue < Math.abs(matrix[i][j])){
                    absMaxValue = Math.abs(matrix[i][j]);
                }
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[i][j]/absMaxValue;
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("0.2f ", matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
}
