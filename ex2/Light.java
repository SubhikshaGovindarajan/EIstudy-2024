public class Light implements SmartDevice {
    private boolean isOn;
    private int id;

    public Light(int id) {
        this.id = id;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light " + id + " is On.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light " + id + " is Off.");
    }

    @Override
    public String getStatus() {
        return isOn ? "Light " + id + " is On." : "Light " + id + " is Off.";
    }

    @Override
    public int getId() {
        return id;
    }
}
