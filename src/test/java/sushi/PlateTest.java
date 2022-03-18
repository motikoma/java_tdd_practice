package sushi;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// - [-] リファクタリングでPlateクラスを抽出
// - [-] 1~4週の場合、割引されていないことを確認する（赤,青,黄）
// - [-] 5~9週の場合、10%割引されていることを確認する（赤,青,黄）
// - [-] 10週以上の場合、20%割引されていることを確認する（赤,青,黄）

class PlateTest {

    @Nested
    class _1週目の場合割引されない{
        @Test
        void _赤皿は割引がない場合100円() {
            Plate plate = Plate.createRedPlate(1);
            assertEquals(100, plate.getPrice());
        }

        @Test
        void _青皿は割引がない場合300円() {
            Plate plate = Plate.createBluePlate(1);
            assertEquals(300, plate.getPrice());
        }

        @Test
        void _黄皿は割引がない場合450円() {
            Plate plate = Plate.createYellowPlate(1);
            assertEquals(450, plate.getPrice());
        }
    }

    @Nested
    class _4週目の場合割引されない{
        @Test
        void _赤皿は割引がない場合100円() {
            Plate plate = Plate.createRedPlate(4);
            assertEquals(100, plate.getPrice());
        }

        @Test
        void _青皿は割引がない場合300円() {
            Plate plate = Plate.createBluePlate(4);
            assertEquals(300, plate.getPrice());
        }

        @Test
        void _黄皿は割引がない場合450円() {
            Plate plate = Plate.createYellowPlate(4);
            assertEquals(450, plate.getPrice());
        }
    }

    @Nested
    class _5週目の場合10パーセント割引される{
        @Test
        void _赤皿の10パーセント割引は90円() {
            Plate plate = Plate.createRedPlate(5);
            assertEquals(90, plate.getPrice());
        }

        @Test
        void _青皿の10パーセント割引は270円() {
            Plate plate = Plate.createBluePlate(5);
            assertEquals(270, plate.getPrice());
        }

        @Test
        void _黄皿の10パーセント割引は405円() {
            Plate plate = Plate.createYellowPlate(5);
            assertEquals(405, plate.getPrice());
        }
    }

    @Nested
    class _9週目の場合10パーセント割引される{
        @Test
        void _赤皿の10パーセント割引は90円() {
            Plate plate = Plate.createRedPlate(9);
            assertEquals(90, plate.getPrice());
        }

        @Test
        void _青皿の10パーセント割引は270円() {
            Plate plate = Plate.createBluePlate(9);
            assertEquals(270, plate.getPrice());
        }

        @Test
        void _黄皿の10パーセント割引は405円() {
            Plate plate = Plate.createYellowPlate(9);
            assertEquals(405, plate.getPrice());
        }
    }

    @Nested
    class _10週目の場合20パーセント割引される{
        @Test
        void _赤皿の20パーセント割引は80円() {
            Plate plate = Plate.createRedPlate(10);
            assertEquals(80, plate.getPrice());
        }

        @Test
        void _青皿の20パーセント割引は240円() {
            Plate plate = Plate.createBluePlate(10);
            assertEquals(240, plate.getPrice());
        }

        @Test
        void _黄皿の20パーセント割引は360円() {
            Plate plate = Plate.createYellowPlate(10);
            assertEquals(360, plate.getPrice());
        }
    }
}


