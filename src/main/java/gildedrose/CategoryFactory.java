package gildedrose;

public class CategoryFactory {

    public static ICategorizedItem create(Item item) {
        if (isSulfuras(item)) {
            return new Sulfuras(item);
        } else if (isAgedBrie(item)) {
            return new AgedBrie(item);
        } else if (isBackstagePass(item)) {
            return new BackstagePass(item);
        } else {
            return new NormalItem(item);
        }
    }

    private static boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private static boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private static boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }
}
