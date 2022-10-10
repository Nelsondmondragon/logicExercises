/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package team;

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
        BufferedReader tc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(tc.readLine());
        int problems = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(tc.readLine());
            int petya = Integer.parseInt(st.nextToken());
            int vasya = Integer.parseInt(st.nextToken());
            int tonya = Integer.parseInt(st.nextToken());
            if ((petya + vasya + tonya) >= 2) {
                problems++;
            }
        }
        System.out.println(problems);
    
        /*
        
         //////df
        */
    
    }
}
