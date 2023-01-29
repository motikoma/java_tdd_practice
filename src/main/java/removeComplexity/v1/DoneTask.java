package removeComplexity.v1;

import java.time.LocalDate;

/**
 * 完了したタスク
 */
public class DoneTask implements Task {
    private final Long id;
    private final String name;
    private final LocalDate doneDate;

    public DoneTask(Long id, String name, LocalDate doneDate) {
        this.id = id;
        this.name = name;
        this.doneDate = doneDate;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
