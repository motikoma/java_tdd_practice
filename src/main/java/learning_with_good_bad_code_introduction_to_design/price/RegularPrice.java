package learning_with_good_bad_code_introduction_to_design.price;

public class RegularPrice {
    final int amount;

    public RegularPrice(final int amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("amount must be >= 0");
        }
        this.amount = amount;
    }
}
