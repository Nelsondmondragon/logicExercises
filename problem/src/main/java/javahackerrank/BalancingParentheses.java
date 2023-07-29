package javahackerrank;

public class BalancingParentheses {
    public static void main(String[] args) {
        System.out.println(getMin("()()"));
    }


    public static int getMin(String s) {
        StringBuilder string = new StringBuilder(s);
        int firstIndex = 0;
        int lastIndex = 0;
        while (true) {
            firstIndex = string.indexOf("(");
            lastIndex = string.indexOf(")", firstIndex);

            if (firstIndex >-1  && lastIndex > -1) {
                string.deleteCharAt(lastIndex);
                string.deleteCharAt(firstIndex);
            } else {
                break;

            }

        }
        return string.length();
    }
}
