package Array_Practice;

public class Contains_Duplicate {
    
    public static boolean Duplicate(int array[]){
       
        for(int i=0; i<array.length;i++){
            
            for(int j=i+1;j<array.length;j++){
               if(array[i]==array[j]){
                return true;
               }
          
    }
        }
        return false;
    }


    public static void main(String args[]){
        int array[]={1, 2, 3, 1};
        int array2[] = {1, 2, 3, 4};
        int nums[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean num =Duplicate(nums);
     
        boolean Value=Duplicate(array);
        System.out.println(Value);
        boolean Value2 =Duplicate(array2);
        System.out.println(Value2);
        System.out.print(num);
    }
}
