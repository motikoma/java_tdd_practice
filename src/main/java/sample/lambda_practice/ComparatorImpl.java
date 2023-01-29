package sample.lambda_practice;

import java.util.Comparator;

// 関数型インターフェイスは、抽象メソッドを1つだけ持つ
// java.lang.Comparable
// java.lang.Runnable
// java.util.Comparator
// java.util.concurrent.Callable
// java.util.function.Consumer
// java.util.function.Function
// java.util.function.Predicate
// java.util.function.Supplier

// SAMは「Single Abstract Method」の略で、「1つだけの抽象メソッド」を意味する

public class ComparatorImpl implements Comparator<String> {

    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
