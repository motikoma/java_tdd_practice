package learning_with_good_bad_code_introduction_to_design.customer.rule;

import learning_with_good_bad_code_introduction_to_design.customer.PurchaseHistory;

public class
PurchaseFrequencyRule implements ExcellentCustomerRule {
    public boolean ok(final PurchaseHistory history) {
        return 10 <= history.purchaseFrequencyPerMonth;
    }
}
