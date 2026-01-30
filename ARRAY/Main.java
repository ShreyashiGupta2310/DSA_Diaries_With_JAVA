// Array as argument__
import java.util.*;
public class Main {
    public int copy(int x){
         x=10;
        return x;
    }
    public static void main(String[] args) {
     
      int a=20;
      Main obj=new Main();
        System.out.println("before");
      System.out.println(a);
     
      a = obj.copy(a);
        System.out.println("After");
        System.out.println(a);
         System.out.println("After-After");
          System.out.println(a);
          

    int[] arr = new int[10];
    Scanner sc= new Scanner(System.in);
    arr[0]=sc.nextInt();
    arr[1]=sc.nextInt();
    arr[2]=sc.nextInt();

    System.out.println("array-1"+arr[0]);
     System.out.println("array-2"+arr[1]);
      System.out.println("array-3"+arr[2]);

       System.out.println("array length:=>"+ arr.length);
    }
}
