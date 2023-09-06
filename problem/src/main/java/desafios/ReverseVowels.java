import java.util.Arrays;

public class ReverseVowels {

    public static void main(String[] args) {
        System.out.println(reverse("leetcode"));
    }

    static String reverse(String s) {
        char[] sequence = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            boolean bL = exists(sequence[l]);
            boolean bR = exists(sequence[r]);
            if (!bL) {
                l++;
            } else if (!bR) {
                r--;
            } else {
                char aux = sequence[l];
                sequence[l] = sequence[r];
                sequence[r] = aux;
                l++;
                r--;
            }
        }
        return String.valueOf(sequence);
    }

    static boolean exists(char letter) {
        letter = Character.toLowerCase(letter);
        return (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
    }

}
