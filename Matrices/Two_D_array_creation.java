
package Matrices;
import java.util.*;

public class Two_D_array_creation {

//search an element
public static boolean search(int[][] array,int element){
    //for row length
        int m=array.length;
        //for column length
        int n=array[0].length;
  
  
    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(array[i][j]==element){
                System.out.println("found at index"+"("+i+","+j+")");
                return true;
              }
            }
             System.out.println();
        }
        System.out.print("key nahi mili");
        return false;
}



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

  search(matrix,6);
      

    }
}
