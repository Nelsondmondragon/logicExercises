package desafios;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColor(nums);
    }


    static void sortColor(int... nums) {
        int l = 0;
        int r = nums.length - 1;
        int index = 0;
        while (index <= r) {
//            System.out.println(Arrays.toString(nums));
            if (nums[index] == 0) {
                nums[index] = nums[l];
                nums[l] = 0;
                l++;
            } else if (nums[index] == 2) {
                nums[index] = nums[r];
                nums[r] = 2;
                r--;
            }
            index++;

        }
        System.out.println(Arrays.toString(nums));
    }
}
