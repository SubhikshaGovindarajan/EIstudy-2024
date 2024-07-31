public class AirConditioner implements SmartDevice {
    private boolean isOn;
    private int id;

    public AirConditioner(int id) {
        this.id = id;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner " + id + " is On.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner " + id + " is Off.");
    }

    @Override
    public String getStatus() {
        return isOn ? "Air Conditioner " + id + " is On." : "Air Conditioner " + id + " is Off.";
    }

    @Override
    public int getId() {
        return id;
    }
}

