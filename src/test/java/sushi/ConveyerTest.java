package sushi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO
// [-] 1つのネタを取得する
// [-] 複数のネタの種類を取得する
// [-] 5皿より多いネタは取得しない

public class ConveyerTest {
    
    private Conveyer conveyer;

    @BeforeEach
    public void setUp() {
        conveyer = new Conveyer();
    }

    @Test
    public void _複数種類のネタをユニークで取得できることを確認(){
        conveyerAdd("とろ", 1);
        conveyerAdd("まぐろ", 2);
        List<Neta> netaList = conveyer.getNetaList();

        assertEquals("とろ", netaList.get(0).getName());

        // まぐろが重複していても、1つだけ取得できる想定
        assertEquals(2, netaList.size());
        assertEquals("まぐろ", netaList.get(1).getName());
    }

    @Test
    public void _4皿以下のネタは取得する(){
        conveyerAdd("とろ", 1);
        conveyerAdd("まぐろ", 2);
        conveyerAdd("いか", 3);
        conveyerAdd("さけ", 4);
        List<Neta> netaList = conveyer.getNetaList();

        assertEquals(4, netaList.size());
    }

    @Test
    public void _5皿以上のネタは取得できない(){
        conveyerAdd("とろ", 1);
        conveyerAdd("まぐろ", 2);
        conveyerAdd("いか", 3);
        conveyerAdd("さけ", 4);
        conveyerAdd("するめ", 5);
        List<Neta> netaList = conveyer.getNetaList();

        assertEquals(4, netaList.size());
    }

    private void conveyerAdd(String neta, int count) {
        for (int i = 0; i < count; i++) {
            conveyer.add(neta);
        }
    }
}