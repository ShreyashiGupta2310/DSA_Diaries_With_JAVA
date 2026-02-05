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
    for(int i=0;i<array.length;i++){
        if(array[i]==target)
            return i;
    }
       
        return -1;
    }      
    public static void main(String args[]){
        int array[]={4, 5, 6, 7, 0, 1, 2};
        int target = 0;
       int index= searchTarget(array,target);
       System.out.println("index of the rotated sorted array :"+ index);
    }
}


// What current code is doing

//  searchTarget() is a simple linear search

// Time complexity right now is O(n) --> which is a problem now

// It works correctly for finding the target index

// But it does NOT use the rotated-sorted-array property at all

// So at the moment,  code is solving:
//  “Search an element in an array”
//  Not yet: Search in Rotated Sorted Array (O(log n))