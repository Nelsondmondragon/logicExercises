package weekpreparation1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridChallenge {


    public static void main(String[] args) {

        System.out.println(gridChallenge(List.of("abc",
                "hjk",
                "mpq",
                "rtv")));
    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here

        List<char[]> grid2 = grid.stream().map(text -> {
                    char[] charArray = text.toCharArray();
                    Arrays.sort(charArray);
                    return charArray;
                }
        ).collect(Collectors.toList());

        int i = 0;
        int size = grid.get(0).length();
        while (i < size) {
            int j = 0;
            while (j < (size - 1)) {
                if (grid2.get(j)[i] > grid2.get(j + 1)[i]) {
                    return "NO";
                }
                j++;
            }
            i++;
        }
        return "YES";
    }

}
