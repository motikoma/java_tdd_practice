package removeComplexity.v2.domain.task.undone.postponable;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.done.DoneLowerPriorityTask;

public class UndoneMiddlePriorityPostponableTask implements UndonePostponableTask {
    private final Long id;
    private final String name;
    private final String priority;
    private final PostponeCount postponeCount;
    private String status;

    private UndoneMiddlePriorityPostponableTask(
            final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (status != "undone")
            throw new RuntimeException("status must be undone");
        if (priority != "middle") {
            throw new RuntimeException("priority must be middle");
        }

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.postponeCount = postponeCount;
        this.status = status;

    }

    public static UndoneMiddlePriorityPostponableTask create(final Long id, final String name, final PostponeCount postponeCount) {
        return new UndoneMiddlePriorityPostponableTask(id, name, "middle", postponeCount, "undone");
    }

    public static UndoneMiddlePriorityPostponableTask reconstruct(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new UndoneMiddlePriorityPostponableTask(id, name, priority, postponeCount, status);
    }

    @Override
    public DoneTask done() {
        return DoneLowerPriorityTask.create(this.id, this.name, this.postponeCount);
    }

    @Override
    public UndoneMiddlePriorityPostponableTask postpone() {
        PostponeCount postponeCount = new PostponeCount(this.postponeCount.getValue() + 1);
        return new UndoneMiddlePriorityPostponableTask(this.id, this.name, this.priority, postponeCount, status);
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

}
