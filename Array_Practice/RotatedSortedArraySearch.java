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
   
 // Main search function
    public static int search(int[] nums, int target) {

        // Step 1: find index of minimum element
        int min = minSearch(nums);

        // Step 2: decide which part to apply binary search
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            // search in right sorted part
            return Binary_Search(nums, min, nums.length - 1, target);
        } else {
            // search in left sorted part
            return Binary_Search(nums, 0, min - 1, target);
        }
    }     

     // Normal binary search
    public static int Binary_Search(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

   // Find index of smallest element (pivot)
    public static int minSearch(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String args[]){
        int array[]={4, 5, 6, 7, 0, 1, 2};
        int target = 0;
       int index= search(array,target);
       System.out.println("index of the rotated sorted array's target :"+ index);
    }
}

