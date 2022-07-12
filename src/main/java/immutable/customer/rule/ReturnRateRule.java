package immutable.customer.rule;

import immutable.customer.PurchaseHistory;

public class ReturnRateRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return history.returnRate <= 0.001;
    }
}
