package Matrices.practice;

public class Sum_of_nums_any_row {
    public static void Sum(int arr[][],int row_sum){
        int sum=0;
        int index=row_sum;

        // for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
sum+=arr[index-1][col];
            }
            
        // }
        System.out.println("Sum of elements is 2nd row is "+sum);
    }
    public static void main(String args[]){
         int arr[][]={{1,2,3,4},
                     {7,7,7,4},
                     {4,6,7,4},
                     {1,2,3,7}};
        Sum(arr,2);
    }
}
