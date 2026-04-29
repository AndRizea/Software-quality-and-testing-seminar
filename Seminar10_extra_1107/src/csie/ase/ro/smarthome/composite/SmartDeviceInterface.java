package csie.ase.ro.smarthome.composite;

public interface SmartDeviceInterface {
    public void turnOn();
    public void turnOff();
    public int getPowerConsumption();
    public String getName();
}
