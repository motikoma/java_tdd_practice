package immutable.customer.rule;

import immutable.customer.PurchaseHistory;

public class
PurchaseFrequencyRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 10 <= history.purchaseFrequencyPerMonth;
    }
}
