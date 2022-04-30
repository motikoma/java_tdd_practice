package immutable.customer;

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

    boolean complyWithAll(final PurchaseHistory history){
        for (ExcellentCustomerRule rule : rules) {
            if (!rule.ok(history)) {
                return false;
            }
        }
        return true;
    }
}
