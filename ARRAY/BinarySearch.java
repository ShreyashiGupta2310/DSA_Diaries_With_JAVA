public class BinarySearch {
   public static int Binary_Search(int array[], int key){
    // int start=array[0];
    // int end =array.length-1;
    // int mid=(start+end)/2;
    int start=0;
    int end=array.length-1;

    while(start<=end){
        int mid=(start+end)/2;
        if(array[mid]==key){
            System.out.println("Key found at index:  "+mid);
            return mid;
        }
        if(key<array[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }

    }

    return -1;
   }

    public static void main(String args[]){
        int array[]={12,34,56,78,90};
        int key=34;
         Binary_Search(array,key);
        // int index= Binary_Search(array,key);
        //  System.out.println("Key found at index:  "+ index);

    }

}
