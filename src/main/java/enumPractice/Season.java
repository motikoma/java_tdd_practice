package enumPractice;

// https://www.bold.ne.jp/engineer-club/java-enum

public enum Season {
    SPRING, SUMMER, FALL, WINTER;

    void call(){
        System.out.println("Spring");
        System.out.println(Season.SPRING.name());

        // SUMMERが返却される
        Season season = Season.valueOf("SUMMER");

        // 全ての値が格納される
        Season[] seasons = Season.values();
    }
}

// 下記のようなイメージ
// class Season {
//    public static final Season SPRING = new Season();
//    public static final Season SUMMER = new Season();
//    public static final Season AUTUMN = new Season();
//    public static final Season WINTER = new Season();
//
//    private Season() {
//    }
//}

