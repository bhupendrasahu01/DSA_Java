package day1;

public class PlusOne_66 {
    //OP: Solution V1 level
    public int[] answer(int[] digits) {
        int arr[] = {};
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        PlusOne_66 plusOne_66 = new PlusOne_66();
        int testcase[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int result[] = plusOne_66.answer(testcase);
        for (int i : result) {
            System.out.print(i);
        }

    }
    // Faild in tis test case int testcase[] = { 9,8,7,6,5,4,3,2,1,0 };
    // public int[] answer(int[] nums) {
    // double digit = 0;
    // double temp = nums[0];
    // for (int i = 0; i < nums.length; i++) {
    // temp = nums[i];
    // for (int j = i; j < nums.length - 1; j++) {
    // temp = temp * 10;
    // }
    // digit = digit + temp;
    // }
    // double resultInt = digit + 1;
    // int[] arrayOfDigits =
    // String.valueOf(resultInt).chars().map(Character::getNumericValue).toArray();
    // return arrayOfDigits;
    // }

}
