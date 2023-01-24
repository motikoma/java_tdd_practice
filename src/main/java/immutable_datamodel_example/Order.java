package immutable_datamodel_example;

import java.util.EnumSet;

public interface Order {
    String orderId();
    EnumSet<OrderConstraint> constraints();
}
