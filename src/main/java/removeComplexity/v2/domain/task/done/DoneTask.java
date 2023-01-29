package removeComplexity.v2.domain.task.done;

import removeComplexity.v2.domain.task.Task;
import removeComplexity.v2.domain.task.undone.UndoneTask;

public interface DoneTask extends Task {
    UndoneTask undone();
}
