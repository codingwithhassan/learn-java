public class Module extends Project{
    private String moduleName;

    public Module() {
        super();
        this.moduleName = "No Label";
    }

    public Module(String moduleName) {
        super();
        this.moduleName = moduleName;
    }

    public Module(int projectID, String projectName, String projectLocation,String moduleName) {
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
    public void displayState() {
        super.displayState();
        System.out.println("Module Name: " + this.getModuleName());
    }
}
