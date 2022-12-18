package weekpreparation1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlippinMatriz {

    public static void main(String[] args) {

//        flippingMatrix()

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sumAn = 0;
        int sumDe = 0;

        List<String> l = new ArrayList<>(List.of("Java", "angular"));



        for (int i = 0; i < matrix.get(0).size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                if (i < (matrix.size() / 2)) {
                    sumAn += matrix.get(j).get(i);
                }
                if (i >= (matrix.size() / 2)) {
                    sumDe += matrix.get(j).get(i);
                }
            }
            if (sumAn < sumDe) {
                int start = 0;
                int end = matrix.size();
                while (start < end) {
//                    matrix

                    start++;
                    end--;

                }

            }
        }


        return 0;
    }
}
