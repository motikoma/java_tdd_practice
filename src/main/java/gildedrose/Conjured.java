package gildedrose;

public class Conjured implements ICategorizedItem {
    private Item item;

    public Conjured(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        item.decreaseQuality();
        item.decreaseQuality();
        item.decreaseSellIn();
        if (item.sellIn < 0) {
            item.decreaseQuality();
            item.decreaseQuality();
        }
    }
}
