package BACKTRACKING;
public class Array_BackTrack {
    public static void   arrayUpdate(int arr[],int index,int value){
        //base case
        if(index==arr.length){
        print(arr);
            return;
        }
        //Recursion
        arr[index]=value;
          arrayUpdate(arr,index+1,value+1);
        // backtrack and reduc by-2 in values
        arr[index]=value-2;

    };
    public static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[]=new int[5];
        arrayUpdate(arr, 0, 1);
        System.out.println();
        print(arr);
        

    }
}
