package javahackerrank;

import java.io.IOException;
import java.util.*;

public class StringTokens {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String s[]=bufferedReader.readLine().trim().split("[\\s+" +
//                ",!?._'@]+");
//        System.out.println(s[0].equals(""));
//        System.out.print(s.length+"\n"+Arrays.toString(s).replaceAll("[\\[,\\]]","").replaceAll(" ","\n"));
////        Arrays.stream(s).forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
//        List<Integer> deList = decomposition(numberPrime(n), n);
//        deList.forEach(System.out::println);

    }

    public final List<Integer> numberPrime(int n) {
        List<Integer> numberPrime = new ArrayList<>();
        numberPrime.add(2);
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (int k = 2; k <= i - 1; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numberPrime.add(i);
            }
        }
        return numberPrime;
    }

    public static List<Integer> decomposition(List<Integer> prime, int n) {
        List<Integer> decomposition = new ArrayList<>();
        int indexPrime = 0;
        while (n > 1) {
            if (n % prime.get(indexPrime) == 0) {
                decomposition.add(prime.get(indexPrime));
                n = (n / prime.get(indexPrime));

                indexPrime = 0;
            }
            indexPrime++;
        }
        return decomposition;
    }
}
