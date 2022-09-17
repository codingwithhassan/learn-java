import java.util.List;

public abstract class Employee {
    private int id;
    private String name;
    private List<Task> tasks;
    private Salary salary;

    public Employee() {
        this.id = 0;
        this.name = "No Name";
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTask(String title, boolean isCompleted){
        int id = 0;
        for (Task task : tasks) {
            if(task.getId() > id)
                id = task.getId();
        }
        Task task = new Task(id + 1,title,isCompleted);
        tasks.add(task);
    }

    public void addTask(String title){
        int id = 0;
        for (Task task : tasks) {
            if(task.getId() > id)
                id = task.getId();
        }
        Task task = new Task(id + 1,title, false);
        tasks.add(task);
    }

    public boolean removeTask(String title){
        for (Task task : tasks) {
            if(task.getTitle().equals(title)){
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public boolean removeTask(int id){
        for (Task task : tasks) {
            if(task.getId() == id){
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public void setSalary(Salary salary){
        this.salary = salary;
    }

    public Salary getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", tasks=" + tasks + ", salary="+ salary +"]";
    }

    public abstract void display();    
}
