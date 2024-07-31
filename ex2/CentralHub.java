import java.util.HashMap;
import java.util.Map;

public class CentralHub {
    private Map<Integer, Room> rooms;

    public CentralHub() {
        rooms = new HashMap<>();
    }

    public void addRoom(Room room) {
        rooms.put(room.getId(), room);
    }

    public void bookRoom(int id) {
        Room room = rooms.get(id);
        if (room != null) {
            room.setOccupied(true);
        }
    }

    public void vacateRoom(int id) {
        Room room = rooms.get(id);
        if (room != null) {
            room.setOccupied(false);
        }
    }

    public String getRoomStatus(int id) {
        Room room = rooms.get(id);
        return room != null ? room.getStatus() : "Room not found.";
    }
}

