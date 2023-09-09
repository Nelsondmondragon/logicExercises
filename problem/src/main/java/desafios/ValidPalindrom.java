package desafios;

public class ValidPalindrom {

    public static void main(String[] args) {
        String s ="eeccccbebaeeabebccceea";
        System.out.println(validPalindrome(s));
    }


    static boolean validPalindrome(String s) {
        char[] sequence = s.toCharArray();
        int l = 0;
        int r = sequence.length - 1;
        boolean auxL = false;
        boolean auxR = false;
        int auxIndex = -1;
        while (l < r) {
            if (sequence[l] != sequence[r]) {
                if (auxL || auxR){
                    l=auxIndex;
                    r=(sequence.length-1)-auxIndex;
                }
                auxIndex = l;
                if (sequence[l] == sequence[r - 1] && !auxL) {
                    auxL = true;
                    r--;
                } else if (sequence[l + 1] == sequence[r] && !auxR) {
                    auxR = true;
                    l++;
                } else {
                    return false;
                }
            } else {
                l++;
                r--;
            }


        }
        return true;
    }
}
