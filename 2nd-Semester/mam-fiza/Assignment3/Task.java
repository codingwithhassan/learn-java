public class Task {

    private int id;
    private String title;
    private boolean complete;

    public Task() {
        this.id = 0;
        this.title = "No Title";
        this.complete = false;
    }

    public Task(String title, boolean complete) {
        this.id = 0;
        this.title = title;
        this.complete = complete;
    }

    public Task(int id, String title, boolean complete) {
        this.id = id;
        this.title = title;
        this.complete = complete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return complete;
    }

    public void markAsComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task [complete=" + complete + ", id=" + id + ", title=" + title + "]";
    }
}
