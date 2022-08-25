package learning_with_good_bad_code_introduction_to_design.magic;

class Shiden implements Magic {
    private final Member member;

    public Shiden(final Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "Shiden";
    }

    @Override
    public MagicPoint costMagicPoint(){
        final int value = 5 + (int)(member.level * 0.2);
        return new MagicPoint(10);
    }

    @Override
    public AttackPower attackPower(){
        final int value = 50 + (int)(member.agility * 1.5);
        return new AttackPower(value);
    }

    @Override
    public TechnicalPoint costTechnicalPoint(){
        return new TechnicalPoint(5);
    }
}
