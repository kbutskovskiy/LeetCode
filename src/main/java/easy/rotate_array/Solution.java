package easy.rotate_array;

public class Solution {

    public void rotate(int[] nums, int k) {
        if (nums.length == 1) {
            return ;
        }
        int[] tmpNums = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            tmpNums[i] = nums[(i+k) % nums.length];
        }

        nums = tmpNums;
    }

    public static void main(String[] args) {

    }
}
