package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalIntersection {

    public static void main(String[] args) {
//        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
//        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] firstList = {{14, 16}};
        int[][] secondList = {{7, 13}, {16, 20}};
        System.out.println(Arrays.toString(intervalIntersection(firstList, secondList)));
    }

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<List<Integer>> lists = new ArrayList<>();
        int first = 0;
        int second = 0;
        while (first < firstList.length && second < secondList.length) {

            if (firstList[first][0] >= secondList[second][0] && firstList[first][0] <= secondList[second][1]) {
                if (firstList[first][1] < secondList[second][1]) {
                    lists.add(Arrays.asList(firstList[first][0], firstList[first][1]));
                    first++;
                } else {
                    lists.add(Arrays.asList(firstList[first][0], secondList[second][1]));
                    second++;
                }
            } else if (secondList[second][0] >= firstList[first][0] && secondList[second][0] <= firstList[first][1]) {
                if (secondList[second][1] < firstList[first][1]) {
                    lists.add(Arrays.asList(secondList[second][0], secondList[second][1]));
                    second++;
                } else {
                    lists.add(Arrays.asList(secondList[second][0], firstList[first][1]));
                    first++;
                }
            } else {
                if (secondList[second][1] < firstList[first][0]) {
                    second++;
                } else {
                    first++;
                }
            }
        }
        int[][] matrix = new int[lists.size()][2];
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = lists.get(i).get(j);
            }
        }
        return matrix;
    }

    public static int[][] intervalIntersection2(int[][] firstList, int[][] secondList) {

         List<int[]> lists = new ArrayList<>();
        int first = 0;
        int second = 0;
        while (first < firstList.length && second < secondList.length) {
            int max= Math.max(firstList[first][0], secondList[second][0]);
            int min = Math.min(firstList[first][1], secondList[second][1]);
            if(max<=min){
                lists.add(new int[]{max,min});
            }

            if(firstList[first][1]>secondList[second][1]){
                second++;
            }else{
                first++;
            }

        }
        int[][] matrix = new int[lists.size()][2];
        for (int i = 0; i < lists.size(); i++) {
                matrix[i] = lists.get(i);
        }
        return matrix;
    }
}
