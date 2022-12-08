package weekpreparation1;

import java.util.function.UnaryOperator;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            StringBuilder fizzBuzz = new StringBuilder();
            if (i % 3 == 0) {
                fizzBuzz.append("Fizz");
            }
            if (i % 5 == 0) {
                fizzBuzz.append("Buzz");
            }

            System.out.println(fizzBuzz.toString().isEmpty() ? i : fizzBuzz);
        }
    }
}
