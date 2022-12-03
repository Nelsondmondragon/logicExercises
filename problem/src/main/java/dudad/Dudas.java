package dudad;

import java.io.*;
import java.util.*;

public class Dudas {

    public static void main(String[] args) {
        System.out.println(findMedian(List.of(5, 3, 1, 2, 4)));
    }


    public static int findMedian(List<Integer> arr) {
        List<Integer> arr2 = new ArrayList<>(arr);
        Collections.sort(arr2);

        return arr2.get((arr2.size() / 2));

    }

    public static int getMin(String s) {
        StringBuilder n = new StringBuilder(s);
        int i = 0;
        while (i < n.length()) {
            if (n.charAt(i) == '(') {
                for (int j = i + 1; j < n.length(); j++) {
                    if (n.charAt(j) == ')') {
                        n.deleteCharAt(i);
                        n.deleteCharAt(j);
                    }
                }
            }
            i++;
        }


        return n.length();
    }


    public static int countDuplicate(List<Integer> numbers) {
        Map<Integer, Boolean> unicos = new HashMap<>();
        int count = 0;
        for (Integer num : numbers) {
            if (!unicos.containsKey(num)) {
                unicos.put(num, false);
            } else {
                if (!unicos.get(num)) {
                    count++;
                    unicos.replace(num, true);
                }
            }
        }
        return count;
    }
}



