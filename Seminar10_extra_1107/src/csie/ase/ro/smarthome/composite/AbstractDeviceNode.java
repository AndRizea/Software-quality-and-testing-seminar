package csie.ase.ro.smarthome.composite;

public abstract class AbstractDeviceNode extends AbstractDevice implements SmartDeviceInterface{

    public abstract void addNode(AbstractDeviceNode node);
    public abstract AbstractDeviceNode getNode(int index);
    public abstract void removeNode(AbstractDeviceNode node);
}
