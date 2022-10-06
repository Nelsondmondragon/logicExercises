package watermelon;

//package com.watermelon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Watermelon;

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
        int w = Integer.parseInt(bf.readLine());
        StringBuilder s;
        if(w % 2 == 0 && w > 3){
            s = new StringBuilder("YES");
        }else{
            s = new StringBuilder("NO");
        }
        System.out.println(s);
    }
}
