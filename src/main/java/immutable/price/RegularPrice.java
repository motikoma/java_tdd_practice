package immutable.price;

public class RegularPrice {
    final int amount;

    public RegularPrice(final int amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("amount must be >= 0");
        }
        this.amount = amount;
    }
}
