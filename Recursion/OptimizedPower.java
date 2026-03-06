package Recursion;

public class OptimizedPower {


// This implementation calculates power recursively but calls
// the function twice for half powers, resulting in O(n) time complexity.
// Will optimize later for O(log n).
    public static int Optimizedpower(int number, int power){
        if(power==0)
            return 1;

        int halfpower=Optimizedpower(number,power/2)* Optimizedpower(number,power/2);
      

        if(power%2!=0)
            return number *halfpower;

        return halfpower;
    }

// Refactored OptimizedPower to compute half powers once,
// reducing redundant recursion and achieving true O(log n) time complexity.


        public static int Optimizedpowerplus(int number, int power){
        if(power==0)
            return 1;

        int halfpower=Optimizedpowerplus(number,power/2);
        int powerplus =halfpower*halfpower;

        if(power%2!=0)
            return number *powerplus;

        return powerplus;
    }



    public static void main(String args[]){
        System.out.println(Optimizedpowerplus(2,10));
    }
}
