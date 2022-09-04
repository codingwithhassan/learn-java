public class UsingTasks {
    public static void main(String[] args) {
        Module module0 = new Module();
        Module module1 = new Module("module 1");
        Module module2 = new Module(1,"Prime","UK","module 2");

        System.out.println("\n\nModules: ");
        module0.displayState();
        module1.displayState();
        module2.displayState();

        module0.setProjectID(2);
        module0.setProjectName("Keywordcaddy");
        module1.setModuleName("Module 2 dulplicate");

        System.out.println("\n\nModules after changing: ");
        module0.displayState();
        module1.displayState();
        module2.displayState();
        
        Task task0 = new Task();
        Task task1 = new Task("task 0","description 00...");
        Task task2 = new Task(1,"Prime","UK","module 2","task 11","description 11...");
        
        System.out.println("\n\nTasks: ");
        task0.displayState();
        task1.displayState();
        task2.displayState();

        task0.setProjectID(2);
        task0.setProjectLocation("PK");
        task0.setTaskName("Server Management");
        
        System.out.println("\n\nTasks after changing: ");
        task0.displayState();
        task1.displayState();
        task2.displayState();
    }
}
