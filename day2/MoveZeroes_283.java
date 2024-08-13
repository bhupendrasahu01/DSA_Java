package day2;

public class MoveZeroes_283 {
    //OP:Solution
    public void Solution_L1(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0)
                nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

    }
    //OP: SOlution L2
    public void Solution_L2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int cur = 0;
    
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp  = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public void answer(int[] nums) {
        // int testCase []={0,1,0,3,12};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[j] == 0) {
                        int temp2 = nums[j];
                        nums[i] = nums[j + 1];
                        nums[j + 1] = temp2;
                    } else {
                        int temp2 = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp2;
                    }

                }
            }

        }
    }

    public static void main(String[] args) {
        MoveZeroes_283 moveZeroes_283 = new MoveZeroes_283();
        int testCase[] = { 0, 0, 1 };
        moveZeroes_283.answer(testCase);

    }

}
