package weekpreparation1.countingsort;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort {
    public static void main(String[] args) {
        System.out.println(countingSort(List.of(1, 1, 3, 2, 1)));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Integer[] matriz = new Integer[100];
        Arrays.fill(matriz, 0);
        arr.forEach(value ->
                matriz[value] += 1
        );

//        System.out.println(Arrays.toString(matriz));
        return Arrays.asList(matriz);
    }
}
