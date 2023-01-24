package immutable_datamodel_example;

import java.time.LocalDate;
import java.util.EnumSet;

public class InProgressOrder implements Order, Deliverable {
    String orderId;
    EnumSet<OrderConstraint> constraints;

    public InProgressOrder(final String orderId, final EnumSet<OrderConstraint> constraints) {
        this.orderId = orderId;
        this.constraints = constraints;
    }

    @Override
    public DeliveringOrder deliver(final Address deliveryAddress, final LocalDate deliveryDate) {
        return new DeliveringOrder(orderId, constraints, deliveryAddress, deliveryDate);
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
