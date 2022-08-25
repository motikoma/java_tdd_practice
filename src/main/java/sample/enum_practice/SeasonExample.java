package sample.enum_practice;

public class SeasonExample {
    void printSeason(Season season) {
        System.out.println(season);
    }

    void callPrintSeason() {
        printSeason(Season.SPRING);
        printSeason(Season.FALL);
    }

    Season getSeason() {
        return Season.SPRING;
    }
}
