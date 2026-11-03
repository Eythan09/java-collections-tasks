import java.util.Objects;

// Задача в системе управления задачами
public class Task {
    private int id;
    private String title;
    private String status;   // TODO, IN_PROGRESS, DONE
    private int priority;    // от 1 (низкий) до 5 (высокий)

    public Task(int id, String title, String status, int priority) {
        // проверка на некорректные значения
        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException("Приоритет должен быть от 1 до 5");
        }
        this.id = id;
        this.title = title;
        this.status = status;
        this.priority = priority;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
    public int getPriority() { return priority; }

    // две задачи считаются одинаковыми, если у них одинаковый id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task other = (Task) o;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", '" + title + "', " + status + ", приоритет=" + priority + "}";
    }
}
