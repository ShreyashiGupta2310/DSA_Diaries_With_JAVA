
public class Sudoku {

//Step 7: make isSafe function which will check the whole row , column, and grid that they doesn't contain that digit
public static boolean isSafe(int sudoku[][], int row, int col , int digit){
//checking column (rows will change col will remain same)
for(int i=0; i<9;i++){
    if(sudoku[i][col]==digit)
        return false;
}
//checking rows
for(int i=0; i<9;i++){
    if(sudoku[row][i]==digit)
        return false;
}

//checking the grid
int startingRow= (row/3)*3;
int startingCol= (col/3)*3;

for(int i=startingRow ; i< startingRow +3; i++ ){
    for(int j= startingCol ; j< startingCol +3; j++ ){
        if(sudoku[i][j]==digit)
            return false;
    
}
}

    return true;
}

   
    // Step 1 : this function will tell , is it even possible to solve the sudoku
    public static boolean sudokuSolver(int sudoku[][] , int row , int col){
//Base case (step 8)
if(row==9){
    return true;
}

//Recursion

//Step 4: make nextrow and nextcol
//move int the same row , iterating over columns
int nextrow=row;
int nextcol=col+1;

// now when columns finish change the row and update column to 0
if(nextcol==9){
    nextrow=row+1;
    nextcol=0;
}
//step 5: check if place is not equal to 0 i.e it has a digit already in it so we'll not place anything in it and move to next digit

if(sudoku[row][col]!=0){
    return sudokuSolver(sudoku , nextrow, nextcol);
}

//step 2: this loop will place digit from 1 to 9 in a certain place 
for(int digit=1; digit<=9; digit++){
    //step 3: then we'll check that , is it even safe to place this digt at a certain position
    if(isSafe(sudoku , row , col , digit)){
         //abb agar safe h uss digit to uss perticular position prr place kerna toh


         // 1 place it
         sudoku[row][col]=digit;

         // 2 call for the recursive function
         // we have to make a logic which automatically calls for next row and next col 
        // sudokuSolver(sudoku , nextrow , nextcol);
        if(sudokuSolver(sudoku , nextrow , nextcol)){
            //it means solution exist
            return true;

        }
       sudoku[row][col]=0;


    }

    //step 6 if above conditions are not fullfilled
    
}
    return false;

    }

    //step 9 sudoku printer
    public static void printSudoku(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

    int sudoku[][] = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},

    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},

    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}

};

if(sudokuSolver(sudoku , 0 ,0)){
    System.out.println("solution exist");
    printSudoku(sudoku);
}else{
    System.out.print("solution doesn't exist");
}

    }
}
