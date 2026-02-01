package Array_Chapter2.MAX_SUBarray_SUM;

public class BruteForceApproach {
   

public static void MAX_SumOfSubarrays(int array[]){

  int max_sum=Integer.MIN_VALUE;
  int currentSUM=0;
        for(int i=0; i<array.length;i++){
            for(int j=i;j<array.length;j++){
               currentSUM=0;
              
                for(int k=i; k<=j;k++){
               currentSUM+=array[k];
                }
           System.out.println(currentSUM);

           if(max_sum<currentSUM)
           {
           max_sum=currentSUM;
           }
            }
             System.out.println();
        }
  System.out.println("MAXIMUM SUM : "+max_sum);
    }
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        MAX_SumOfSubarrays(array);
    }
}

