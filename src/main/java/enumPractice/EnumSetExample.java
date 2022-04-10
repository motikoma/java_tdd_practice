package enumPractice;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    enum Season {
        Spring, Summer, Fall, Winter
    }

    Set<Season> set = EnumSet.of(Season.Spring, Season.Summer);

    void call() {
        System.out.println(set.contains(Season.Fall));
        set.forEach(System.out::println);
    }
}
