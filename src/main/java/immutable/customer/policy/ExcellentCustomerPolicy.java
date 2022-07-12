package immutable.customer.policy;

import immutable.customer.PurchaseHistory;
import immutable.customer.rule.ExcellentCustomerRule;

import java.util.HashSet;
import java.util.Set;

public class ExcellentCustomerPolicy {

    private final Set<ExcellentCustomerRule> rules;

    ExcellentCustomerPolicy(){
        rules = new HashSet<>();
    }

    void add(final ExcellentCustomerRule rule){
        rules.add(rule);
    }

    /**
     * @param history 購入履歴
     * @return ルールをすべて満たす場合true
     */
    boolean complyWithAll(final PurchaseHistory history){
        for (ExcellentCustomerRule rule : rules) {
            if (!rule.ok(history)) {
                return false;
            }
        }
        return true;
    }
}
