package intro_to_object_orientation;

public class Amount {
    private int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    Amount add(Amount other) {
        return new Amount(this.amount + other.amount);
    }
}