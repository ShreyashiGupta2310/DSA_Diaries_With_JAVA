package Matrices;
import java.util.*;

public class Sum_of_Diagonal {
    public static int DiagonalSum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         //for primary diagonal
        //         if(i==j){
        //      sum=sum+matrix[i][j];
        //         }
        //         //for secondary diagonal
        //         else if(i+j==matrix.length-1){
        //             sum=sum+matrix[i][j];
        //         }

        //     }
        // }

        for(int i=0; i<matrix.length ;i++){
            //primary diagonal condition
            sum=sum+matrix[i][i];
            //secondary diagonal condition
            //logic -----> if i+j=matrix.length-1 then it is secondary diagonal so in order to replace j (i.e the second loop )  j=natix.length-i-1 (just a simple math)

            if(i !=matrix.length-i-1)// i.e secondary diagonal condition not full filled also this condition will help in odd number of elements like 5 by 5 matrix 
            {
                sum+=matrix[i][matrix.length-i-1];
            }

        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("matrix is");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(" "+matrix[i][j]);

            }
             System.out.println();
        }
        int sum=DiagonalSum(matrix);
        System.out.print("sum of diagonal "+ sum);

    }
}
