package removeComplexity.v2.domain.task.undone;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.Task;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.done.DoneLowerPriorityTask;
import removeComplexity.v2.domain.task.undone.postponable.UndoneLowPriorityPostponableTask;
import removeComplexity.v2.domain.task.undone.postponable.UndoneMiddlePriorityPostponableTask;

public class UndoneLowPriorityDeadlineTask implements UndoneTask {
    private final Long id;
    private final String name;
    private final String priority;
    private final PostponeCount postponeCount;
    private String status;

    private UndoneLowPriorityDeadlineTask(
            final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (status != "undone")
            throw new RuntimeException("status must be undone");
        if (priority != "low")
            throw new RuntimeException("priority must be low");

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.postponeCount = postponeCount;
        this.status = status;

    }

    public static UndoneLowPriorityDeadlineTask create(
            final Long id, final String name, final PostponeCount postponeCount) {
        return new UndoneLowPriorityDeadlineTask(id, name, "low", postponeCount, "undone");
    }

    public static UndoneLowPriorityDeadlineTask reconstruct(
            final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new UndoneLowPriorityDeadlineTask(id, name, priority, postponeCount, status);
    }

    @Override
    public DoneTask done() {
        return DoneLowerPriorityTask.create(this.id, this.name, this.postponeCount);
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
    public Task ChangeHighPriority() {
        return UndoneHighPriorityTask.create(this.id, this.name, this.postponeCount);
    }

    @Override
    public Task ChangeMiddlePriority() {
        return UndoneMiddlePriorityDeadlineTask.create(this.id, this.name, this.postponeCount);
    }

    @Override
    public Task ChangeLowPriority() {
        return UndoneLowPriorityPostponableTask.create(this.id, this.name, this.postponeCount);
    }
}
