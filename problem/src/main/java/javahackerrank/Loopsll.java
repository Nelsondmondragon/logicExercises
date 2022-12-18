/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author nelso
 */
public class Loopsll {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bf.readLine());

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int resul[] = new int[n];
            resul[0] = a + 1 * b;
            for (int j = 1; j < n; j++) {
                resul[j] = resul[j - 1] + (int) Math.pow(2, j) * b;
            }
            System.out.println(Arrays.toString(resul).replaceAll("[\\[/\\]/\\,]", ""));
        }

    }
}
