package learning_with_good_bad_code_introduction_to_design.regular_price;

public class RegularDiscountedPrice {
    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 400;
    final int amount;

    public RegularDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.amount - DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }
        this.amount = discountedAmount;
    }
}
