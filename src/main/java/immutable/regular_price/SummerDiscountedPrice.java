package immutable.regular_price;

public class SummerDiscountedPrice {
    private static final int MIN_AMOUNT = 100;
    private static final int DISCOUNT_AMOUNT = 300;
    private int amount;

    public SummerDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.amount - DISCOUNT_AMOUNT;
        if(discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }
        this.amount = discountedAmount;
    }
}
