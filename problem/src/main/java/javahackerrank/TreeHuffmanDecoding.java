package javahackerrank;

public class TreeHuffmanDecoding {

    void decode(String s, Node root) {
        if (root != null) {
            if (root.data != Character.MIN_VALUE) {
                System.out.println(root.data);
                decode(s,root);
            } else {
                if (s.charAt(0) == '1') {
                    decode(s.substring(1), root.right);
                } else {
                    decode(s.substring(1), root.left);
                }
            }

        }

    }

    static class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }
}
