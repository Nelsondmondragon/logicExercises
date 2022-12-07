package weekpreparation1;

public class CaesarCipher {


    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println((char) i + " " + i);
        }
    }


    public static String caesarCipher(String s, int k) {
        StringBuilder encoder = new StringBuilder(s);
        for (int i = 0; i < encoder.length(); i++) {
            //97 122
            int value = encoder.charAt(i);
            int letter = (value + k);
            if (value > 96 && value < 123) {
                if (letter > 122) {
                    letter = 96 + (letter - 122);
                }
            }
            if (value > 64 && value < 91) {
                if (letter > 90) {
                    letter = 64 + (letter - 90);
                }
            }
            encoder.setCharAt(i, (char) letter);
        }
        return encoder.toString();
    }
}
