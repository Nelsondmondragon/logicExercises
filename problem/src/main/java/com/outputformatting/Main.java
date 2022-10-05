/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.outputformatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author nelso
 */
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            String s1 = String.valueOf(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            System.out.print(String.format("%-15s", s1));
            System.out.println(String.format("%03d", x));
        }
        System.out.println("================================");
    }
}
