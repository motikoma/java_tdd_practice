package junit4_introduction_to_practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static String toSnackCase(String text) {
        if(text == null || text.isEmpty()) throw new IllegalArgumentException("text is null or empty");
        String snake = text;
        Pattern p = Pattern.compile("([A-Z])");
        for(;;){
            Matcher m = p.matcher(snake);
            if(!m.find()) break;
            snake = m.replaceFirst("_" + m.group(1).toLowerCase());
        }
        return snake.replaceFirst("^_", "");
    }
}
