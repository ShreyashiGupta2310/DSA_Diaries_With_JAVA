package Recursion;
public class PowerFunction {
    public static int power(int Number, int power){
        if (power==0) 
            return 1;
        return Number * power( Number , power-1);
    }
    public static void main(String args[]){
        System.out.println(power(2,10));
    }
}
