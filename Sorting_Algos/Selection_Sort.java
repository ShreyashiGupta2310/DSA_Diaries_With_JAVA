package Sorting_Algos;

public class Selection_Sort {
    public static void SelectionSort(int array[]){
       
  
        for(int Turn=0;Turn<array.length-1-1;Turn++){
             int min=Turn;
             for(int j=Turn+1;j<array.length-1;j++){
                if(array[min]>array[j]){
                    min=j;
                    
                }
             }
             int temp=array[min];
             array[min]=array[Turn];
             array[Turn]=temp;
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
