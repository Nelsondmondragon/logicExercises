/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author nelso
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer length = sc.nextInt();
        Integer breadth = sc.nextInt();
//        System.out.println(length +" "br);
        System.out.println(new Rectangle(length, breadth).area());
    }

    static class Shape {

        Integer length;
        Integer breadth;

        public Shape(Integer length, Integer breadth) {
            this.length = length;
            this.breadth = breadth;
        }

    }

    static class Rectangle extends Shape {

        public Rectangle(Integer length, Integer breadth) {
            super(length, breadth);
        }

        public Integer area() {
            return length * breadth;
        }

    }
}
