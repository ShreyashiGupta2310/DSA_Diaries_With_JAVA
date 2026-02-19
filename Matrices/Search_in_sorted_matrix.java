package Matrices;

public class Search_in_sorted_matrix {
    public static boolean Search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>0){
            if(matrix[row][col]==key){
                System.out.print("key"+key+" found at "+"("+row +","+col +")");
                return true;
            }
            else if(key>matrix[row][col])
                row++;
            else 
            col--;
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8}, 
                        {9,10,11,12}, 
                        {13,14,15,16}};
        Search(matrix,6);
    }
}
