package lab08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static String compressionString(String str){
        String string = "";
        Pattern patt = Pattern.compile("(.)\\1{0,}");
        Matcher match = patt.matcher(str);
        while (match.find()){
            string += match.group(1);
            int count = match.group().length();
            if (count > 1) {
                string += count;
            }
        }
        return string;
    }
}
