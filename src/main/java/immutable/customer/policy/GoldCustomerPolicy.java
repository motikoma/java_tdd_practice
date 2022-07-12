package immutable.customer.policy;

import immutable.customer.PurchaseHistory;
import immutable.customer.rule.GoldCustomerPurchaseAmountRule;
import immutable.customer.rule.PurchaseFrequencyRule;
import immutable.customer.rule.ReturnRateRule;

public class GoldCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    /**
     * GoldCustomerのルールを設定
     */
    public GoldCustomerPolicy(){
        policy = new ExcellentCustomerPolicy();
        policy.add(new GoldCustomerPurchaseAmountRule());
        policy.add(new PurchaseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    /**
     * @param history 購入履歴
     * @return ルールを全て満たす場合true
     */
    public boolean complyWithAll(final PurchaseHistory history){
        return policy.complyWithAll(history);
    }
}
