package desafios;

import java.util.Arrays;
import java.util.List;

public class WithMostWater {
    public static void main(String[] args) {
        List<Integer> alturas = Arrays.asList(8,1,6,2,5,4,1,3,7);
        System.out.println(areaMayor(alturas));
    }


    static int areaMayor(List<Integer> alturas) {
        int first = 0;
        int last = alturas.size() - 1;
        int area = 0;
        int altura = 0;
        while (first != last) {
            altura = Math.min(alturas.get(first), alturas.get(last));
            int base = last - first;
            if (base * altura > area) {
                area = base * altura;
            }
            if (alturas.get(first) > alturas.get(last)) {
                last--;
            } else {
                first++;
            }
        }
        return area;
    }
}
