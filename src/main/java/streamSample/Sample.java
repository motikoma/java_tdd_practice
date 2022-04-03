package streamSample;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Streamの終端操作の多くはオプショナルを返す
// Optionalは使用する側に強制的にnullチェックをしてもらうことになる

public class Sample {
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static String render(){
        List<String> words = List.of("a", "b", "c");

        String lastWordInLexicon = max(words).isPresent() ? max(words).get() : "";
        return lastWordInLexicon;
    }

    // Optionalはstream()メソッドを持つように修正された
    // OptionalをStreamへ変換する。要素がなければ何も含まないStreamになる
    // streamOfOptional.flatmap(Optional::stream)

    // コレクション,ストリーム,マップ,配列,オプショナルを含むコンテナ型をオプショナルで包まない
    // キー,値,コレクションや配列の要素に対しオプショナルを使用しない

}
