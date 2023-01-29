package removeComplexity.v2.domain.task;

public class PostponeCount {
    private int value = 0;

    public PostponeCount(final int value) {
        if(this.value > 3)
            throw new RuntimeException("postpone count must be less than 3");

        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public PostponeCount increment() {
        return new PostponeCount(this.value + 1);
    }
}
