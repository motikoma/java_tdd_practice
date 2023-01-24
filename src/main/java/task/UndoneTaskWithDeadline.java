package task;

import java.time.LocalDate;

/**
 * 延期回数が限界に達したタスク
 */
public class UndoneTaskWithDeadline implements UndoneTask {
    public UndoneTaskWithDeadline(final Long id, final String name, final LocalDate localDate) {}

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public LocalDate getDueDate() {
        return null;
    }

    @Override
    public DoneTask done() {
        return new DoneTask(getId(), getName(), LocalDate.now());
    }
}
