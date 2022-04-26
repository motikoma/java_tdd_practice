package immutable;

public class Money {
    final int amount;
    final Currency currency;

    public Money(int amount, Currency currency) {
        if(amount < 0) {
            throw new IllegalArgumentException("amount must be >= 0");
        }
        if (currency == null) {
            throw new NullPointerException("currency must not be null");
        }
        this.amount = amount;
        this.currency = currency;
    }

    Money add(final Money other){
        if(!currency.equals(other.currency)){
            throw new IllegalArgumentException("Currency mismatch");
        }
        final int added = amount + other.amount;
        return new Money(added, currency);
    }
}
