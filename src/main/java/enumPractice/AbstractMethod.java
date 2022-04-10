package enumPractice;

// Enumにabstractメソッドを宣言し、全ての値で実装させる場合
public enum AbstractMethod {
    NORMAL{
        int doSomething(){
            return 1;
        }
    };

    abstract int doSomething();
}
