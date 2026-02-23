package Recursion;

public class Fibonacci_Series {
    public static int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);

    }
    public static void main(String args[])
    {   int n=6;
        // int n=100;
        System.out.println("fibonacci of "+ n + " is "+ fib(n));

    }
}
