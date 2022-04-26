package intro_to_object_orientation.pricing_category;

import java.util.EnumSet;

// このパターンは便利
public class busySeason {

    // 繁忙期を表す列挙型
    EnumSet<PricingCategory> busySeason = EnumSet.of(PricingCategory.年始, PricingCategory.年末);

    // 繁忙期か判定
    boolean isBusySeason(PricingCategory season) {
        return busySeason.contains(season);
    }
}
