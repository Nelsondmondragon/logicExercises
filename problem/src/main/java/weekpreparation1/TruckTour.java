package weekpreparation1;

import java.util.List;

public class TruckTour {
    public static void main(String[] args) {
    }

    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int auxIndex = 0;
        for (int i = 0; i < petrolpumps.size() - 1; i++) {

            if (petrolpumps.get(i).get(0) < petrolpumps.get(i).get(1)) {
                auxIndex = i;
            } else {
                int auxCombus = petrolpumps.get(i).get(0) - petrolpumps.get(i).get(1);
                petrolpumps.get(i + 1).set(0, petrolpumps.get(i + 1).get(0) + auxCombus);
            }

        }
        return auxIndex + 1;
    }
}
