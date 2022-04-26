package immutable.magic;


public class Fire implements Magic {
    private final Member member;

    public Fire(final Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "Fire";
    }

    @Override
    public MagicPoint costMagicPoint() {
        return new MagicPoint(2);
    }

    @Override
    public AttackPower attackPower() {
        final int value =  20 + (int) (member.level * 10);
        return new AttackPower(10);
    }

    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(0);
    }
}
