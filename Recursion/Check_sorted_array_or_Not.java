package Recursion;
public class Check_sorted_array_or_Not {
    public static boolean isSorted(int arr[],int index){
        if(index==arr.length-1)
            return true;
      
        if(arr[index]>arr[index+1])
            return false;

       return isSorted(arr,index+1);



    }
    public static void main(String args[]){
        // int arr[]={1,2,3,4,5};
        int arr[]={2,6,1,4};
        System.out.print(isSorted(arr,0));

    }
}
