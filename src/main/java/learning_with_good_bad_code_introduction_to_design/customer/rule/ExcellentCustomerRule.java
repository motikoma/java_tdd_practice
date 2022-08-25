package learning_with_good_bad_code_introduction_to_design.customer.rule;

import learning_with_good_bad_code_introduction_to_design.customer.PurchaseHistory;

public interface ExcellentCustomerRule {
    /**
     * @param history 購入履歴
     * @return 条件を満たす場合true
     */
    boolean ok(final PurchaseHistory history);
}
