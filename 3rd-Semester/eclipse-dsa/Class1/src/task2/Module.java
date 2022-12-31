package task2;

public class Module extends Project {
	public String moduleName;

	public Module() {
		super();
	}

	public Module(String moduleName) {
		super();
		this.moduleName = moduleName;
	}

	public Module(int projectID, String projectName, String projectLocation, String moduleName) {
		super(projectID, projectName, projectLocation);
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + ", projectID=" + projectID + ", projectName=" + projectName
				+ ", projectLocation=" + projectLocation + "]";
	}

	public void displayState() {
		System.out.println(this);
	}
}
