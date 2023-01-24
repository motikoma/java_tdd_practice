package immutable_datamodel_example;

import java.util.EnumSet;

public class ClosedOrder implements Order {
    String orderId;
    EnumSet<OrderConstraint> constraints;

    public ClosedOrder(final String orderId, final EnumSet<OrderConstraint> constraints) {
        this.orderId = orderId;
        this.constraints = constraints;
    }

    @Override
    public String orderId() {
        return orderId;
    }

    @Override
    public EnumSet<OrderConstraint> constraints() {
        return constraints;
    }
}
