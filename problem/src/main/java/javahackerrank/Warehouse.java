package javahackerrank;

import java.util.Arrays;
import java.util.List;

public class Warehouse {
    public static void main(String[] args) {
        System.out.println(minTime(Arrays.asList(7, 4, 7)));
    }

    public static int searchMax(List<Integer> packages, int size) {
//        packages.
        int index = size - 1;
        Integer num = packages.get(index);
        packages.set(index, num - 1);
        for (int i = size - 2; i >= 0; i--) {
            if (num <= packages.get(i)) {
                index = i;
                num = packages.get(i);
            }
            packages.set(index, num - 1);
        }

        if (num == 0) {
            return -1;
        }
        return index;
    }

    public static long minTime(List<Integer> packages) {
        Long sum = packages.stream().mapToLong(Integer::longValue).reduce(0, Long::sum);
//        System.out.println(sum);
        int index = 0;
        int size = packages.size();
        while (true) {
            index = searchMax(packages, size);
            if (index < 0) {
                break;
            }
            sum += size - index;
//            packages.stream().map(integer -> integer--);

        }
        return sum;
    }


}
