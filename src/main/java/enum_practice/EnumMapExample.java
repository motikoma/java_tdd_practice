package enum_practice;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    Map<Season, String> enumMap = new EnumMap<>(Season.class);

    void call (){
        enumMap.put(Season.SPRING, "春");
        enumMap.put(Season.SUMMER, "秋");
        enumMap.put(Season.WINTER, "冬");

        System.out.println(enumMap.containsKey(Season.SPRING)); // true
        System.out.println(enumMap.containsKey(Season.SUMMER)); // false

        for(Map.Entry<Season, String> entry : enumMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
