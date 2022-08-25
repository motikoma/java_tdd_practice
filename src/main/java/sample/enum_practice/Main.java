package sample.enum_practice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(GradeType.U_4, GradeType.U_6);
        list.stream().map(GradeType::getId).forEach(System.out::println);
    }
}
