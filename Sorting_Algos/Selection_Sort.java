package Sorting_Algos;

public class Selection_Sort {
    public static void SelectionSort(int array[]){
       
  
        for(int Turn=0;Turn<array.length-1-1;Turn++){
             int min=Integer.MAX_VALUE;
             for(int j=0;j<array.length-1;j++){
                if(array[j]<min){
                    min=array[j];
                    // array[Turn]=min;
                }
             }
        }
    }
    public static void print(int array[]){
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        print(array);
        System.out.println();
        SelectionSort(array);
        print(array);
    }
}
