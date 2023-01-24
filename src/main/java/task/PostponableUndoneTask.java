package task;

import java.time.LocalDate;

/**
 * 延期回数が限界に達していないタスク
 */
public class PostponableUndoneTask implements UndoneTask {
    private final Long id;
    private final String name;
    private final LocalDate dueDate;

    private int postponeCount = 0;

    public static final int MAX_POSTPONE_COUNT = 3;

    public PostponableUndoneTask(Long id, String name, LocalDate dueDate, int postponeCount) {
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.postponeCount = postponeCount;
    }

    public UndoneTask postpone() {
        if (postponeCount < MAX_POSTPONE_COUNT) {
            return new PostponableUndoneTask(id, name, dueDate.plusDays(1), postponeCount + 1);
        } else {
            return new UndoneTaskWithDeadline(id, name, dueDate.plusDays(1));
        }
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
    public LocalDate getDueDate() {
        return null;
    }

    @Override
    public DoneTask done() {
        return new DoneTask(id, name, LocalDate.now());
    }
}
