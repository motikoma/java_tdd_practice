package junit4_introduction_to_practice;

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
