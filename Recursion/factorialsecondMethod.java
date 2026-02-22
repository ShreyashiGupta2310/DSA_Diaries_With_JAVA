package Recursion;

public class factorialsecondMethod {
    public static int fact(int n){
        if(n==0)
            return 1;
        int nMinusOne=fact(n-1);
        int func=n*nMinusOne;
        return func;
    }
public static void main(String args[]){
    int n=3;
   int factorial= fact(n);
   System.out.print(factorial);
}
}
//time complexity-->  O(n)
//space complesxity-->O(n)   {cuz each call stack occupies space in memory}