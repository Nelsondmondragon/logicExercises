package javahackerrank;

public class Anagrams {

    public static void main(String[] args) {

    }

    static boolean isAnagram(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
        // Complete the function
        while (!a.isEmpty() || !b.isEmpty()) {
            if (a.isEmpty() | b.isEmpty()) {
                return false;
            }
            b = b.replaceFirst(a.charAt(0) + "", "");
            a = a.substring(1);
        }
        return true;
    }
}
