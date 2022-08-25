package learning_with_good_bad_code_introduction_to_design.customer;

import learning_with_good_bad_code_introduction_to_design.customer.policy.GoldCustomerPolicy;

public class Main {
    public static void main(String[] args) {
        PurchaseHistory purchaseHistory = new PurchaseHistory(1,2,3);
        GoldCustomerPolicy policy = new GoldCustomerPolicy();
        System.out.println(policy.complyWithAll(purchaseHistory));
    }
}
