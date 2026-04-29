package csie.ase.ro.smarthome.composite;

public class SmartLight extends AbstractDeviceNode{

    String name;
    int power;
    boolean isOn = false;

    public SmartLight(String name, int power){
        super();
        this.name = name;
        this.power = power;
    }

    @Override
    public void addNode(AbstractDeviceNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractDeviceNode getNode(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNode(AbstractDeviceNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getDeviceCount() {
        return 1;
    }

    @Override
    public void displayOnScreen() {
        System.out.println("Light: " + name + ", power: " + power + "is: " + (isOn ? "ON": "OFF"));
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("Light " + name + " is on");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("Light " + name + " is off");
    }

    @Override
    public int getPowerConsumption() {
        return isOn ? power : 0;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
