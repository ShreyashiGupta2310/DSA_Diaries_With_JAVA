package Array_Chapter2.MAX_SUBarray_SUM;

public class Prefix_Sum {

    public static void SumOfSubarrays(int array[]){
int prefixSUMarray[]=new int[array.length];
int currentSUM=0;
int maxsum=Integer.MIN_VALUE;
prefixSUMarray[0]=array[0];
       for(int i=1;i<array.length;i++){
        //  prefixSUMarray[i]+=array[i];
        prefixSUMarray[i]=prefixSUMarray[i-1]+array[i];
       }

        for(int start=0;start<array.length;start++){
            for(int end=0;end<array.length;end++){
            // currentSUM=0;        
            currentSUM = start == 0 ? prefixSUMarray[end]:prefixSUMarray[end]-prefixSUMarray[start-1];
            System.out.println("Current sum= "+currentSUM);
            if(maxsum<currentSUM)
                maxsum=currentSUM;
            }
        }
         System.out.println("Maximum sum= "+maxsum);
    }
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        SumOfSubarrays(array);
    }
}
