package Recursion_Part2;

public class BinaryString {
    public static void printBinaryStrings(int n , int lastDigit , String str){
        // Base case---> when whole string gets finished
        if(n==0){
            System.out.println(str);
            return;

        }
        // recursive work to be done(Kaam)
       if(lastDigit==0){

        printBinaryStrings(n-1,0,str+"0");
         printBinaryStrings(n-1,1,str+"1");
       }else{
         printBinaryStrings(n-1,0,str+"1");
       }
    }
    public static void main(String args[]){
    printBinaryStrings(4,0,"");
    }
}
