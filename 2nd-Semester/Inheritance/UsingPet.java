public class UsingPet {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        System.out.println("Displaying state of bird #1:");
        bird1.display();
        bird1.squawk();
        bird1.fly();
        bird1.eat("Seeds");

        Bird bird2 = new Bird("black", 1.3, "fish-eater", true);
        System.out.println("\nDisplaying state of bird #2:");
        bird2.display();
        bird2.squawk();
        bird2.fly();
        bird2.eat("fish");

        Bird bird3 = new Bird("Red", 1.4, "meat-eater", true, "black", 6, 4.0, "Asia");
        System.out.println("\nDisplaying state of bird #3:");
        bird3.display();
        bird3.squawk();
        bird3.fly();
        bird3.eat("meat");

        bird2.setFeatherColor("blue");
        bird2.setWingSpan(1.4);
        bird2.setBeakType("fruit-and-nut-eater");
        bird2.setCanFly(false);
        System.out.println("\nDisplaying state of bird #2 after changing the values:");
        bird2.display();
        bird2.squawk();
        bird2.fly();
        bird2.eat("fruits");

        Cat cat1 = new Cat();
        System.out.println("\n\n\nDisplaying state of cat #1:");
        cat1.display();
        cat1.purr(3);
        cat1.meow();
        cat1.eat("chicken");

        Cat cat2 = new Cat("black", "white", 1.4, 18);
        System.out.println("\nDisplaying state of cat #2:");
        cat2.display();
        cat2.purr(4);
        cat2.meow();
        cat2.eat("fish");

        Cat cat3 = new Cat("black", "white", 1.4, 18, "blue", 2, 4.0, "Asia");
        System.out.println("\nDisplaying state of cat #3:");
        cat3.display();
        cat3.purr(4);
        cat3.meow();
        cat3.eat("fish");

        cat2.setFurColor("white");
        cat2.setWhiskerColor("gray");
        cat2.setFurLength(1.5);
        cat2.setToeNumber(22);
        System.out.println("\nDisplaying state of cat #2 after changing the values:");
        cat2.display();
        cat2.purr(5);
        cat2.meow();
        cat2.eat("fish");

        Fish fish1 = new Fish();
        System.out.println("\n\n\nDisplaying state of fish #1:");
        fish1.display();
        fish1.swim("clockwise");
        fish1.eat("flake food");

        Fish fish2 = new Fish(true, false, 5);
        System.out.println("\nDisplaying state of fish #2:");
        fish2.display();
        fish2.swim("counter clockwise");
        fish2.eat("Pellets food");

        Fish fish3 = new Fish(true, false, 4, "black", 1, 0.8, "Asia");
        System.out.println("\nDisplaying state of fish #3:");
        fish3.display();
        fish3.swim("clockwise");
        fish3.eat("freeze-dried food");

        fish2.setJawless(false);
        fish2.setDorsalFin(true);
        fish2.setSwimSpeed(6);
        System.out.println("\nDisplaying state of fish #2 after changing the values:");
        fish2.display();
        fish2.swim("clockwise");
        fish2.eat("Frozen food");
    }// main
}// class