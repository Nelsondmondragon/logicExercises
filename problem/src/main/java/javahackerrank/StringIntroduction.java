package javahackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        StringBuilder string = new StringBuilder();
        string.append(A.length()).append(B.length()).append("\n");
        string.append((A.compareTo(B) > 0) ? "Yes\n" : "No\n");
        string.append(A.substring(0, 1).toUpperCase()).append(A.substring(1)).append(" ");
        string.append(B.substring(0, 1).toUpperCase()).append(B.substring(1));
        System.out.println(string);
        sc.close();
    }

}
