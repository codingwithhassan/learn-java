public class Run {
    public static void main(String[] args) {
        Pet cat = new Pet();

        cat.setName("kitti");
        cat.setAnimal("Cat");
        cat.setAge(4);

        Pet cat2 = new Pet(cat);

        System.out.println(cat);
        System.out.println(cat2);
    }
}
