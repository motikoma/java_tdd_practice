package removeComplexity.v2.domain.task.undone;

import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.Task;

public interface UndoneTask extends Task {
    DoneTask done();
}
