package immutable.price;

public final class DiscountedPrice {
    final int amount;

    public DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
        this.amount = (int) (regularPrice.amount - (regularPrice.amount * discountRate.rate));
    }
}


