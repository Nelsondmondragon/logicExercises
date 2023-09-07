import java.util.Arrays;

public class SquaresOfSorted {

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        nums = sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] sortedSquares(int[] nums) {
        nums = Arrays.stream(nums)
                .map(value -> (int) Math.pow(value, 2))
                .sorted()
                .toArray();
        return nums;
    }

    static int[] sortedSquares2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        return nums;
    }
}