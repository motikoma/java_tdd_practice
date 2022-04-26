package intro_to_object_orientation;

import intro_to_object_orientation.pair.Pair;

import java.util.Map;
import static intro_to_object_orientation.pair.Category.*;
import static intro_to_object_orientation.pair.DayType.*;

public class PriceTable {
    Map<Pair, Integer> prices;

    {
        prices = Map.ofEntries(
                Map.entry(Pair.of(ADULT, WEEKDAY), 1000),
                Map.entry(Pair.of(ADULT, HOLIDAY), 1500),
                Map.entry(Pair.of(CHILD, WEEKDAY), 400),
                Map.entry(Pair.of(CHILD, HOLIDAY), 600));
    }

    Amount price(Pair pair){
        return new Amount(prices.get(pair));
    }
}
