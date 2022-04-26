package intro_to_object_orientation.pair;

// 年齢区分と平日・休日区分の組み合わせ条件を表すクラス
public class Pair {
    Category category;
    DayType dayType;

    private Pair(Category category, DayType dayType) {
        this.category = category;
        this.dayType = dayType;
    }

    // ファクトリメソッド
    public static Pair of(Category category, DayType dayType) {
        return new Pair(category, dayType);
    }
}
