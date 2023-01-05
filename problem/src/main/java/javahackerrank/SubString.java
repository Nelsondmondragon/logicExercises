package javahackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SubString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        System.out.println(s.substring(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

}
