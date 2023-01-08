package javahackerrank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        System.out.println(a.equals(new StringBuilder(a).reverse().toString())?"Yes":"No");



    }
}
