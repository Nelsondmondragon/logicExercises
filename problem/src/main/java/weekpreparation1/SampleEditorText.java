package weekpreparation1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class SampleEditorText {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder text = new StringBuilder();
        LinkedList<String> load = new LinkedList<>();
        IntStream.range(0, Integer.parseInt(bufferedReader.readLine().trim())).forEach(option -> {
            try {
                String[] types = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                if (types.length > 1) {
                    if (types[0].equals("1"))
                        load.addLast("2" + " " + types[1].length());

                    if (types[0].equals("2"))
                        load.addLast("1" + " " + text.substring(text.length() - Integer.parseInt(types[1])));
                }

                if (types.length < 2) {
                    types = load.removeLast().split(" ");
                }


                caseOption(types, text);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });


        bufferedReader.close();

    }


    private static void caseOption(String[] types, StringBuilder text) {
        BiFunction<StringBuilder, String, StringBuilder> add = StringBuilder::append;
        BiFunction<StringBuilder, Integer, StringBuilder> remove = (original, number) ->
                original.delete(original.length() - number, original.length());
        switch (types[0]) {
            case "1":
                add.apply(text, types[1]);
                break;
            case "2":
                remove.apply(text, Integer.parseInt(types[1]));
                break;
            default:
                System.out.println(text.charAt(Integer.parseInt(types[1]) - 1));
                break;
        }

    }


}
