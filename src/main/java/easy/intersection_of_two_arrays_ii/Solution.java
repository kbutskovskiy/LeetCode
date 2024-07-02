package easy.intersection_of_two_arrays_ii;

import java.util.Arrays;

public class Solution {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int resultIndex = 0;
        int[] resultTmp = new int[nums1.length + nums2.length];
        for (i = 0; i < nums1.length + nums2.length; ++i) {
            resultTmp[i] = -1;
        }
        i = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else {
                if (nums2[j] < nums1[i]) {
                    ++j;
                } else {
                    resultTmp[resultIndex] = nums1[i];
                    ++i;
                    ++j;
                    ++resultIndex;
                }
            }
        }
        i = 0;
        while (i < nums1.length + nums2.length && resultTmp[i] != -1) {
            ++i;
        }

        int[] result = new int[i];

        for (j = 0; j < i; ++j) {
            result[j] = resultTmp[j];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersect(nums1, nums2);
        System.out.println();
    }
}
