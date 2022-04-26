package junit4_introduction_to_practice;

// TODO
// 初期状態でincrementを呼び出した場合countは1になる
// incrementを1回実行した状態でincrementを呼び出した場合countは2になる
// incrementを50回実行した状態でincrementを呼び出した場合countは51になる

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    private Counter counter;

    @BeforeEach
    public void setUp(){
        counter = new Counter();
    }

    @Test
    public void 初期状態の場合() {
        assertEquals(0, counter.getCount());
    }

    @Test
    public void 初期状態でincrementを呼び出した場合countは1になる() {
        counter.increment();
        assertEquals(1, counter.getCount());
    }

    @Test
    public void incrementを1回実行した状態でincrementを呼び出した場合countは2になる() {
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getCount());
    }

    @Test
    public void incrementを50回実行した状態でincrementを呼び出した場合countは51になる() {
        for(int i = 0; i < 50; i++){
            counter.increment();
        }
        counter.increment();
        assertEquals(51, counter.getCount());
    }
}
