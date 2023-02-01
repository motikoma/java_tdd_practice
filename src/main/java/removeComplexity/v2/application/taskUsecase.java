package removeComplexity.v2.application;

import removeComplexity.v2.domain.task.Task;
import removeComplexity.v2.domain.task.TaskRepository;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.undone.UndoneTask;
import removeComplexity.v2.domain.task.undone.postponable.UndonePostponableTask;

/**
 * TODO: タスクのユースケースを1publicメソッドにすることで不要な抽象化を減らすことができるはず
 * c
 */
public class taskUsecase {
    private final TaskRepository taskRepository;

    public taskUsecase(final TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void done(final Long taskId) {
        UndoneTask task = this.taskRepository.undoneTaskfindById(taskId);
        task.done();

        this.taskRepository.save(task);
    }

    public void undone(final Long taskId) {
        DoneTask task = this.taskRepository.doneTaskfindById(taskId);
        task.undone();

        this.taskRepository.save(task);
    }

    public void postpone(final Long taskId) {
        UndonePostponableTask task = this.taskRepository.undonePostponableTaskfindById(taskId);
        task.postpone();

        this.taskRepository.save(task);
    }

    public void changeHighPriority(final Long taskId) {
        Task task = this.taskRepository.findById(taskId);
        task.changeHighPriority();

        this.taskRepository.save(task);
    }

    public void changeMiddlePriority(final Long taskId) {
        Task task = this.taskRepository.findById(taskId);
        task.changeMiddlePriority();

        this.taskRepository.save(task);
    }

    public void changeLowPriority(final Long taskId) {
        Task task = this.taskRepository.findById(taskId);
        task.changeLowPriority();

        this.taskRepository.save(task);
    }
}
