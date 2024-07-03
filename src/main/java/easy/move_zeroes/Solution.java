package easy.move_zeroes;

import static java.lang.Math.abs;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int zeroIndex = nums.length - 1;
        int i = 0, sum = 0, tmpSum = 0;

        for (i = 0; i < nums.length; ++i) {
            sum += abs(nums[i]);
        }

        i = 0;

        while (i < nums.length && zeroIndex >= 0) {
            if (nums[i] == 0) {
                int tmp = nums[zeroIndex];
                nums[zeroIndex] = nums[i];
                nums[i] = tmp;
                --zeroIndex;
                i=0;
                tmpSum = 0;
            } else {
                tmpSum += abs(nums[i]);
                if (tmpSum == sum) {
                    break;
                }
                ++i;
            }
        }
    }
}