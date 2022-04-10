package lambdaPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

//  https://www.bold.ne.jp/engineer-club/java-lambda-expression
// ラムダ式：名無しのクラスを定義し、そのクラスのインスタンスを生成する
public class ComparatorImplTest {

    void method(){
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        lambdaMethod(comparator);
        System.out.println(comparator.compare("a", "b"));
    }

    // メソッドの引数への型推論が働くパターン
    void lambdaMethod(Comparator<String> comparator){
        System.out.println(comparator.compare("c", "d"));
    }

    // 引数なし、戻り値の型がvoid
    Runnable runnable = () -> System.out.println("Hello");

    // 引数なし、戻り値の型がString
    Callable<String> callable = () -> "Hello";

    // 引数1つ、戻り値の型がboolean
    Predicate<String> callable2 = s -> "Hello".equals(s);

    // 引数2つ、戻り値の型がString
    Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);

    // 引数2つ、戻り値の型がInterger
    Comparator<Integer> comparator2 = (i1, i2) -> i1.compareTo(i2);

    // ラムダ式はStreamの中で使用することができる
    void streamMethod(){
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().filter(s -> s.equals("a")).map(s -> s.toUpperCase()).forEach(System.out::println);
    }

    // 自作Comparator
    Comparator<String> c1 = (s1, s2) -> s2.length() - s1.length();
    Comparator<String> c2 = c1.thenComparing((s1, s2) -> s1.compareTo(s2));
}
