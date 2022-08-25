package learning_with_good_bad_code_introduction_to_design.magic;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        final Map<MagicType, Magic> magics = new HashMap<>();
        Member member = new Member(1,1,1,1);

        final Fire fire = new Fire(member);
        final Shiden shiden = new Shiden(member);
        final HellFire hellFire = new HellFire(member);

        magics.put(MagicType.FIRE, fire);
        magics.put(MagicType.SHIDEN, shiden);
        magics.put(MagicType.HELLFIRE, hellFire);

        magicAttack(magics, MagicType.FIRE);
    }

    // ストラテジパターン
    // MagicTypeに対応するMagic interfaceを実装したクラスを引数に取る
    static void magicAttack(Map<MagicType, Magic> magics, final MagicType magicType) {
        final Magic magic = magics.get(magicType);
        magic.attackPower();
    }
}
