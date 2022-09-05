public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("biscuits", true, 4, "rabuna", "white");
        Sheep sheep = new Sheep("grass", false, 4, "sheep", "brown");

        
        Cat catDefault = new Cat();
        catDefault.setEats("ALL");
        catDefault.setVegeterian(true);
        catDefault.setNoOfLegs(4);
        catDefault.setColor("White & Black");
        Sheep sheepDefault = new Sheep();
        sheepDefault.setEats("Chicken");
        sheepDefault.setVegeterian(false);
        sheepDefault.setNoOfLegs(4);
        sheepDefault.setColor("White & Black & Brown");

        Cat cat2 = new Cat("rani", "brown");
        Sheep sheep2 = new Sheep("sheep", "black");

        System.out.println(cat);
        System.out.println(sheep);
        System.out.println(catDefault);
        System.out.println(sheepDefault);
        System.out.println(cat2);
        System.out.println(cat2);

        
        cat.setVegeterian(false);
        sheep.setEats(sheep.getEats()+", bread");

        System.out.println("After changing ........................");
        System.out.println(cat);
        System.out.println(sheep);
        System.out.println(catDefault);
        System.out.println(sheepDefault);
        System.out.println(cat2);
        System.out.println(cat2);

        System.out.println("Talk to Cat: ");
        cat.talk();

        System.out.println("Talk to Sheep: ");
        sheep.talk();
    }
}
