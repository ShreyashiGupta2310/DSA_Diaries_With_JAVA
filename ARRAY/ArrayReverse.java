public class ArrayReverse {
    public static void Reverse(int array[]){
        int start=0;
        int end=array.length-1;
while(start<end){
        //Swaping ka logic
        int temp=array[end];
        array[end]=array[start];
        array[start]=temp;

start++;
end--;
}


    }


    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        Reverse(array);

        for(int i=0;i<array.length;i++){
           System.out.print(" "+array[i]) ;
        }
    }
}
