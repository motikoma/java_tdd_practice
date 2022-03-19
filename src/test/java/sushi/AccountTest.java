package sushi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account();
    }

    @Nested
    class _1週目の割引されていない状態での合計金額を確認する {

        @Test
        void _赤皿1枚で合計100円(){
            account.addRedPlate(1);
            assertEquals(100, account.getTotalPrice());
        }

        @Test
        void _赤皿2枚で合計200円(){
            account.addRedPlate(1);
            account.addRedPlate(1);
            assertEquals(200, account.getTotalPrice());
        }

        @Test
        void _青皿1枚で合計300円(){
            account.addBluePlate(1);
            assertEquals(300, account.getTotalPrice());
        }

        @Test
        void _赤皿1枚青皿2枚で合計700円(){
            account.addRedPlate(1);
            account.addBluePlate(1);
            account.addBluePlate(1);
            assertEquals(700, account.getTotalPrice());
        }

        @Test
        void _黄皿1枚で合計450円(){
            account.addYellowPlate(1);
            assertEquals(450, account.getTotalPrice());
        }

        @Test
        void _青皿1枚黄皿2枚で合計1200円(){
            account.addBluePlate(1);
            account.addYellowPlate(1);
            account.addYellowPlate(1);
            assertEquals(1200, account.getTotalPrice());
        }

        @Test
        void _赤皿1枚黄皿1枚青皿1枚で合計850円(){
            account.addRedPlate(1);
            account.addYellowPlate(1);
            account.addBluePlate(1);
            assertEquals(850, account.getTotalPrice());
        }
    }
}
