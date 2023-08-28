package desafios;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] altura = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(trappingRainWater2(altura));

    }

    static int trappingRainWater2(int[] alturas) {
        int l = 0;
        int r = alturas.length - 1;
        int maxL = alturas[l];
        int maxR = alturas[r];
        int sumWater = 0;
        while (l < r) {
            if (maxL > maxR) {
                r--;
                if (alturas[r] < maxR) {
                    sumWater += (maxR - alturas[r]);
                }
                maxR = Math.max(maxR, alturas[r]);

            } else {
                l++;
                if (alturas[l] < maxL) {
                    sumWater += (maxL - alturas[l]);
                }
                maxL = Math.max(maxL, alturas[l]);
            }

        }


        return sumWater;
    }

    static int trappingRainWater(int[] alturas) {

        int indexFirst = 0;
        int indexLast = 1;
        int height = 0;
        int sumWater = 0;
        int auxSumWater = 0;
        while (indexFirst < alturas.length) {
            if (height > 0) {
                if (indexLast >= alturas.length) {
                    auxSumWater = 0;
                    indexFirst++;
                    continue;
                }
                if (alturas[indexLast] < alturas[indexFirst]) {
                    auxSumWater += (Math.abs(alturas[indexLast] - alturas[indexFirst]));
                    indexLast++;
                    continue;
                }
                if (alturas[indexLast] >= alturas[indexFirst]) {
                    sumWater += auxSumWater;
                    indexFirst = indexLast;
                }
            }

            if (alturas[indexFirst] != 0) {
                height = alturas[indexFirst];
                indexLast = indexFirst + 1;
                continue;
            }
            indexFirst++;
        }
        return sumWater;

    }


}
