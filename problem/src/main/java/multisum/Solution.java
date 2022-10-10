/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multisum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) throws Exception {
        BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
        String input = tc.readLine();
        Arithmetic n = new Arithmetic();
        System.out.println(n.sum(input.split("\\ ")));
    }

    static class Arithmetic {
        public String sum(String[] ints) {
            int size = ints.length;
            Integer sum = 0;
            String sum2 = "";
            try {
                for (int i = 0; i < size; i++) {
                    sum += Integer.parseInt(ints[i]);
                }
                return String.valueOf(sum);
            } catch (Exception e) {
                for (int i = 0; i < size; i++) {
                    sum2 += ints[i];
                }
                return sum2;
            }

        }
    }

}
