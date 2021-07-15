package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// TODO
// [] レート換算処理
// [] Moneyの丸目処理
// [] nullとの等価性比較
// [] 他のオブジェクトとの等価性比較
// [] DollarとFrancの重複
// [] timesの一般化

public class MoneyTest {
    @Test
    public void testMultiplication() throws Exception {}{
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
