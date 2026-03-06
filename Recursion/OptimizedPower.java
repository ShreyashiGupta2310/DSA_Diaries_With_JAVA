package Recursion;

public class OptimizedPower {
    public static int Optimizedpower(int number, int power){
        if(power==0)
            return 1;

        int halfpower=Optimizedpower(number,power/2)*Optimizedpower(number,power/2);

        if(power%2!=0)
            return number *halfpower;

        return halfpower;
    }


    public static void main(String args[]){
        System.out.println(Optimizedpower(2,10));
    }
}
// This implementation calculates power recursively but calls
// the function twice for half powers, resulting in O(n) time complexity.
// Will optimize later for O(log n).