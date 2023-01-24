package immutable_datamodel_example;

public enum OrderConstraint {
    SHIPPING_JAPAN_ONLY("address", "This order is shipping only for Japan"),
    DELIVERY_WEEKDAY("deliveryTime", "This order can deliver only on weekday");
    private final String name;
    private final String errorMessage;

    OrderConstraint(final String name, final String errorMessage) {
        this.name = name;
        this.errorMessage = errorMessage;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
}
