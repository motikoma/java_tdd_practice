package learning_with_good_bad_code_introduction_to_design.equipment;

public class Equipment {
    public static final Equipment EMPTY = new Equipment("", 0, 0, 0);
    private final String name;
    private final int cost;
    private final int defence;
    private final int magicDefence;

    public Equipment(final String name, final int cost, final int defence, final int magicDefence) {
        this.name = name;
        this.cost = cost;
        this.defence = defence;
        this.magicDefence = magicDefence;
    }
}
