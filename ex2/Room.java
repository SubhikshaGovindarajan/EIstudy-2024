import java.util.ArrayList;
import java.util.List;

public class Room {
    private int id;
    private boolean isOccupied;
    private List<SmartDevice> devices;

    public Room(int id) {
        this.id = id;
        this.isOccupied = false;
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
        updateDevices();
    }

    private void updateDevices() {
        if (isOccupied) {
            for (SmartDevice device : devices) {
                device.turnOn();
            }
        } else {
            for (SmartDevice device : devices) {
                device.turnOff();
            }
        }
    }

    public String getStatus() {
        StringBuilder status = new StringBuilder("Room " + id + " is " + (isOccupied ? "Occupied" : "Not Occupied") + ".\n");
        for (SmartDevice device : devices) {
            status.append(device.getStatus()).append("\n");
        }
        return status.toString();
    }

    public int getId() {
        return id;
    }
}
