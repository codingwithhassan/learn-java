package task2;

public class Task extends Module {
	public String taskName;
	public String taskDescription;

	public Task() {
		super();
	}

	public Task(String taskName, String taskDescription) {
		super();
		this.taskName = taskName;
		this.taskDescription = taskDescription;
	}

	public Task(int projectID, String projectName, String projectLocation, String moduleName, String taskName, String taskDescription) {
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
	
	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", taskDescription=" + taskDescription + ", moduleName=" + moduleName
				+ ", projectID=" + projectID + ", projectName=" + projectName + ", projectLocation=" + projectLocation
				+ "]";
	}

	@Override
	public void displayState() {
		System.out.println(this);
	}
}
