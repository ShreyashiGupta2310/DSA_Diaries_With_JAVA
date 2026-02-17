package Recursion;

public class factorial {
    public static int fact(int n){

        while(n>=0){
        if(n==0 || n==1){
            return 1;
        }
         else
            return n*fact(n-1);

    }
    return 0;
}

    public static void main(String args[]){
        int j=5;
int factorial_num=fact(j);
System.out.print("factorial of  "+j+" is "+factorial_num );
    }
}
