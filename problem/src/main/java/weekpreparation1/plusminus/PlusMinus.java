package weekpreparation1.plusminus;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {


    public static void main(String[] args) {
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }


    public static void plusMinus(List<Integer> arr) {
        double positive = arr.stream().filter(x -> x > 0).count();
        double negative = arr.stream().filter(x -> x < 0).count();
        double zero = arr.stream().filter(x -> x == 0).count();
        double size = arr.size();

        DecimalFormat format = new DecimalFormat("000.000000");

        System.out.println(format.format((positive / size)));
        System.out.println(format.format((negative / size)));
        System.out.println(format.format((zero / size)));

    }


}
