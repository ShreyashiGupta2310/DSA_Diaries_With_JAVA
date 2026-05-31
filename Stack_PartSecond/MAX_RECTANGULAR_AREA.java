import java.util.*;
public class MAX_RECTANGULAR_AREA {
    public static void max_Area(int heights[]){
int maxArea=0;

        Stack<Integer> S=new Stack<>();  // STACK
        int NSL[]=new int[heights.length]; //NEXT SMALLER LEFT  (stores index )
        int NSR[]=new int[heights.length]; //NEXT SMALLER RIGHT   (stores index )

        // calculating next smaller right array

      //  starting from [left<---right]
        for(int i=heights.length-1;i>=0;i--){
            // this while loop will remove elements that are greater than the current element from the stack
            while(!S.isEmpty() && heights[S.peek()]>=heights[i]){
                S.pop();

            }
            if(S.isEmpty()){
                NSR[i]=heights.length;
            }else{
                NSR[i]=S.peek();
            }
            S.push(i);

        }


          // calculating next smaller left array

             for(int i=0;i<heights.length;i++){
            // this while loop will remove elements that are greater than the current element from the stack
            while(!S.isEmpty() && heights[S.peek()]>=heights[i]){
                S.pop();

            }
            if(S.isEmpty()){
                NSL[i]=-1;
            }else{
                NSL[i]=S.peek();
            }
            S.push(i);

        }

        // AREA CALCULATION

        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=NSR[i]-NSL[i]-1;
            int current_AREA=height*width;
            maxArea=Math.max(current_AREA,maxArea);
        }

        System.out.print("MAXIMUM AREA OF HISTOGRAM = "+ maxArea);

    }
    public static void main(String args[]){
        // int heights[]={2,1,5,6,2,3};
            //  int heights[]={3,3,3,3};
            int heights[]={5,1,5};

        max_Area(heights);
    }
}
