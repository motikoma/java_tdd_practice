package removeComplexity.v2.domain.task;

public interface Task {
    Long getId();
    String getName();
    String getPriority();
    PostponeCount getPostponeCount();
    String getStatus();
    Task changeHighPriority();
    Task changeMiddlePriority();
    Task changeLowPriority();
}
