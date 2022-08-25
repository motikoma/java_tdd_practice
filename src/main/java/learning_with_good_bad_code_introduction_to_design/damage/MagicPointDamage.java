package learning_with_good_bad_code_introduction_to_design.damage;

public final class MagicPointDamage implements Damage {
    Member member;



    public void execute(final int damageAmount){
        member.magicPoint -= damageAmount;
        if (member.magicPoint > 0) return;

        member.magicPoint = 0;
    }
}
