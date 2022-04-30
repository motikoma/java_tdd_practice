package immutable.customer;

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
