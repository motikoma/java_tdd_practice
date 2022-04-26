package refactoring_regacy_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import refactoring_regacy_code.gildedrose.GildedRose;
import refactoring_regacy_code.gildedrose.Item;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    private Item[] items;

    @Nested
    class _通常商品の場合 {

        @BeforeEach
        void setup(){
            items = new Item[]{new Item("foo", 20, 30)};
        }

        @Test
        void _通常商品で更新しても商品名は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals("foo", app.items[0].name);
        }

        @Test
        void _通常商品で更新するとsellIn値が1減る() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(19, app.items[0].sellIn);
        }

        @Test
        void _通常商品で更新するとquality値が1減る() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(29, app.items[0].quality);
        }

        @Nested
        class _sellInが0に近い場合{
            @Test
            void _通常商品でsellInが1のとき更新するとquality値が1減る() {
                items = new Item[]{new Item("foo", 1, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(29, app.items[0].quality);
            }

            @Test
            void _通常商品でsellInが0のとき更新するとquality値が2減る() {
                items = new Item[]{new Item("foo", 0, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(28, app.items[0].quality);
            }
        }
    }

    @Nested
    class _Sulfurasの場合 {

        @BeforeEach
        void setup(){
            items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 20, 30)};
        }

        @Test
        void _Sulfurasで更新しても商品名は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        }

        @Test
        void _Sulfurasで更新してもsellIn値は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(20, app.items[0].sellIn);
        }

        @Test
        void _Sulfurasで更新してもquality値は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(30, app.items[0].quality);
        }

        @Test
        void _SulfurasでSellInがマイナス1のとき更新してもquality値は変わらない() {
            items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 30)};
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(30, app.items[0].quality);
        }
    }

    @Nested
    class _AgedBrieの場合 {
        @BeforeEach
        void setup(){
            items = new Item[]{new Item("Aged Brie", 20, 30)};
        }

        @Test
        void _AgedBrieで更新しても商品名は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals("Aged Brie", app.items[0].name);
        }

        @Test
        void _AgedBrieで更新するとsellIn値は1減る() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(19, app.items[0].sellIn);
        }

        @Test
        void _AgedBrieで更新するとquality値が1増える() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(31, app.items[0].quality);
        }

        @Nested
        class _sellInが0に近い場合{
            @Test
            void _AgedBrieでSellInが1のとき更新するとquality値が1増える() {
                items = new Item[]{new Item("Aged Brie", 1, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(31, app.items[0].quality);
            }

            @Test
            void _AgedBrieでSellInが0のとき更新するとquality値が2増える() {
                items = new Item[]{new Item("Aged Brie", 0, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(32, app.items[0].quality);
            }
        }
    }

    @Nested
    class _BackstagePassの場合 {
        @BeforeEach
        void setup(){
            items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 20, 30)};
        }

        @Test
        void _BackstagePassで更新しても商品名は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        }

        @Test
        void _BackstagePassで更新するとsellIn値は1減る() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(19, app.items[0].sellIn);
        }

        @Test
        void _BackstagePassで更新するとquality値が1増える() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(31, app.items[0].quality);
        }

        @Nested
        class _sellInが0に近い場合{
            @Test
            void _BackstagePassでSellInが11のとき更新するとquality値が1増える() {
                items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 11, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(31, app.items[0].quality);
            }

            @Test
            void _BackstagePassでSellInが10のとき更新するとquality値が2増える() {
                items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(32, app.items[0].quality);
            }

            @Test
            void _BackstagePassでSellInが6のとき更新するとquality値が2増える() {
                items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 6, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(32, app.items[0].quality);
            }

            @Test
            void _BackstagePassでSellInが5のとき更新するとquality値が3増える() {
                items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(33, app.items[0].quality);
            }

            @Test
            void _BackstagePassでSellInが1のとき更新するとquality値が3増える() {
                items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 1, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(33, app.items[0].quality);
            }

            @Test
            void _BackstagePassでSellInが0のとき更新するとquality値が2増える() {
                items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(0, app.items[0].quality);
            }
        }
    }

    @Nested
    class _Conjuredの場合 {
        @BeforeEach
        void setup(){
            items = new Item[]{new Item("Conjured", 20, 30)};
        }

        @Test
        void _Conjuredで更新しても商品名は変わらない() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals("Conjured", app.items[0].name);
        }

        @Test
        void _Conjuredで更新するとsellIn値は1減る() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(19, app.items[0].sellIn);
        }

        @Test
        void _Conjuredで更新するとquality値が2減る() {
            GildedRose app = new GildedRose(items);
            app.updateQuality();
            assertEquals(28, app.items[0].quality);
        }

        @Nested
        class _sellInが0に近い場合 {
            @Test
            void _ConjuredでsellIn値が1のとき更新するとquality値が2減る(){
                items = new Item[]{new Item("Conjured", 1, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(28, app.items[0].quality);
            }

            @Test
            void _ConjuredでsellIn値が0のとき更新するとquality値が4減る(){
                items = new Item[]{new Item("Conjured", 0, 30)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals(26, app.items[0].quality);
            }
        }
    }
}