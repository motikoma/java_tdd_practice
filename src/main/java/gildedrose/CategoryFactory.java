package gildedrose;

public class CategoryFactory {

    private static final String CONJURED = "Conjured";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGEDBRIE = "Aged Brie";

    public static ICategorizedItem create(Item item) {
        if (isSulfuras(item)) {
            return new Sulfuras(item);
        } else if (isAgedBrie(item)) {
            return new AgedBrie(item);
        } else if (isBackstagePass(item)) {
            return new BackstagePass(item);
        } else if (isConjured(item)) {
            return new Conjured(item);
        } else {
            return new NormalItem(item);
        }
    }

    private static boolean isConjured(Item item) {
        return item.name.equals(CONJURED);
    }

    private static boolean isSulfuras(Item item) {
        return item.name.equals(SULFURAS);
    }

    private static boolean isBackstagePass(Item item) {
        return item.name.equals(BACKSTAGE);
    }

    private static boolean isAgedBrie(Item item) {
        return item.name.equals(AGEDBRIE);
    }
}
