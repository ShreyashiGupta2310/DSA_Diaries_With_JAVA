package Recursion;

public class Increasing_function {
//Method -1

    // public static void IncFunc(int n){
    //     if(n==10)
    //     {    System.out.println(10);
    //         return;
    //     }
    //     System.out.println(n);
    //     IncFunc(n+1);
    // }


//method-2
public static void IncFunc(int n){
if(n==1){
    System.out.println(n);
    return;
}
 IncFunc(n-1);
 System.out.println(n);

}
    
    public static void main(String args[]){

        //for method-1
        // int n=1;


        int n=10;

        IncFunc(n);
    }
}


// commit msg--"Brushed up core recursion"