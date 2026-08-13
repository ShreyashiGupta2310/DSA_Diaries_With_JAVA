package BACKTRACKING;


 



public class N_Queen_B {
    //STEP-4
//now checking is it safe to put the queen in a perticular position
public static boolean isSafe(char arr[][],int row, int col){
    int n = arr.length;
    // check column upwards
    for(int i = 0; i < row; i++){
        if(arr[i][col] == 'Q') return false;
    }
    // check left diagonal upwards
    for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
        if(arr[i][j] == 'Q') return false;
    }
    // check right diagonal upwards
    for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++){
        if(arr[i][j] == 'Q') return false;
    }
    return true;
}
    //step-2 making function to just print all possible ways to place our queens (neglecting they will attack or not)
public static void N_Queens(char arr[][], int row){
// step-3 base case : adding it so  that it back tracks it doesn't go out of bounds: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
if(row==arr.length){
    print(arr);
    return;

}
    //har ekk column p we have to place one queen 
    for(int i=0;i<arr.length;i++){

        if(isSafe(arr,row ,i)){
        arr[row][i]='Q';
         N_Queens(arr,row+1);//recursion
                             //backtrack
         arr[row][i]='.';
        }
}

}
static int count = 1;
public static void print(char arr[][]){

    System.out.println(" ------------possible number of way  " +count + "--------");
    for(int i=0; i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
            System.out.println();
        
        
    }
    count++;
   
}
    public static void main(String[] args) {
        int n = 5;
        char nQueen[][] = new char[n][n];
        // step-1 placing our queens
        for(int i=0;i<n;i++){
            for(int j=0;j<n; j++ ){
                nQueen[i][j] = '.';
                System.out.print(nQueen[i][j] +" ");

            }
            System.out.println();
        }


        N_Queens(nQueen,0);
    }
}
