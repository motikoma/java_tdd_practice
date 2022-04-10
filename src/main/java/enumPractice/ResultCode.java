package enumPractice;

public enum ResultCode {

    // インスタンスに固有の値を持たせることができる
    NORMAL(100), WARNING(200), ERROR(999);

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    int getCode() {
        return code;
    }

    void call() {
        // 100が返却される
        System.out.println(ResultCode.NORMAL.getCode());
    }
}
