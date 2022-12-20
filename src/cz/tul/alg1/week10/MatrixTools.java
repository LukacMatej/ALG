package cz.tul.alg1.week10;

/**
 *
 * @author matej.lukac
 */
public class MatrixTools {

    private MatrixTools(){
        
    }
    
    public static double[][] sum(double[][] a, double[][] b){
        if (! areSame(a,b)){
            //nevalidní vstup
        }
                
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                
            }
            
        }
        return sum;
    }
    
    public static boolean areSame(double[][] a, double[][] b){
        return a.length == b.length && a[0].length == b[0].length;

    }
    
    public static void norm(double[][] a){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(Math.abs(a[i][j]) > max)
                max = a[i][j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j]/Math.abs(max);
            }
        }
        
    }
    
    public static void main(String[] args) {
        double[][] my2DArray = {{1.8, 2.3, 3.6},
                                {1.3, 4.3, 2.6}};
        double[][] my2DArray2 = {{1,1,1},
                                 {2,2,2}};
        double[][] result = sum(my2DArray,my2DArray2);
        UI.print(result);
        norm(my2DArray);
        UI.print(my2DArray);
        }
        

}
    

