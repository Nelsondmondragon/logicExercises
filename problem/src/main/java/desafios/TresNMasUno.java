package desafios;

import java.util.Scanner;

class TresNMasUno {
    public static void main(String[] args) {
        tresNMasUno();
    }

    static void tresNMasUno() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = (n / 2);
            } else {
                n = (n * 3 + 1);
            }
            index++;
        }
        System.out.println(index);
    }

}
