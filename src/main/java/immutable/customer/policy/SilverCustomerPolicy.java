package immutable.customer.policy;

import immutable.customer.PurchaseHistory;
import immutable.customer.policy.ExcellentCustomerPolicy;
import immutable.customer.rule.PurchaseFrequencyRule;
import immutable.customer.rule.ReturnRateRule;
import immutable.customer.rule.SilverCustomerPurchaseAmountRule;

public class SilverCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    /**
     * SilverCustomerのルールを設定
     */
    public SilverCustomerPolicy(){
        policy = new ExcellentCustomerPolicy();
        policy.add(new SilverCustomerPurchaseAmountRule());
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
