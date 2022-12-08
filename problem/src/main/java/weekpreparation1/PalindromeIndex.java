package weekpreparation1;

import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class PalindromeIndex {


    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaab"));
    }

    public static int palindromeIndex(String s) {
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return -1;
        }
        int start = 0;
        int sFinal = s.length() - 1;
        while (start <= sFinal) {
            if (s.charAt(start) != s.charAt(sFinal)) {
                String original = new StringBuilder(s).deleteCharAt(start).toString();
//                System.out.println(original);
                if (!original.equals(new StringBuilder(original).reverse().toString())) {
                    return sFinal;
                }
                return start;
            }
            start++;
            sFinal--;
        }

        return -1;
    }
}
