import java.util.*;
public class linear_search {
    public static int linear_search_Algo(int array[] , int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key)
                return i;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int a[]={12,34,55,66,33};
        int key=linear_search_Algo(a,33);

        if(key==-1)
            System.out.println("nahi mila number array me");
        else{
            System.out.println("the number is found at index  :"+ key+ " and array element is "+ a[key]);
        }
    

    }
}
