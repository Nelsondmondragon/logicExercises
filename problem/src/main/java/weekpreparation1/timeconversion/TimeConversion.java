package weekpreparation1.timeconversion;

import javax.xml.transform.Result;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.SimpleFormatter;

public class TimeConversion {
    public static String timeConversion(String s) throws Exception {
//        SimpleDateFormat f2 = new SimpleDateFormat("hh:mm:ss a");
//        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
//        return f.format(f2.parse(s));
        StringBuilder hourNew = new StringBuilder(s);
        Map<String, String> hourReplace = new HashMap<>();
        hourReplace.put("12", "00");
        hourReplace.put("01", "13");
        hourReplace.put("02", "14");
        hourReplace.put("03", "15");
        hourReplace.put("04", "16");
        hourReplace.put("05", "17");
        hourReplace.put("06", "18");
        hourReplace.put("07", "19");
        hourReplace.put("08", "20");
        hourReplace.put("09", "21");
        hourReplace.put("10", "22");
        hourReplace.put("11", "23");

        int size = hourNew.length();
        if (hourNew.substring(size - 2, size).equals("PM")) {
            if (!hourNew.substring(0, 2).equals("12")) {
                hourNew.replace(0, 2, hourReplace.get(hourNew.substring(0, 2)));
            }

        } else {
            if (hourNew.substring(0, 2).equals("12")) {
                hourNew.replace(0, 2, hourReplace.get("12"));
            }
        }
        hourNew.delete(size - 2, size);
        return hourNew.toString();
    }

    public static void main(String[] args) throws Exception {

        System.out.println(timeConversion("01:05:45AM")
        );
    }
}
