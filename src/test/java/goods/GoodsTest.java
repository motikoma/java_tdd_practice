package goods;

import goods.Goods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoodsTest {

    private Goods ice;

    @BeforeEach
    void setUp() {
        ice = new Goods("ice", 100);
    }

    @Test
    void _商品価格のテスト() {
        assertEquals(100, ice.getPrice());
    }

    @Nested
    class _税込価格のテスト{
        @Test
        void _iceの場合() {
            assertEquals(110, ice.getTaxIncludedPrice());
        }

        @Test
        void _juiceの場合() {
            ice = new Goods("juice", 110);
            assertEquals(121, ice.getTaxIncludedPrice());
        }
    }
}