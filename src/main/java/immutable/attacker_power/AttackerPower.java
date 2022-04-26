package immutable.attacker_power;

public class AttackerPower {
    private static final int MIN = 0;
    private final int value;

    public AttackerPower(final int value) {
        if(value < MIN) {
            throw new IllegalArgumentException("value must be >= 0");
        }
        this.value = value;
    }

    AttackerPower add(final AttackerPower other) {
        return new AttackerPower(this.value + other.value);
    }

    AttackerPower disable() {
        return new AttackerPower(MIN);
    }
}
