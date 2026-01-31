public class PrintSubArrays {

    public static void SubArray(int array[])
    { int ts=0;
          for(int i=0; i< array.length ;i++)
        {
            int start=i;
            // for(int j=i+1; j<array.length ;j++)
            for(int j=i; j<array.length ;j++)
        {
            int end=j;
            for(int k=start;k<=end;k++)
            {
            System.out.print(" "+array[k]);

            }
            ts++;
               System.out.println();
          }
          System.out.println();
        }

        System.out.println("total sub arrays:  "+ ts);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        SubArray(array);
    }
}
