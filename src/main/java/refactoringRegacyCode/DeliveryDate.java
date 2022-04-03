package refactoringRegacyCode;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


// 現在日時を取得して、月末を配送日として設定する
// 現在日時が下旬や年末の場合は、配送日が次月に設定される

public class DeliveryDate {
    public LocalDate getDeliveryDate() {
        LocalDate localDate = getNow();
        int day = localDate.getDayOfMonth();
        Month month = localDate.getMonth();
        int year = localDate.getYear();

        if (month.equals(Month.DECEMBER) && day >= 20) {
            return LocalDate.of(year + 1, month.plus(1L), 31);
        } else if (day >= 25){
            return LocalDate.of(year, month.plus(1L), getLastDay(year, month.plus(1L)));
        }

        return LocalDate.of(year, month, getLastDay(year, month));
    }

    protected int getLastDay(int year, Month month){
        int lastDay;
        if(List.of(Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER).contains(month)){
            lastDay = 30;
        } else if (month.equals(Month.FEBRUARY)) {
            if (year % 400 == 0) {
                lastDay = 29;
            } else if (year % 100 == 0) {
                lastDay = 28;
            } else if (year % 4 == 0) {
                lastDay = 29;
            } else {
                lastDay = 28;
            }
        } else {
            lastDay = 31;
        }

        return lastDay;
    }

    protected LocalDate getNow(){
        return LocalDate.now();
    }
}
