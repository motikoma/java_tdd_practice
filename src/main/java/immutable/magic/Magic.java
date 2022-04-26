package immutable.magic;

import immutable.attacker_power.AttackerPower;

public interface Magic {
    String name();
    MagicPoint costMagicPoint();
    AttackPower attackPower();
    TechnicalPoint costTechnicalPoint();
}
