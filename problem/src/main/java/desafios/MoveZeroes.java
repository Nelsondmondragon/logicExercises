package desafios;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }


    static void moveZeroes(int... array) {
        int n = (short) array.length;
        int l = 0;
        int r = 1;
        while (r < n) {
            if (array[l] != 0) {
                l++;
                r++;
            }


            if (array[r] == 0) {
                r++;
            } else {
                array[l] = array[r];
                array[r] = 0;
                l++;
                r++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
