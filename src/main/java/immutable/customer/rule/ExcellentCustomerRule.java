package immutable.customer.rule;

import immutable.customer.PurchaseHistory;

public interface ExcellentCustomerRule {
    /**
     * @param history 購入履歴
     * @return 条件を満たす場合true
     */
    boolean ok(final PurchaseHistory history);
}
