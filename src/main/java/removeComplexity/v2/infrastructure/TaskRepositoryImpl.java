package removeComplexity.v2.infrastructure;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.Task;
import removeComplexity.v2.domain.task.TaskFactory;
import removeComplexity.v2.domain.task.TaskRepository;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.undone.UndoneTask;
import removeComplexity.v2.domain.task.undone.postponable.UndonePostponableTask;

public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public Task findById(final Long id) {
        var dummyData = new TaskRecord(1L, "dummy", "middle", 0, "undone");

        if (dummyData.status == "undone") {
            return TaskFactory.reconstructUndoneTask(dummyData.id, dummyData.name, dummyData.priority, new PostponeCount(dummyData.postponeCount), dummyData.status);
        } else if (dummyData.status == "done"){
            return TaskFactory.reconstructDoneTask(dummyData.id, dummyData.name, dummyData.priority, new PostponeCount(dummyData.postponeCount), dummyData.status);
        } else {
            throw new RuntimeException("status must be undone or done");
        }
    }

    @Override
    public UndoneTask undoneTaskfindById(final Long id) {
        var dummyData = new TaskRecord(1L, "dummy", "middle", 0, "undone");

        if (dummyData.status != "undone") throw new RuntimeException("status must be undone");

        var undoneTask = TaskFactory.reconstructUndoneTask(dummyData.id, dummyData.name, dummyData.priority, new PostponeCount(dummyData.postponeCount), dummyData.status);

        return undoneTask;
    }

    @Override
    public UndonePostponableTask undonePostponableTaskfindById(final Long id) {
        var dummyData = new TaskRecord(1L, "dummy", "middle", 0, "undone");

        if (dummyData.status != "undone") throw new RuntimeException("status must be undone");
        if (dummyData.priority == "high") throw new RuntimeException("priority must not be high");

        var undoneTask = TaskFactory.reconstructUndonePostponableTask(dummyData.id, dummyData.name, dummyData.priority, new PostponeCount(dummyData.postponeCount), dummyData.status);

        return undoneTask;
    }

    @Override
    public DoneTask doneTaskfindById(final Long id) {
        var dummyData = new TaskRecord(1L, "dummy", "middle", 0, "done");

        if (dummyData.status != "done") throw new RuntimeException("status must be done");

        var doneTask = TaskFactory.reconstructDoneTask(dummyData.id, dummyData.name, dummyData.priority, new PostponeCount(dummyData.postponeCount), dummyData.status);

        return doneTask;
    }

    @Override
    public void save(final Task task) {
    }

    private class TaskRecord {

        public Long id;
        public String name;
        public String priority;
        public int postponeCount;
        public String status;

        public TaskRecord(final long id, final String name, final String priority, final int postponeCount, final String status) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.postponeCount = postponeCount;
            this.status = status;
        }
    }
}
