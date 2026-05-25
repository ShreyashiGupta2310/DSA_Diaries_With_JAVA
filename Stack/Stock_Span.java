package Stack;
import java.util.*;

public class Stock_Span{
    public static void stock_span_calculator(int stock[], int span[]){
        // created an stack which will keep track of the previous high

        Stack<Integer> s=new Stack<>();
        //first elemnt's span will always be 1
        span[0]=1;
        // pushing first element's index into our stack
        s.push(0);

        // now from next index(i.e 1) we'll run a loop 
        // if our stack is not empty as well as current element is grater than or equal to from the TOP  element stored in stack
          // if the condition is true then we'll pop out the top elemnt as it is no longer greater than the elemnt we are currently comparing
        // we'll run the above condition either stack gets empty or stock's peak element is greater

        //then we'll check if the stack is empty if yes=>then we'll store on span current index +1 as span
        //if not empty then simply span =i-prevHigh;
    
        for(int i=1; i< stock.length;i++){
            int currentElement=stock[i];
            while(!s.isEmpty() && currentElement >= stock[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;

            }
            s.push(i);
        }
     


    }
public static void main(String args[]){

// created stocks
    int Stock[]={100 , 80 ,60 ,70 ,60 ,85 ,100};
// created an span array to store each eleemnt's span in it
    int span[]=new int[Stock.length];

    stock_span_calculator(Stock, span);

    for(int i=0 ; i<Stock.length; i++){
        System.out.print(span[i]+" ");
    }
}
}