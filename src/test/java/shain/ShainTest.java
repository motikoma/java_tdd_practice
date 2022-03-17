package shain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShainTest {
    @Test
    public void testStandup() {
        Shain shain = new Tanto();
        assertEquals("担当が普通に起立しました", shain.standUp());
    }

    @Test
    public void testStandupForShunin() {
        Shain shain = new Shunin();
        assertEquals("主任がすばやく立ちました", shain.standUp());
    }

    @Test
    public void testStandupForBucho() {
        Shain shain = new Bucho();
        assertEquals("部長がだるそうに立ちました", shain.standUp());
    }
}
