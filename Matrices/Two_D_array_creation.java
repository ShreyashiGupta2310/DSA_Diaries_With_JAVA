
package Matrices;
import java.util.*;

public class Two_D_array_creation {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        //for row length
        int m=matrix.length;
        //for column length
        int n=matrix[0].length;
//input the array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               matrix[i][j]= obj.nextInt();
            }
        }


        // printing this 2D array
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(" "+ matrix[i][j]);
            }
             System.out.println();
        }
    }
}
