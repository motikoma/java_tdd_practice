import fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//TODO
//テスト容易性:高, 重要度:高
//- [] 数を文字列に変換する
// - [×] 1を渡すと文字列1を返す → 仮実装
// - [×] 2を渡すと文字列2を返す → 三角測量

//- [×] 3の倍数のときは数の代わりに「Fizz」に変換する
// - [×] 3を渡すと文字列「Fizz」を返す
//- [×] 5の倍数のときは数の代わりに「Buzz」に変換する
// - [×] 5を渡すと文字列「Buzz」を渡す
//- [×] 3と5両方の倍数のときは数の代わりに「fizzbuzz.FizzBuzz」に変換する
// - [×] 15を渡すと文字列「fizzbuzz.FizzBuzz」を渡す

//テスト容易性:低, 重要度:低
//- [] 1からnまで
//- [] 1から100まで
//- [] プリントする


@DisplayName("Fizz Buzz 数列と変換規則を扱う fizzbuzz.FizzBuzz クラス")
class FizzBuzzTest {

  private FizzBuzz fizzbuzz;

  @BeforeEach
  void 前準備(){
    fizzbuzz = new FizzBuzz();
  }

  @Nested
  class convertメソッドは数を文字列に変換する {
    @Nested
    class _3の倍数のときは数の代わりにfizzに変換する {
      @Test
      void _3を渡すと文字列fizzを返す() throws Exception{
        // 実行&検証
        assertEquals("fizz", fizzbuzz.convert(3));
      }
    }

    @Nested
    class _5の倍数のときは数の代わりにbuzzに変換する{
      @Test
      void _5を渡すと文字列buzzを返す() throws Exception{
        // 実行&検証
        assertEquals("buzz", fizzbuzz.convert(5));
      }
    }

    @Nested
    class _3と_5両方の倍数のときは数の代わりにfizzbuzzに変換する{
      @Test
      void _15を渡すと文字列fizzBuzzを返す() throws Exception{
        // 実行&検証
        assertEquals("fizzbuzz", fizzbuzz.convert(15));
      }
    }

    @Nested
    class その他の数のときはそのまま文字列に変換する {
      @Test
      void _1を渡すと文字列1を返す() throws Exception{
        // 実行&検証
        assertEquals("1", fizzbuzz.convert(1));
      }
    }
  }
}
