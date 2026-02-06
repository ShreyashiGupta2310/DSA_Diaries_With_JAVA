// question : There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown 
// pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
// example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
// become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the 
// index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity

// shorten
// Given a sorted array rotated at an unknown pivot, find the target element.
// Return its index or -1 if not found. Time: O(log n).
// Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
// Output: -1











package Array_Practice;

public class RotatedSortedArraySearch {
    // public static void rotateArray(int array[]){
    //   int pivot=3;

       
        
    // }
public static int searchTarget(int array[] ,int target){
   int  start=array[0];
   int i=0;
   while(start<=(start+1)){

    if(start==target)
        return i;
    start=start+1;
    i++;
   }
   while(start>(start+1))
{
     if(start==target)
        return i;
    start=start+1;
    i++;
}
       
        return -1;
    }      
    public static void main(String args[]){
        int array[]={4, 5, 6, 7, 0, 1, 2};
        int target = 0;
       int index= searchTarget(array,target);
       System.out.println("index of the rotated sorted array's target :"+ index);
    }
}


// My Thought Process 
// 1. What the problem says

// The array was sorted earlier.

// Then it was rotated from some point, so it looks unsorted now.

// I need to find a target element’s index.

// The solution must be fast (O(log n)).

// 2. My first confusion

// Binary search works on sorted arrays.

// But after rotation, the array does not look sorted.

// So I was confused about how binary search can still work.

// 3. First working approach

// I used linear search to find the target.

// It gives the correct answer.

// But it takes O(n) time, which is not allowed for this problem.

// 4. Thinking about rotation

// I wondered if the target is always at the point where order breaks.

// Later I understood:

// the target can be anywhere

// rotation only helps decide which side to search

// 5. My wrong attempt

// I tried to follow the array step by step using values.

// I confused values with indices.

// This still behaved like linear search and didn’t reduce the search space.

// 6. Important realization

// Even after rotation:

// the array is not fully unsorted

// one part is always sorted

// This means binary search is still possible.

// 7. What I understand now

// I should not walk through the array.

// I must:

// check which half is sorted

// decide if the target can be in that half

// discard the other half

// This keeps the time complexity O(log n).

// 8. Why I’m committing this

// This commit shows my learning journey.

// I am building understanding first,

// then I will write the optimized solution.