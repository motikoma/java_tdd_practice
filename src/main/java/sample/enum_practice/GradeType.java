package sample.enum_practice;

public enum GradeType {
    U_4(1, "U_4"),
    U_6(2, "U_6");

    private int id;
    private String val;

    GradeType(int id, String val) {
        this.id = id;
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public int getId() {
        return id;
    }
}
