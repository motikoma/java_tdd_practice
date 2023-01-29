package removeComplexity.v2.domain.task.undone.postponable;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.Task;
import removeComplexity.v2.domain.task.done.DoneLowerPriorityTask;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.undone.UndoneHighPriorityTask;

public class UndoneLowPriorityPostponableTask implements UndonePostponableTask {
    private final Long id;
    private final String name;
    private final String priority;
    private final PostponeCount postponeCount;
    private String status;

    private UndoneLowPriorityPostponableTask(
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

    public static UndoneLowPriorityPostponableTask create(final Long id, final String name, final PostponeCount postponeCount) {
        return new UndoneLowPriorityPostponableTask(id, name, "low", postponeCount, "undone");
    }

    public static UndoneLowPriorityPostponableTask reconstruct(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new UndoneLowPriorityPostponableTask(id, name, priority, postponeCount, status);
    }

    @Override
    public DoneTask done() {
        return DoneLowerPriorityTask.create(this.id, this.name, this.postponeCount);
    }

    @Override
    public UndoneLowPriorityPostponableTask postpone() {
        PostponeCount postponeCount = new PostponeCount(this.postponeCount.getValue() + 1);
        return new UndoneLowPriorityPostponableTask(this.id, this.name, this.priority, postponeCount, this.status);
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
        return UndoneMiddlePriorityPostponableTask.create(this.id, this.name, this.postponeCount);
    }

    // FIX: 本来は不要なメソッドだが、インターフェースの実装のために必要
    @Override
    public Task ChangeLowPriority() {
        return null;
    }

}
