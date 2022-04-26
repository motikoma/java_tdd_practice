package immutable.gift_point;

public class GiftPoint {
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBERSHIP_POINT = 3000;
    private static final int PREMIUM_MEMBERSHIP_POINT = 10000;
    final int value;

    private GiftPoint(final int value) {
        if(value < MIN_POINT) {
            throw new IllegalArgumentException("value must be greater than or equal to " + MIN_POINT);
        }
        this.value = value;
    }

    public static GiftPoint forStandardMembership() {
        return new GiftPoint(STANDARD_MEMBERSHIP_POINT);
    }

    public static GiftPoint forPremiumMembership() {
        return new GiftPoint(PREMIUM_MEMBERSHIP_POINT);
    }
}
