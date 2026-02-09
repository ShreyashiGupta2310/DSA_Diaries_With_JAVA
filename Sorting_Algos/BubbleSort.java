package Sorting_Algos;

public class BubbleSort {
    
    public static void Bubble_Sort(int array[]){
        for(int i=0; i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
       
    }
    public static void main(String args[]){
int array[]={9,3,4,6,1,5};
Bubble_Sort(array);
for(int i=0;i<array.length-1;i++){
    System.out.print(array[i]+" ");
}

    }
}
