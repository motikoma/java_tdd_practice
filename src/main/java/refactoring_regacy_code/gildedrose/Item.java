package refactoring_regacy_code.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void decreaseQuality() {
        quality = quality - 1;
    }

    void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    void decreaseSellIn() {
        sellIn = sellIn - 1;
    }
}