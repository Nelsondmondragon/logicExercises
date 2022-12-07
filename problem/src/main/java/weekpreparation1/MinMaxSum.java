package weekpreparation1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxSum {

    public static void main(String[] args) {
        miniMaxSum(List.of(1, 5, 2, 4, 3));
    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> listSort = new ArrayList<>(arr);
        Collections.sort(listSort);
        Long value = listSort.stream().mapToLong(Integer::longValue).reduce( 0, Long::sum);
        System.out.println((value - listSort.get(listSort.size() - 1)) + " " + (value - listSort.get(0)));
    }

}
