package Array_Chapter2.MAX_SUBarray_SUM;
//time complexitity--O(n)
public class KADANES {
    public static void Kadanes(int array[])
    {
           int max_sum=Integer.MIN_VALUE;
           int current_sum=0;


           for(int i=0;i<array.length;i++){
            current_sum+=array[i];
            if(current_sum<0){
                current_sum=0;
            }
            //instead of this you can also use Math.max()
            // if(current_sum>max_sum){
            //     max_sum=current_sum;
            // }

            max_sum=Math.max(current_sum,max_sum);
           }
           System.out.println("Maximum sum of all sub arrays :"+max_sum);
    }
    public static void main(String args[]){
        int array[]={-2,-3,4,-1,-2,1,5,-3};
         int a[]={1,-2,6,-1,3};
       Kadanes(array);
       Kadanes(a);
    }
}
//git commit -m "Finding Maximum subarray sum using kadanes algo, changes Time complexity from O(n^3)  {Brute force approach} -->O(n^2){Prefix sum}-->O(n) {kadane's Algo}"