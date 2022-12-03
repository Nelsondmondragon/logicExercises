/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esteban;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nelso
 */
public class Optimizacion {

    public static void main(String[] args) {
//        int costos[] = {19, 8, 4, 11, 3, 33, 86, 21, 95, 77, 44, 18, 24, 89, 23};
//        int saltos[] = {1, 2, 2, 3, 1, 1, 2, 3, 1, 2, 3, 3, 1, 1, 2};

        int costos[] = {19, 8, 4, 11};
        int saltos[] = {1, 2, 2, 3};

        int sum = 0;
        for (int i = 0; i < costos.length; i++) {
            sum += costos[i];
        }

        System.out.println("Acaaa " + sum);
        System.out.println(algoritmo(costos, saltos, 0, saltos[0]));

    }

    public static int algoritmo(int[] costos, int[] saltos, int index, int salto) {

        if (index >= costos.length) {
            return 0;
        }

        if (salto <= 0) {
            return algoritmo(costos, saltos, index, saltos[index]);
        }

        return Math.min(costos[index] + algoritmo(costos, saltos, index + 1, saltos[index] - 1),
                costos[index] + algoritmo(costos, saltos, index + 2, saltos[index] - 2));

    }

}
