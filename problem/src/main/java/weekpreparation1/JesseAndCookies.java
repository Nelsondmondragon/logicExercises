package weekpreparation1;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class JesseAndCookies {

    public static void main(String[] args) {

        System.out.println(cookies(7, List.of(1, 2, 3, 8, 12)));

    }

    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        List<Integer> cookies = new ArrayList<>(A);
        Collections.sort(cookies);
        PriorityQueue<Integer> aux = new PriorityQueue<>(cookies);
        int count = 0;
        while (aux.peek() < k) {
            if (aux.size() > 1) {
                int number = aux.poll();
                System.out.println(aux);

                int number1 = aux.poll();
                System.out.println(aux);

                int combined = number + 2 * number1;
//                System.out.println(aux);
                aux.add(combined);
                System.out.println(aux);

            } else {
                return -1;
            }
            count++;
        }
        return count;
    }


}
