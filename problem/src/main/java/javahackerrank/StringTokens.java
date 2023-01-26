package javahackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringTokens {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] split = s.split("[\\s,!?._'@]+");
        System.out.print((s.length() > 0 ? split.length : 0) + "\n" + Arrays.toString(split).replaceAll("[\\[,\\]]", "").replaceAll(" ", "\n"));
    }
//
//    public final List<Integer> numberPrime(int n) {
//        List<Integer> numberPrime = new ArrayList<>();
//        numberPrime.add(2);
//        for (int i = 3; i <= n; i++) {
//            boolean isPrime = true;
//            for (int k = 2; k <= i - 1; k++) {
//                if (i % k == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                numberPrime.add(i);
//            }
//        }
//        return numberPrime;
//    }
//
//    public static List<Integer> decomposition(List<Integer> prime, int n) {
//        List<Integer> decomposition = new ArrayList<>();
//        int indexPrime = 0;
//        while (n > 1) {
//            if (n % prime.get(indexPrime) == 0) {
//                decomposition.add(prime.get(indexPrime));
//                n = (n / prime.get(indexPrime));
//
//                indexPrime = 0;
//            }
//            indexPrime++;
//        }
//        return decomposition;
//    }
}
