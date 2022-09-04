public class Task extends Module{
    private String taskName;
    private String taskDescription;

    public Task() {
        super();
        this.taskName = "No Name";
        this.taskDescription = null;
    }

    public Task(String taskName, String taskDescription) {
        super();
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public Task(int projectID, String projectName, String projectLocation,String moduleName,String taskName, String taskDescription) {
        super(projectID, projectName, projectLocation, moduleName);
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    
}
