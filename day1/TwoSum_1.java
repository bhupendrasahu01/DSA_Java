package day1;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                      int result [] = { i, j };
                      return result;
                }
            }
        }
        return new int[] {};
    }

    //OP: solution
    class Solution {
        public int[] twoSum(int[] nums, int target) {
             int res []={0,0};
                for(int i=0; i<nums.length; i++){
                    for(int j=i+1; j<nums.length; j++){
                        if(nums[i]+nums[j]==target){
                            int result []={i,j};
                            return result;
                        }
                    }
                }
            return res;
        }
    }

    public static void main(String[] args) {

        TwoSum_1 twoSum_1=new TwoSum_1();
        int nums []={2,7,11,15};
        int result []= twoSum_1.twoSum(nums, 9);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        


    }

}

// Intuition
// The Two Sum problem asks us to find two numbers in an array that sum up to a given target value. We need to return the indices of these two numbers.

// Approach
// One brute force approach is to consider every pair of elements and check if their sum equals the target. This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).
// A more efficient approach is to use a hash table (unordered_map in C++). We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.
// Approach using a hash table:

// Create an empty hash table to store elements and their indices.
// Iterate through the array from left to right.
// For each element nums[i], calculate the complement by subtracting it from the target: complement = target - nums[i].
// Check if the complement exists in the hash table. If it does, we have found a solution.
// If the complement does not exist in the hash table, add the current element nums[i] to the hash table with its index as the value.
// Repeat steps 3-5 until we find a solution or reach the end of the array.
// If no solution is found, return an empty array or an appropriate indicator.
// This approach has a time complexity of O(n) since hash table lookups take constant time on average. It allows us to solve the Two Sum problem efficiently by making just one pass through the array.