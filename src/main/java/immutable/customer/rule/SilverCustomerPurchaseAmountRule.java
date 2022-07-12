package immutable.customer.rule;

import immutable.customer.PurchaseHistory;

public class SilverCustomerPurchaseAmountRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 50000 <= history.totalAmount;
    }
}
