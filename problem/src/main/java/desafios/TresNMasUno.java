package desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class TresNMasUno {
    public static void main(String[] args) throws IOException {
        BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
        String input;
        ArrayList<Long> conjeture = tresNMasUno();
        while ((input = tc.readLine()) != null && !input.trim().equals("\n") && !input.trim().equals("")) {
            StringTokenizer tokenizer = new StringTokenizer(input);
            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());
            System.out.println(i + " " + j + " " +
                    Collections.max(conjeture.subList(Math.min(i, j) - 1, Math.max(i, j))));
        }

    }

    public static ArrayList<Long> tresNMasUno() {
        ArrayList<Long> conjeture = new ArrayList<>();
        conjeture.add(1L);
        long n;
        for (int i = 2; i <= 1000000; i++) {
            n = i;
            long index = 1;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = (n / 2);
                } else {
                    n = (n * 3 + 1);
                }
                index++;
            }
            conjeture.add(index);
        }
        return conjeture;
    }

}
