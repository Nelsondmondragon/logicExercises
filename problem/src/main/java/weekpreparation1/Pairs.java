package weekpreparation1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Pairs {

    public static void main(String[] args) {
        System.out.println(pairs(2, List.of(1, 5, 3, 4, 2)));
    }

    public static int pairs(int k, List<Integer> arr) {

        // Write your code here
        int count = 0;
        int size = arr.size();
        Collections.sort(arr);
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int sum = Math.abs(arr.get(j) - arr.get(i));
                if (sum == k) {
                    count++;
                } else if (sum > k) {
                    break;
                }
            }
        }
        return count;
    }
}
