package Recursion_Part2;
public class FriendsPairing {
    public static long waysToPair(int n){
        //base case
        if(n==1 || n==2)
            return n;

        //single
        long single = waysToPair(n-1);

        //paired
        long pairedways = (n-1)* waysToPair(n-2);

        //total ways
        return single + pairedways;

    }
    public static void main(String[] args){
System.out.println(waysToPair(20));

    }
}
