public class Project {
    private int projectID;
    private String projectName;
    private String projectLocation;

    public Project() {
        this.projectID = 0;
        this.projectName = "unknown";
        this.projectLocation = "unknown";
    }
    
    public Project(int projectID, String projectName, String projectLocation) {
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
    
    public void displayState(){
        System.out.printf(
            "Project ID: %d\nProject Name: %s\nProject Location: %s\n",
            this.getProjectID(),
            this.getProjectName(),
            this.getProjectLocation()
        );
    }
}
