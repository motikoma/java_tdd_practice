package enumPractice;

// 標準のメソッドを宣言し、特定の値でだけオーバーライドする場合
public enum UniqueMethod {
    NORMAL{
        int doSomething(){
            return 1;
        }
    },
    WARNING,
    ABNORMAL;

    int doSomething(){
        return 2;
    }

    void call(){
        // 1が返る
        System.out.println(UniqueMethod.NORMAL.doSomething());
        // 2が返る
        System.out.println(UniqueMethod.WARNING.doSomething());
    }
}
