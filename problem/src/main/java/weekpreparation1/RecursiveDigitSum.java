package weekpreparation1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RecursiveDigitSum {

    public static void main(String[] args) {
        System.out.println(superDigit("7", 100000));
    }

    public static int superDigit(String n, int k) {

        // Write your code here
        n = String.valueOf(new BigInteger(n).multiply(BigInteger.valueOf(k)));
//        System.out.println(n);
        if (n.length() < 2) {
            return Integer.parseInt(n);
        }
        return superDigit(Arrays.stream(n.split("")).mapToLong(Long::parseLong).reduce(0, Long::sum) + "", 1);
    }


}
