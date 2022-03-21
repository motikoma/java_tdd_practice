package junit4IntroductionToPractice;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {
    private List<Item> itemStock = new ArrayList();

    public List<Item> getStock() {
        return itemStock;
    }

    public void add(Item item) {
        itemStock.add(item);
    }
}
