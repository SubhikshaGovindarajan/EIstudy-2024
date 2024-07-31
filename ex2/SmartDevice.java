public interface SmartDevice {
    void turnOn();
    void turnOff();
    String getStatus();
    int getId(); // Added this method for device identification
}

