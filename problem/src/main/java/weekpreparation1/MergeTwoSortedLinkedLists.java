package weekpreparation1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int cases = Integer.parseInt(bufferedReader.readLine().trim());


        IntStream.range(0, cases).forEach(option -> {
            List<Integer> listSorted = new ArrayList<>();

            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.stream().spliterator()

            try {
                int size = Integer.parseInt(bufferedReader.readLine().trim());
                for (int i = 0; i < size; i++) {
                    listSorted.add(Integer.parseInt(bufferedReader.readLine().trim()));
                }

//                System.out.println(listSorted);

                size = Integer.parseInt(bufferedReader.readLine().trim());
                for (int i = 0; i < size; i++) {

                    listSorted.add(Integer.parseInt(bufferedReader.readLine().trim()));
                    int sizeList = listSorted.size() - 1;
                    while (sizeList > 0 && listSorted.get(sizeList) < listSorted.get(sizeList - 1)) {
                        int temp = listSorted.get(sizeList - 1);
                        listSorted.set(sizeList - 1, listSorted.get(sizeList));
                        listSorted.set(sizeList, temp);
                        sizeList--;
                    }
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            StringBuilder output = new StringBuilder(listSorted.toString());
            System.out.println(output.deleteCharAt(0).deleteCharAt(output.length() - 1).toString().replaceAll(",", ""));

        });
        bufferedReader.close();
    }
}
