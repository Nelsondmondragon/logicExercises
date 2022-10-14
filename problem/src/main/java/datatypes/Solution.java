/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= (long) (Math.pow(2, 15) * -1) && x < (long) Math.pow(2, 15)) {
                    System.out.println("* short");
                }
                if (x >= (long) (Math.pow(2, 31) * -1) && x < (long) Math.pow(2, 31)) {
                    System.out.println("* int");
                }
                if (x >= (long) (Math.pow(2, 63) * -1) && x <= (long) Math.pow(2, 63)) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
