public class Task {
    private int id;
    private String name;
    private int priority;

    public Task(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return "Task{id=" + id + ", name='" + name + "', priority=" + priority + "}";
    }
}
