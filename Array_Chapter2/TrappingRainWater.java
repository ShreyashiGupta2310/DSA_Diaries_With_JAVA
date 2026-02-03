package Array_Chapter2;

public class TrappingRainWater {
    public static int TrappedWater(int heights[]){
        //left max array
        int LeftMaxArray[]=new int[heights.length];
        LeftMaxArray[0]= heights[0];
        for(int i=1;i<heights.length;i++){
            LeftMaxArray[i]=Math.max(heights[i],LeftMaxArray[i-1]);
             }
        //right max array
int RightMaxArray[]=new int[heights.length];
        RightMaxArray[heights.length-1]= heights[heights.length-1];
        for(int i=heights.length-2;i>=0;i--){
            RightMaxArray[i]=Math.max(heights[i],RightMaxArray[i+1]);
             }

        //loop lagayenge to compare and find out the water level and then trapped water mil jayega
        //waterLevel= min(leftmax , rightmax)
        //Trapped Water= (waterLevel-height)*width--here width is 1 i am assuming

int TrappedWater=0;
        for(int i=0;i<heights.length;i++){
            int waterLevel=Math.min(LeftMaxArray[i],RightMaxArray[i]);
            TrappedWater += waterLevel-heights[i];

        }
        return TrappedWater;
    }
    public static void main(String args[]){
        int heights[]={4,2,0,6,3,2,5};
        int totaltrapped_water=TrappedWater(heights);
        System.out.println("total trapped water= "+totaltrapped_water);

    }
    
}
