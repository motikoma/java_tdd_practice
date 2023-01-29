package removeComplexity.v1;

import java.time.LocalDate;

public interface UndoneTask extends Task {
    LocalDate getDueDate();
    DoneTask done();
}
