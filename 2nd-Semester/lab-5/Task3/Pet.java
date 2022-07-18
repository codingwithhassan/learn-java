public class Pet extends Array{
    private String name;
    private String animal;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal){
        String possibilities[] = {"Cat","Dog","Bird"};
        if(search(animal,possibilities))
            this.animal = animal;
        else
            System.out.println("[WARN]: Invalid animal type!");
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getAnimal(){
        return this.animal;
    }

    public int getAge(){
        return this.age;
    }
}
