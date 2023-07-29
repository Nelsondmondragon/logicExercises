package javahackerrank;

import java.util.*;

public class Platform {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 0, 1, 2);
        List<Integer> num2= Arrays.asList(8, 7, 6, 9);


        System.out.println(minCost(3, num, num2));


    }


    public static long minCost(int numProjects, List<Integer> projectId, List<Integer> bid) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>(projectId);
//        System.out.println(set.size());
        if (set.size() != numProjects) {
            return -1;
        }
        HashMap<Integer, Integer> min = new HashMap<>();
        for (int i = 0; i <projectId.size(); i++) {
            int key=projectId.get(i);
            if (!min.containsKey(key)){
                min.put(key,bid.get(i));
            }else{
                if (min.get(key)> bid.get(i)){
                    min.replace(key,bid.get(i));
                }
            }
        }
        long sum = 0;

        for (Map.Entry<Integer,Integer> entry: min.entrySet()){
//            System.out.println(entry.getValue());
            sum+=entry.getValue();
        }
//        min.forEach((integer, integer2) -> );
        return sum;

    }
}
