package enumPractice;

public enum DoSomethingImpl implements DoSomething {
    NORMAL;

    // インターフェースのメソッドを呼び出せる
    void call() {
        System.out.println(DoSomethingImpl.NORMAL.doSomething());
    }

    @Override
    public int doSomething() {
        return 1;
    }
}
