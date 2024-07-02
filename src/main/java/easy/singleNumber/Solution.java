package easy.singleNumber;

import java.util.Arrays;

public class Solution {

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        int k = singleNumber(nums);
        System.out.println(k);
    }
}
