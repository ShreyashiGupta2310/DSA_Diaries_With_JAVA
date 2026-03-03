package Recursion;

public class Last_Occurance {
    public static int LastOccurance(int array[] ,int key ,int index){
        if(index<0)
            return -1;
        if(key==array[index])
            return index;
        else
            return LastOccurance(array,key,index-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,0,9,8,8,71,1,1,1,4};
        System.out.println(LastOccurance(arr,1,arr.length-1));
    }
}