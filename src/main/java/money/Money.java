package money;

import java.util.Objects;

abstract class Money {
    protected int amount;
    abstract Money times(int multiplier);

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

    static Money dollar(int amount){
        return new Dollar(amount);
    };

    static Money franc(int amount){
        return new Franc(amount);
    }
}
