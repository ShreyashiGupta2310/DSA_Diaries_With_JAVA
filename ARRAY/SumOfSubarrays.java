public class SumOfSubarrays {

    public static void SumOfSubarrays(int array[]){
  int min_sum=Integer.MAX_VALUE;
  int max_sum=Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum=0;
              
                for(int k=i; k<=j;k++){
                    System.out.print(" "+array[k]);
                    sum=sum+array[k];

                }
                  System.out.println();
                if(sum>max_sum)
                    max_sum=sum;
                if(sum<min_sum && sum!=0)
                    min_sum=sum;
                System.out.println(" sum= "+sum);
            }
             System.out.println();
        }
        System.out.println("Minimum sum in the subarrays is :"+ min_sum);
        System.out.println("Maximum sum in the subarrays is :"+ max_sum);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8,9,10};
        SumOfSubarrays(array);
    }
}
