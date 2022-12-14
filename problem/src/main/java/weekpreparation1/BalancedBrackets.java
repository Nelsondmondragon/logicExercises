package weekpreparation1;

public class BalancedBrackets {

    public static void main(String[] args) {


        System.out.println(isBalanced("{(([])[])[]}[]"));

    }

    public static boolean delete(char start, char end) {
        switch (start) {
            case '{':
                if (end == '}') {
                    return true;
                }
                break;
            case '[':
                if (end == ']') {
                    return true;
                }
                break;
            case '(':
                if (end == ')') {
                    return true;
                }
                break;

        }
        return false;
    }


    public static String isBalanced(String s) {
        // Write your code here

        StringBuilder string = new StringBuilder(s);
        int i = 0;
        while (i < string.length() - 1) {
            if (delete(string.charAt(i), string.charAt(i + 1))) {
//                System.out.println(i);
                string.delete(i, i + 2);
//                System.out.println(string);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        return string.length() == 0 ? "YES" : "NO";
    }


}
