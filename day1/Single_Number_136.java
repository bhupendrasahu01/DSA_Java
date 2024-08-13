package day1;

public class Single_Number_136 {
//My code 
	int demofunction(int [] nums)
    {
        int temp =0 ;
        for(int i = 0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                 if (nums[i]==nums[j]){
                    break;
					
                 }else{
                    if (j<nums.length-1)
                   return  temp =nums[i];
                   
                   // System.out.println(nums.length);
					
                 }
            }
            
        }
        return temp;
    }

    int demofunction2(int [] nums)
    {
        int match=0;
        int temparr[]=nums;
        for (int i=0; i<nums.length; i++){
         
            for(int j=0; j<nums.length; j++){
                if(nums[i]==temparr[j]){
                    match=match+1;

                }
            }  
            if(match==1){
                return nums[i];
            }else{
                match=0;
            }     
        }
        return 0;
    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int result1 =result^ num; 
           result= result1; // Bitwise XOR operation
        }
        return result;
    }


    //OP : Code
    class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;  // Bitwise XOR operation
            }
            return result;
        }
    }

    public static void main(String[] args)
    {
		Single_Number_136 helloWorld = new Single_Number_136();
		int nums[]={9,8,7,5,7,9,8};
		int result= helloWorld.singleNumber(nums);
		System.out.println(result);
    }
}

// Approach
// Explanation:

// Bitwise XOR (^): The key concept is the XOR operator (^). It has the following properties that we leverage:

// a ^ a = 0 (XORing a number with itself results in 0)
// a ^ 0 = a (XORing a number with 0 leaves the number unchanged)
// Iterative XOR: We iterate through the nums array using a for-each loop. In each iteration:

// We perform a bitwise XOR operation between the current result and the current element num.
// Due to the XOR properties mentioned above:
// When encountering a duplicate element (a), a ^ a becomes 0, effectively canceling out the previous XOR result for that element.
// The single number (b) remains unaffected (b ^ 0 = b) as it has no duplicate to cancel it out.
// Final Result: After iterating through all elements, the result will hold the XOR of the single number, as all duplicates would have been canceled out to 0.

// This solution effectively finds the single number in the array with a time complexity of O(n) (linear) and uses only constant extra space (for the result variable).

// Complexity
// Time complexity:
// Space complexity:
