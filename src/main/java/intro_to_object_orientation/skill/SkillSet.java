package intro_to_object_orientation.skill;

import java.util.HashSet;
import java.util.Set;

public class SkillSet {
    Set<Skill> set;

    public SkillSet(Set<Skill> set) {
        this.set = set;
    }

    // 一致するスキルがあるかどうか
    boolean hasMatch(SkillSet other) {
        Set<Skill> result = new HashSet<>(set);
        result.containsAll(other.set);
        return result.size() > 0;
    }

    static SkillSet of(Skill... skills) {
        return new SkillSet(Set.of(skills));
    }
}
