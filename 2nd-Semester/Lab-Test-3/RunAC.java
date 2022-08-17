public class RunAC {
    public static void main(String[] args) {

        AirConditioner ac0 = new AirConditioner();

        AirConditioner ac1 = new AirConditioner("Hair",1.0,"wall");
        
        AirConditioner ac2 = new AirConditioner("Intel",2.0,"ceiling");

        
        ac0.display();
        System.out.println("________________________________________");
        ac1.display();
        System.out.println("________________________________________");
        ac2.display();
        System.out.println("________________________________________");

    }
}
