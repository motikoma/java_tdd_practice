package money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// TODO
// [] レート換算処理
// [] Moneyのまるめ処理
// [] nullとの等価性比較
// [] 他のオブジェクトとの等価性比較
// [] DollarとFrancの重複
// [] timesの一般化
// [-] FrancとDollarを比較する
// [] 通貨の概念
// [] testFrancMultiplicationを削除する？

public class MoneyTest {
    @Test
    public void testMultiplication() throws Exception {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(6)));
    }
    @Test
    public void testFrancMultiplication(){
        Money five = Franc.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
