package learning_with_good_bad_code_introduction_to_design.customer.policy;

import learning_with_good_bad_code_introduction_to_design.customer.PurchaseHistory;
import learning_with_good_bad_code_introduction_to_design.customer.rule.GoldCustomerPurchaseAmountRule;
import learning_with_good_bad_code_introduction_to_design.customer.rule.PurchaseFrequencyRule;
import learning_with_good_bad_code_introduction_to_design.customer.rule.ReturnRateRule;

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
