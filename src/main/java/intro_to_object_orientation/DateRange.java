package intro_to_object_orientation;

import java.time.LocalDate;

public class DateRange {
    LocalDate start;
    LocalDate end;

    public DateRange(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    boolean contains(LocalDate date) {
        if (date.isBefore(start)) return false;
        if (date.isAfter(end)) return false;
        return true;
    }

    boolean isOverlap(DateRange other){
        if(other.end.isBefore(start)) return false;
        if(other.start.isAfter(end)) return false;
        return true;
    }
}
