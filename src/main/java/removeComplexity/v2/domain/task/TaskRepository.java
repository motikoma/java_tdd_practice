package removeComplexity.v2.domain.task;

import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.undone.UndoneTask;
import removeComplexity.v2.domain.task.undone.postponable.UndonePostponableTask;

public interface TaskRepository {
    Task findById(Long id);
    UndoneTask undoneTaskfindById(Long id);
    UndonePostponableTask undonePostponableTaskfindById(Long id);
    DoneTask doneTaskfindById(Long id);
    void save(Task task);
}
