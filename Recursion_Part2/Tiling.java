package Recursion_Part2;

public class Tiling {
    public static int ways(int n){ //as Floor--> 2 X n


    // BASE CASE
    // If board width is 0 or 1, there is only ONE way to tile it.
    // 2×0 -> nothing to place
    // 2×1 -> only one vertical tile
        if(n==0 || n==1)
            return 1;


        // if placed vertically first(leftmost first)
        int vertical=ways(n-1);
        //if places horizontally first(leftmost first)
        int horizontal=ways(n-2);



    // TOTAL WAYS =
    // tilings starting with vertical
    // +
    // tilings starting with horizontal pair
        int totalways=vertical+horizontal;

        return totalways;

    }
    public static void main(String args[]){
        int n=4;
        System.out.println("Number of ways for a 2Xn floor and tile size 2 X 1  when n is "+ n + " is "+ways(n));
    }
}
