package immutable.magic;

public class HellFire implements Magic {
    private final Member member;

    public HellFire(final Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "HellFire";
    }

    @Override
    public MagicPoint costMagicPoint(){
        return new MagicPoint(16);
    }

    @Override
    public AttackPower attackPower() {
        final int value = 200 + (int)(member.magicAttack * 1.5 + member.vitality * 2);
        return new AttackPower(value);
    }

    @Override
    public TechnicalPoint costTechnicalPoint() {
        final int value = 20 + (int)(member.level * 0.4);
        return new TechnicalPoint(value);
    }
}
