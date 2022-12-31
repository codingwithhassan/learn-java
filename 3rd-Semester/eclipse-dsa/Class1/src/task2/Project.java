package task2;

public class Project {
	int projectID;
	String projectName;
	String projectLocation;

	public Project() {

	}

	public Project(int projectID, String projectName, String projectLocation) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.projectLocation = projectLocation;
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String toString() {
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", projectLocation="
				+ projectLocation + "]";
	}
	
	public void displayState() {
		System.out.println(this);
	}
}
