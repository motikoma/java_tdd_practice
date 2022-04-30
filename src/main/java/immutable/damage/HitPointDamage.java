package immutable.damage;

public final class HitPointDamage implements Damage {
    Member member;

    public void execute(final int damageAmount){
        member.hitPoint -= damageAmount;
        if (member.hitPoint > 0) return;

        member.hitPoint = 0;
        member.addState(StateType.DEAD);
    }
}
