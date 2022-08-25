package learning_with_good_bad_code_introduction_to_design.price;

public final class DiscountedPrice {
    final int amount;

    public DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
        this.amount = (int) (regularPrice.amount - (regularPrice.amount * discountRate.rate));
    }
}
