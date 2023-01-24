package immutable_datamodel_example;

import java.time.LocalDate;
import java.util.EnumSet;

public class DeliveringOrder implements Order,OrderClosable{

    String orderId;
    EnumSet<OrderConstraint> constraints;
    Address deliveryAddress;
    LocalDate deliveryDate;

    public DeliveringOrder(final String orderId, final EnumSet<OrderConstraint> constraints, final Address deliveryAddress, final LocalDate deliveryDate) {
        this.orderId = orderId;
        this.constraints = constraints;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public ClosedOrder close() {
        return new ClosedOrder(orderId(), constraints());
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
