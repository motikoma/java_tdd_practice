package removeComplexity.v2.domain.task.done;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.undone.postponable.UndonePostponableTask;
import removeComplexity.v2.domain.task.undone.postponable.UndoneLowPriorityPostponableTask;

public class DoneLowerPriorityTask implements DoneTask {

    private final Long id;
    private final String name;
    private final String priority;
    private final PostponeCount postponeCount;
    private String status;

    private DoneLowerPriorityTask(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (status != "done")
            throw new RuntimeException("status must be done");
        if (priority != "low")
            throw new RuntimeException("priority must be low");

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.postponeCount = postponeCount;
        this.status = status;
    }

    public static DoneLowerPriorityTask create(final Long id, final String name, final PostponeCount postponeCount) {
        return new DoneLowerPriorityTask(id, name, "low", postponeCount, "done");
    }

    public static DoneLowerPriorityTask reconstruct(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new DoneLowerPriorityTask(id, name, priority, postponeCount, status);
    }

    @Override
    public UndonePostponableTask undone() {
        return UndoneLowPriorityPostponableTask.create(this.id, this.name, this.postponeCount);
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
