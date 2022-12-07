package weekpreparation1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LonelyInteger {


    public static void main(String[] args) {

        System.out.println(lonelyinteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    public static int lonelyinteger(List<Integer> a) {
        List<Integer> unico = new ArrayList<>();
        for (Integer num : a) {
            if (!unico.contains(num)) {
                unico.add(num);
                continue;
            }
            unico.remove(num);
        }

        return unico.get(0);
    }


}
