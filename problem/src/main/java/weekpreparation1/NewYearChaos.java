package weekpreparation1;

import com.sun.source.tree.Tree;

import java.util.*;

public class NewYearChaos {
    public static void main(String[] args) {
        minimumBribes(List.of(1, 2, 5, 3, 4, 7, 8, 6));
    }


    public static void minimumBribes(List<Integer> q) {
        // Write your code here

        LinkedList<Integer> numbersSort = new LinkedList<>(q);

        LinkedList<Integer> numberInput = new LinkedList<>(q);

        int jumps = 0;
        StringBuilder too = new StringBuilder();
        Collections.sort(numbersSort);
        while (true) {
            int tem = numberInput.getFirst();
            if (numbersSort.getFirst() != tem) {
                int jumpsAlone = numbersSort.indexOf(tem);
                if (jumpsAlone > 2) {
                    too.append("Too chaotic");
                    break;
                }
                jumps += jumpsAlone;
            }
            numbersSort.remove((Integer) tem);
            numberInput.removeFirst();
            if (numberInput.isEmpty()) {
                break;
            }
        }
        System.out.println(too.toString().isEmpty() ? jumps : too);
    }


//    public static void minimumBribes(List<Integer> q) {
//        // Write your code here
//        List<Integer> numbersSort = new ArrayList<>();
//
//        List<Integer> numbersInput = new ArrayList<>(q);
//        int jumps = 0;
//        numbersSort.add(numbersInput.get(0));
//        numbersInput.remove(0);
//        boolean isChaotic = false;
//        while (!numbersInput.isEmpty()) {
//            numbersSort.add(numbersInput.get(0));
//            numbersInput.remove(0);
//            int size = numbersSort.size() - 1;
//            int jumpsAlone = 0;
//            while (size > 0 && numbersSort.get(size) < numbersSort.get(size - 1)) {
//                int tem = numbersSort.get(size - 1);
//                numbersSort.set(size - 1, numbersSort.get(size));
//                numbersSort.set(size, tem);
//                size--;
//                jumpsAlone++;
//                if (jumpsAlone > 2) {
//                    isChaotic = true;
//                    break;
//                }
//                jumps++;
//            }
//            if (isChaotic)
//                break;
//
//        }
//        System.out.println(isChaotic ? "Too chaotic" : jumps);
//    }
}
