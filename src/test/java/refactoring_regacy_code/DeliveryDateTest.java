package refactoring_regacy_code;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryDateTest {

    @Nested
    class _小の月の月末 {
        @Test
        void _4月の月末の日付のテスト(){
            DeliveryDate deliveryDate = new FakeDeliveryDate();
            ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 4, 13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,4,30), actualDate);
        }

        @Test
        void _6月の月末の日付のテスト(){
            DeliveryDate deliveryDate = new FakeDeliveryDate();
            ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 6, 13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,6,30), actualDate);
        }

        @Test
        void _9月の月末の日付のテスト(){
            DeliveryDate deliveryDate = new FakeDeliveryDate();
            ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 9, 13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,9,30), actualDate);
        }

        @Test
        void _11月の月末の日付のテスト(){
            DeliveryDate deliveryDate = new FakeDeliveryDate();
            ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 11, 13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,11,30), actualDate);
        }
    }


    @Nested
    class _2月の月末 {
        @Test
        void _4で割り切れない年の2月の月末になる場合のテスト(){
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2019,2,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2019,2,28), actualDate);
        }

        @Test
        void _4で割り切れるが100で割り切れない年の2月の月末になる場合のテスト(){
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,2,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,2,29), actualDate);
        }

        @Test
        void _100で割り切れるが400で割り切れない年の2月の月末になる場合のテスト(){
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2100,2,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2100,2,28), actualDate);
        }

        @Test
        void _400で割り切れる年の2月の月末になる場合のテスト(){
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2000,2,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2000,2,29), actualDate);
        }
    }

    @Test
    void _大の月の月末の日付のテスト(){
        DeliveryDate deliveryDate = new FakeDeliveryDate();
        ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 10, 13));
        LocalDate actualDate = deliveryDate.getDeliveryDate();
        assertEquals(LocalDate.of(2020,10,31), actualDate);
    }

    @Nested
    class _下旬の場合のテスト {
        @Test
        void _24日以前の場合は同月月末に日付が設定される(){
            DeliveryDate deliveryDate = new FakeDeliveryDate();
            ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 1, 24));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,1,31), actualDate);
        }

        @Test
        void _25日以降の場合は次月月末に日付が設定される(){
            DeliveryDate deliveryDate = new FakeDeliveryDate();
            ((FakeDeliveryDate) deliveryDate).setDate(LocalDate.of(2020, 1, 25));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,2,29), actualDate);
        }
    }


    @Nested
    class _年末の場合のテスト{
        @Test
        void _12月19日以前の場合は同月月末に日付が設定される(){
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,12,19));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,12,31), actualDate);
        }

        @Test
        void _12月20日以降の場合は次月月末に日付が設定される(){
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,12,20));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2021,1,31), actualDate);
        }
    }

    private class FakeDeliveryDate extends DeliveryDate {
        private LocalDate date;

        @Override
        protected LocalDate getNow() {
            return date;
        }

        void setDate(LocalDate date) {
            this.date = date;
        }
    }
}
