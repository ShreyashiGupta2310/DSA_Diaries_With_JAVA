package Matrices.practice;

public class Transepose_of_a_matrix
 {
    public static void Transpose(int arr[][]){
        int row_length=arr.length;
        int col_length=arr[0].length;
        int[][] new_matrix=new int[col_length][row_length];

        for(int row=0;row<=row_length-1;row++){
            for(int col=0;col<=col_length-1;col++){
                new_matrix[col][row]=arr[row][col];
            }
        }
    int  row_length2=new_matrix.length;
    int   col_length2=new_matrix[0].length;

  for(int row=0;row<=row_length2-1;row++){
            for(int col=0;col<=col_length2-1;col++){
              System.out.print(" "+arr[row][col]); 
            }
              System.out.println(); 
        }
          
    }
    // public static void print(int arr[][]){
    //      int row_length=arr.length;
    //      int col_length=arr[0].length;
    //      for(int row=1;row<=row_length-1;row++){
    //         for(int col=1;col<=col_length-1;col++){
    //           System.out.println(arr[row][col]); 
    //         }
    //     }
        
    // }
    
    public static void main(String args[]){
        int arr[][]={{11,12,13},
                     {21,22,23}};
    for(int row=0;row<=arr.length;row++){
            for(int col=0;col<=arr[0].length;col++){
              System.out.print(" "+arr[row][col]); 
            }
              System.out.println(); 
        }
          

                     Transpose(arr);
                    //  print(arr);

    }
}
