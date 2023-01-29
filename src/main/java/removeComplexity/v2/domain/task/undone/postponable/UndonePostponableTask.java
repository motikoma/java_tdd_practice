package removeComplexity.v2.domain.task.undone.postponable;

import removeComplexity.v2.domain.task.undone.UndoneTask;

public interface UndonePostponableTask extends UndoneTask {
    UndoneTask postpone();
}
