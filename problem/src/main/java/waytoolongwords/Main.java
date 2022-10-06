package waytoolongwords;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.waytoolongwords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nelso
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String words = bf.readLine();
            int size = words.length();
            StringBuilder exit = new StringBuilder(words);
            if (size > 10) {
                exit = new StringBuilder().append(words.charAt(0)).append(size - 2).append(words.charAt(size - 1));
            }
            System.out.println(exit);
        }
    }
    
}
