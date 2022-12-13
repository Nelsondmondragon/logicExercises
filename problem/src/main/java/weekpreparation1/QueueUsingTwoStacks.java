package weekpreparation1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.stream.IntStream;

public class QueueUsingTwoStacks {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(option -> {
            try {
                String[] instruction = bufferedReader.readLine()
                        .replaceAll("\\s+$", "").split(" ");
                if (instruction.length > 1) {
                    deque.addLast(Integer.parseInt(instruction[1]));
                } else {
                    if ("2".equals(instruction[0])) {
                        deque.removeFirst();
                    } else {
                        System.out.println(deque.getFirst());
                    }
                }

//                System.out.println(deque);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });


        bufferedReader.close();

    }


}
