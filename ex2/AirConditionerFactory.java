public class AirConditionerFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice(int id) {
        return new AirConditioner(id);
    }
}

