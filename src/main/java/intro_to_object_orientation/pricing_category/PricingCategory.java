package intro_to_object_orientation.pricing_category;

import java.time.LocalDate;
import java.time.MonthDay;

public enum PricingCategory {
    年末("12-25", "12-31", 5000),
    年始("01-01", "01-07", 4000);

    private final String start;
    private final String end;
    private final int price;

    PricingCategory(String start, String end, int price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    // シーズンの日付を返す
    int getPrice() {
        return this.price;
    }

    // 日付がどのシーズンに属するかを返す
    private static PricingCategory of(String start, String end) {
        for (PricingCategory season : PricingCategory.values()) {
            if (season.start.equals(start) && season.end.equals(end)) {
                return season;
            }
        }
        throw new IllegalArgumentException("invalid date");
    }
}
