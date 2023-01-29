package removeComplexity.v2.domain.task.undone;

import removeComplexity.v2.domain.task.PostponeCount;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.done.DoneHighPriorityTask;

public class UndoneHighPriorityTask implements UndoneTask {

    Long id;
    String name;
    String priority;
    PostponeCount postponeCount;
    String status;

    private UndoneHighPriorityTask(
            final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (status != "undone")
            throw new RuntimeException("status must be undone");
        if (priority != "high")
            throw new RuntimeException("priority must be high");

        this.id = id;
        this.name = name;
        this.priority = priority;
        this.postponeCount = postponeCount;
        this.status = "undone";
    }

    public static UndoneHighPriorityTask create(final Long id, final String name, final PostponeCount postponeCount) {
        return new UndoneHighPriorityTask(id, name, "high", postponeCount, "undone");
    }

    public static UndoneHighPriorityTask reconstruct(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        return new UndoneHighPriorityTask(id, name, priority, postponeCount, status);
    }

    @Override
    public DoneTask done() {
        return DoneHighPriorityTask.create(this.id, this.name, this.postponeCount);
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPriority() {
        return null;
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
