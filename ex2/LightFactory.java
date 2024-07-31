public class LightFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice(int id) {
        return new Light(id);
    }
}
