import java.util.Scanner;

public class SmartOfficeDemo {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();

        // Create factories
        DeviceFactory lightFactory = new LightFactory();
        DeviceFactory acFactory = new AirConditionerFactory();

        // Create rooms and add devices
        Room room1 = new Room(1);
        room1.addDevice(lightFactory.createDevice(1));
        room1.addDevice(acFactory.createDevice(1));

        Room room2 = new Room(2);
        room2.addDevice(lightFactory.createDevice(2));

        // Add rooms to the hub
        hub.addRoom(room1);
        hub.addRoom(room2);

        // Create a simple console interface
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (book <room_id>, vacate <room_id>, status <room_id>, exit):");
            String command = scanner.nextLine();

            if (command.startsWith("book")) {
                int roomId = Integer.parseInt(command.split(" ")[1]);
                hub.bookRoom(roomId);
            } else if (command.startsWith("vacate")) {
                int roomId = Integer.parseInt(command.split(" ")[1]);
                hub.vacateRoom(roomId);
            } else if (command.startsWith("status")) {
                int roomId = Integer.parseInt(command.split(" ")[1]);
                System.out.println(hub.getRoomStatus(roomId));
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Unknown command.");
            }
        }

        scanner.close();
    }
}

