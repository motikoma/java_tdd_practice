package removeComplexity.v2.domain.task.done;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.Task;
import removeComplexity.v2.domain.task.undone.UndoneMiddlePriorityDeadlineTask;
import removeComplexity.v2.domain.task.undone.postponable.UndonePostponableTask;
import removeComplexity.v2.domain.task.undone.postponable.UndoneLowPriorityPostponableTask;

public class DoneMiddlePriorityTask implements DoneTask {

    private final Long id;
    private final String name;
    private final String priority;
    private final PostponeCount postponeCount;
    private String status;

    private DoneMiddlePriorityTask(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (status != "done")
            throw new RuntimeException("status must be done");
        if (priority != "middle")
            throw new RuntimeException("priority must be middle");

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.postponeCount = postponeCount;
        this.status = status;
    }

    public static DoneMiddlePriorityTask create(final Long id, final String name, final PostponeCount postponeCount) {
        return new DoneMiddlePriorityTask(id, name, "middle", postponeCount, "done");
    }

    public static DoneMiddlePriorityTask reconstruct(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new DoneMiddlePriorityTask(id, name, priority, postponeCount, status);
    }

    @Override
    public UndonePostponableTask undone() {
        return UndoneMiddlePriorityDeadlineTask.create(this.id, this.name, this.postponeCount);
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPriority() {
        return this.priority;
    }

    @Override
    public PostponeCount getPostponeCount() {
        return this.postponeCount;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public Task changeHighPriority() {
        return null;
    }

    @Override
    public Task changeMiddlePriority() {
        return null;
    }

    @Override
    public Task changeLowPriority() {
        return null;
    }

}
