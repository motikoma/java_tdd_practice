package learning_with_good_bad_code_introduction_to_design.customer;

public class PurchaseHistory {
    public int purchaseFrequencyPerMonth;
    public int totalAmount;
    public double returnRate;

    public PurchaseHistory(final int purchaseFrequencyPerMonth, final int totalAmount, final double returnRate) {
        this.purchaseFrequencyPerMonth = purchaseFrequencyPerMonth;
        this.totalAmount = totalAmount;
        this.returnRate = returnRate;
    }
}
