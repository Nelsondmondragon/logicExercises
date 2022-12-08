package weekpreparation1;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class CaesarCipher {


    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
//            System.out.println((char) i + " " + i);
        }

        caesarCipher("dd", 27);

    }


    public static String caesarCipher(String s, int k) {
        StringBuilder encoder = new StringBuilder(s);
        if (k > 26) {
            k = (k % 26);
        }
        for (int i = 0; i < encoder.length(); i++) {
            int value = encoder.charAt(i);
//            int letter = (value + k);
            BinaryOperator<Integer> index = (chart, charEncoder) -> {
                if (chart > 96 && chart < 123) {
                    if (charEncoder > 122) {
                        return 96 + (charEncoder - 122);
                    }
                    return charEncoder;
                }
                if (chart > 64 && chart < 91) {
                    if (charEncoder > 90) {
                        return 64 + (charEncoder - 90);
                    }
                    return charEncoder;
                }
                return chart;
            };

            encoder.setCharAt(i, (char) index.apply(value, value + k).intValue());
        }
        return encoder.toString();
    }
}
