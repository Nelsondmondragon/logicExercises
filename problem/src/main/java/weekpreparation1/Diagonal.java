package weekpreparation1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Diagonal {

    public static void main(String[] args) {

        List<List<Integer>> a = new ArrayList<>();
        a.add(List.of(1, 2, 3));
        a.add(List.of(4, 5, 6));
        a.add(List.of(9, 8, 9));


        System.out.println(diagonalDifference(a));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        BiFunction<List<List<Integer>>, Integer, Integer> diagonal = (matriz, size) -> {
            int i = 0;
            int j = size - 1;
            int diagonalR = 0;
            int diagonalL = 0;
            while (i < size) {
                diagonalR += matriz.get(i).get(i);
                diagonalL += matriz.get(i).get(j);
                i += 1;
                j -= 1;
            }
            return Math.abs(diagonalR - diagonalL);
        };

//        System.out.println(diagonal.apply(arr, arr.size()));
        return diagonal.apply(arr, arr.size());
    }

}
