package learning_with_good_bad_code_introduction_to_design.order;

public enum OrderConstraint {
    SHIPPING_JAPAN_ONLY("address", "This order is shipping only for Japan");


    private final String name;
    private final String errorMessage;

    private OrderConstraint(final String name) {
        this.name = name;
    }
}
