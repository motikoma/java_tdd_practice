package task;

import java.time.LocalDate;

public interface UndoneTask extends Task {
    LocalDate getDueDate();
    DoneTask done();
}
