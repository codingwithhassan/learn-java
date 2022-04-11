import java.util.Scanner;
public class OccupancyRate{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int totalRooms = 0, totalOccupyRooms = 0;
        
        System.out.print("Enter the number of floors : ");
        int floors = in.nextInt();
        while(floors < 1){
            System.out.print("Number of floors must not be less than 1!\nEnter the number of floors : ");
            floors = in.nextInt();
        }
        
        for(int floor = 1;floor <= floors; floor++){
            System.out.print("Enter total number of rooms for floor "+floor+": ");
            int rooms = in.nextInt();
            while(rooms < 10){
                System.out.print("Number of floors must not be less than 10!\nEnter total number of rooms for floor "+floor+": ");
                rooms = in.nextInt();
            }
            System.out.print("Enter occupied number of rooms for floor "+floor+": ");
            int occupyRooms = in.nextInt();
            while(rooms < 0){
                System.out.print("Number of floors must be postive number!\nEnter occupied number of rooms for floor "+floor+": ");
                rooms = in.nextInt();
            }
            
            totalRooms += rooms;
            totalOccupyRooms += occupyRooms;
        }
        
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Occupied Rooms: " + totalOccupyRooms);
        System.out.println("Vacant Rooms: " + (totalRooms - totalOccupyRooms));

    }
}