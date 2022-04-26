package refactoring_regacy_code.gildedrose;

public class Sulfuras implements ICategorizedItem {
    private Item item;

    public Sulfuras(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        // Nothing to do
    }
}
