package immutable_datamodel_example;

import java.time.LocalDate;

public interface Deliverable {
    DeliveringOrder deliver(Address deliveryAddress, LocalDate deliveryDate);
}
