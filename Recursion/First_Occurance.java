package Recursion;

public class First_Occurance {
    public static int First_Occur(int array[],int key ,int index){
        //Base case
     if(index==array.length)
        return -1;

     if(key==array[index])
        return index;
    //recursive calling
    return First_Occur(array,key,index+1);
     

    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,3,7,3,4};
        System.out.println(First_Occur(arr,4,0));
    }
}
