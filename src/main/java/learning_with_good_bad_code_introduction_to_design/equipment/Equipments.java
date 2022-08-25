package learning_with_good_bad_code_introduction_to_design.equipment;

public class Equipments {
    private boolean canChange;
    private Equipment head;
    private Equipment armor;
    private Equipment arm;

    void equipArmor(final Equipment newArmor) {
        if (this.canChange) {
            this.armor = newArmor;
        }
    }

    void deactivateAll() {
        this.head = Equipment.EMPTY;
        this.armor = Equipment.EMPTY;
        this.arm = Equipment.EMPTY;
    }
}
