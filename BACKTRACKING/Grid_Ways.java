
public class Grid_Ways {
    public static int GridWays(int i , int j, int rows, int col){
//Base Case
if(i==rows-1 && j==col-1){
    return 1;
}
//out of boundary condition
else if (i==rows || j==col){
    return 0;
}

        //right direction (const row column is changing)
      int w1=  GridWays(i,j+1,rows, col);
        //bottom-down (ro is changing column is const)
      int w2=  GridWays(i+1,j,rows, col);

    // final ways= way1(right direction )+ way2 (bottom)
      return w1+w2;
    }
    public static void main(String args[]){
int n=3;
int m=2;
System.out.println(GridWays(0,0,n,m));
    }

}
