package javahackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;

public class JvaCurrencyFormatter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double payment = Double.parseDouble(bufferedReader.readLine().trim());

        Function<Locale, String> currency = (locale) -> NumberFormat.getCurrencyInstance(locale).format(payment);

        String india = String.format("%,.2f", payment);

        System.out.println("US: " + currency.apply(Locale.US));
        System.out.println("India: Rs." + india);
        System.out.println("China: ￥" + currency.apply(Locale.CHINA));
        System.out.print("France: " + currency.apply(Locale.FRANCE));

    }


}
