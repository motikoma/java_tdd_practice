package removeComplexity.v2.domain.task;

import removeComplexity.v2.domain.task.done.DoneHighPriorityTask;
import removeComplexity.v2.domain.task.done.DoneLowerPriorityTask;
import removeComplexity.v2.domain.task.done.DoneMiddlePriorityTask;
import removeComplexity.v2.domain.task.done.DoneTask;
import removeComplexity.v2.domain.task.undone.UndoneHighPriorityTask;
import removeComplexity.v2.domain.task.undone.UndoneLowPriorityDeadlineTask;
import removeComplexity.v2.domain.task.undone.UndoneMiddlePriorityDeadlineTask;
import removeComplexity.v2.domain.task.undone.UndoneTask;
import removeComplexity.v2.domain.task.undone.postponable.UndoneLowPriorityPostponableTask;
import removeComplexity.v2.domain.task.undone.postponable.UndoneMiddlePriorityPostponableTask;
import removeComplexity.v2.domain.task.undone.postponable.UndonePostponableTask;

public class TaskFactory {
    /**
     * パターンに応じてDBの値からタスクを再生成する
     * MEMO: ここに複雑性が集中している
     *
     * @param id
     * @param name
     * @param priority
     * @param postponeCount
     * @param status
     * @return
     */

    public static UndoneTask reconstructUndoneTask(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (priority == "high") {
            return UndoneHighPriorityTask.reconstruct(id, name, priority, postponeCount, status);
        } else if (priority == "middle" && postponeCount.getValue() == 3) {
            return UndoneMiddlePriorityDeadlineTask.reconstruct(id, name, priority, postponeCount, status);
        } else if (priority == "low" && postponeCount.getValue() < 3) {
            return UndoneLowPriorityDeadlineTask.reconstruct(id, name, priority, postponeCount, status);
        } else {
            throw new RuntimeException();
        }
    }

    public static UndonePostponableTask reconstructUndonePostponableTask(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (priority == "middle" && postponeCount.getValue() == 3) {
            return UndoneMiddlePriorityPostponableTask.reconstruct(id, name, priority, postponeCount, status);
        } else if (priority == "low" && postponeCount.getValue() < 3) {
            return UndoneLowPriorityPostponableTask.reconstruct(id, name, priority, postponeCount, status);
        } else {
            throw new RuntimeException();
        }
    }

    public static DoneTask reconstructDoneTask(final Long id, final String name, final String priority, final PostponeCount postponeCount, final String status) {
        if (priority == "high") {
            return DoneHighPriorityTask.reconstruct(id, name, priority, postponeCount, status);
        } else if (priority == "middle") {
            return DoneMiddlePriorityTask.reconstruct(id, name, priority, postponeCount, status);
        } else if (priority == "low") {
            return DoneLowerPriorityTask.reconstruct(id, name, priority, postponeCount, status);
        } else {
            throw new RuntimeException();
        }
    }
}
