import java.util.*;


public class Next_Greater {
    public static void Find_Next_Greater(int arr[], int nextGreater[]){
        Stack<Integer> stack= new Stack<>();
         for(int i=arr.length-1; i>=0 ;i--){
    
          while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
            stack.pop();
          }

          if(stack.isEmpty()){
        nextGreater[i]=-1;
          }
          else{
            nextGreater[i]=arr[stack.peek()];
          }

          stack.push(i);
        }
    }
    public static void main(String args[]){
        int arr[]={6 ,8 ,0,1,3};
        // for containing indices not values
        int nextGreater[]=new int[arr.length];
        Find_Next_Greater(arr , nextGreater);

        for(int i=0; i<arr.length ;i++){
            System.out.print(arr[i]+ " ");
        }
          System.out.println();
          for(int i=0; i<arr.length ;i++){
            System.out.print(nextGreater[i]+ " ");
        }
    }
}
