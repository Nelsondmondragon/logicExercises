package desafios;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] characters = {'h', 'e', 'l', 'l', 'o'};
        reverseString(characters);
    }


    static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        char tem;
        while (l < r) {
            if (s[r] != s[l]) {
                tem = s[r];
                s[r] = s[l];
                s[l] = tem;
            }
            l++;
            r--;
        }
        System.out.println(Arrays.toString(s));
    }
}
