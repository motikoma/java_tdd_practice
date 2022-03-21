package junit4IntroductionToPractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemStockTest {
    @Test
    public void 初期状態では在庫数は空() {
        List<Item> expected = new ArrayList<>();
        ItemStock sut = new ItemStock();
        assertEquals(expected, sut.getStock());
    }

    @Test
    public void 初期状態でaddすると在庫数は1になる() {
        List<Item> expected = new ArrayList<>();
        ItemStock sut = new ItemStock();
        sut.add(new Item("A", 10));
        assertEquals(1, sut.getStock().size());
        assertEquals(new Item("A", 10), sut.getStock().get(0));
    }
}
