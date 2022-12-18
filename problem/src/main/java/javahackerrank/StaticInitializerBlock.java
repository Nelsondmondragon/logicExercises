/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahackerrank;

import java.util.Scanner;

/**
 *
 * @author nelso
 */
public class StaticInitializerBlock {

    static byte b = 0;
    static byte h = 0;

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        b=sc.nextByte();
        h=sc.nextByte();
        if(b<1 || h < 1){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(b*h);
        }
    }

}
