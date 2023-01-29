package sample.stream_practice;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Streamの終端操作の多くはオプショナルを返す
// Optionalは使用する側に強制的にnullチェックをしてもらうことになる
public class Sample {
    public static void main(String[] args) {
        List<String> words = List.of("aa", "bb", "cc");

        String lastWordInLexicon = max(words).isPresent() ? max(words).get() : "";
//        System.out.println(lastWordInLexicon);

        /**
         * 重複を排除
         */
        var hoge = words.stream().distinct().findFirst();
//        System.out.println(hoge.isPresent() ? hoge.get() : "");

        var hoge2 = words.stream().filter(s -> s.length() > 1).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(hoge2);
    }

    private static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    // Optionalはstream()メソッドを持つように修正された
    // OptionalをStreamへ変換する。要素がなければ何も含まないStreamになる
    // streamOfOptional.flatmap(Optional::stream)

    // コレクション,ストリーム,マップ,配列,オプショナルを含むコンテナ型をオプショナルで包まない
    // キー,値,コレクションや配列の要素に対しオプショナルを使用しない

}
