package Recursion;
//Left to right approach(start to end)
public class LastOccurance {
    public static int  OccursLstAt(int array[], int key, int index){
    //   Base case: when index reaches array length (one position after last index) Because technically it's not out of bounds yet.We are just stopping before accessing it
        if(index==array.length)
            return -1;
        // reachedAtLast variable will help us to traverse at the last of the array
        int reachedAtLast= OccursLstAt(array,key,index+1);

        // we will check the below condition until the above condition of reaching at last will not get full filled and we will keep returning the  reachedAtLast varible  till we reach at last
        if(reachedAtLast!=-1 )
            return reachedAtLast;
        // when we will be at lastnow we will check the below condition and collapse
        if(array[index]==key)
            return index;

    //if in case key not found 
    return reachedAtLast;

    }    
    public static void main(String args[]){
        int arr[]={1,2,3,4,65,76,44,3,3,3,1,1,2,23,4  };
      System.out.println(  OccursLstAt(arr,1,0));


    
    }
}
