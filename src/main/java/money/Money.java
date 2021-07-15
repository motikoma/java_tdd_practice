package money;

import java.util.Objects;

abstract class Money {
    protected int amount;
    protected String currency;
    abstract Money times(int multiplier);

    Money (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    };

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    };

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
