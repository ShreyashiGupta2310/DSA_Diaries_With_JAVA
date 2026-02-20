
package Matrices.practice;

public class Find_seven {
    public static int search_seven(int arr[][]){
     int count=0;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                if(arr[row][col]==7)
                    count++;
            }
        }
System.out.println("number of 7's in the matix is "+count);
return count;
     };
    public static void main(String args[]){
        int arr[][]={{1,2,3,4},
                     {7,7,7,4},
                     {4,6,7,4},
                     {1,2,3,7}};
        search_seven(arr);
    }
}
