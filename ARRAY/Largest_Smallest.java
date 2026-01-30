import java.util.*;
public class Largest_Smallest {



public static int largest(int array[]){


int max_element=Integer.MIN_VALUE;

for(int i=0 ; i<array.length ;i++){
    if(array[i]>max_element){
        max_element=array[i];
    }
}

System.out.println("maximum element in array : "+ max_element);
return max_element;

}



public static int smallest(int array[]){
    int min_element=Integer.MAX_VALUE;

    for(int i=0 ; i<array.length ;i++){
    if(array[i]<min_element){
        min_element=array[i];
    }
}   
    System.out.println("minimum element in array : "+ min_element);
    return min_element;
}


public static void main(String args[]){
    int array[]={12,34,56,78,90};
    largest(array);
    smallest(array);


}
}
