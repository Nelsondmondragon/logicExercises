package javahackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class MagicSquareForming {
    public static void main(String[] args) {


    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here
        TreeSet<Integer> values = new TreeSet<>();
        for (int i = 0; i < s.size(); i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < s.get(0).size(); j++) {
                row += s.get(i).get(j);
                column += s.get(j).get(i);
            }
            values.add(row);
            values.add(column);
        }
        int cost = 0;
        System.out.println();
        List<Integer> collect = new ArrayList<>(values);
        for (int i = collect.size() - 2; i >= 0; i--) {

            cost += collect.get(collect.size() - 1) - collect.get(i);
        }
        return cost;
    }
}
