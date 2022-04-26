package refactoring_regacy_code.gildedrose;

public class AgedBrie implements ICategorizedItem {
    private Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        item.increaseQuality();
        item.decreaseSellIn();
        if (item.sellIn < 0) {
            item.increaseQuality();
        }
    }

}
