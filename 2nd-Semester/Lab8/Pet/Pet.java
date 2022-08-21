public class Pet {
    private String name;
    private String animal;
    private int age;

    public Pet(){
        this.name = null;
        this.animal = null;
        this.age = 0;
    }

    public Pet(Pet p){
        this.name = p.getName();
        this.animal = p.getAnimal();
        this.age = p.getAge();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimal(String animal){
        this.animal = animal;
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

    @Override
    public String toString() {
        return String.format(
            "\nName: %s\nAnimal: %s\nAge: %2d\n",
            getName(),getAnimal(),getAge()
        );
    }

    public void display() {
        System.out.println(this);
    }

    public boolean compare(Pet pet) {
        if(
            pet.getAge() == this.getAge() &&
            pet.getAnimal().equals(this.getAnimal()) &&
            pet.getName().equals(this.getName())
        )
            return true;
        return false;
    }

    public boolean isNotEqual(Pet pet) {
        if(
            pet.getAge() == this.getAge() &&
            pet.getAnimal().equals(this.getAnimal()) &&
            pet.getName().equals(this.getName())
        )
            return false;
        return true;
    }

    public static Pet create(Pet p){
        return new Pet(p);
    }
}
