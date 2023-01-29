package removeComplexity.v2.domain.task;

public interface Task {
    Long getId();
    String getName();
    String getPriority();
    PostponeCount getPostponeCount();
    String getStatus();
    String ChangeHighPriority();
    String ChangeMiddlePriority();
    String ChangeLowPriority();
}
