package removeComplexity.v2.domain.task.done;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.undone.UndoneHighPriorityTask;

public class DoneHighPriorityTask implements DoneTask {

    private final Long id;
    private final String name;
    private final String priority;
    private final PostponeCount postponeCount;
    private String status;

    private DoneHighPriorityTask(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (status != "done")
            throw new RuntimeException("status must be done");
        if (priority != "high")
            throw new RuntimeException("priority must be high");

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.postponeCount = postponeCount;
        this.status = status;
    }

    public static DoneHighPriorityTask create(final Long id, final String name, final PostponeCount postponeCount) {
        return new DoneHighPriorityTask(id, name, "high", postponeCount, "done");
    }

    public static DoneHighPriorityTask reconstruct(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new DoneHighPriorityTask(id, name, priority, postponeCount, status);
    }

    @Override
    public UndoneHighPriorityTask undone() {
        return UndoneHighPriorityTask.create(this.id, this.name, this.postponeCount);
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
