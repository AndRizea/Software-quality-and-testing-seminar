package csie.ase.ro.smarthome.composite;

import java.util.ArrayList;
import java.util.List;

public class Zone extends AbstractDeviceNode{

    List<AbstractDeviceNode> nodes = new ArrayList<>();

    @Override
    public void addNode(AbstractDeviceNode node) {
        this.nodes.add(node);
    }

    @Override
    public AbstractDeviceNode getNode(int index) {
        if(index > this.nodes.size() -1){
            return null;
        }
        return this.nodes.get(index);
    }

    @Override
    public void removeNode(AbstractDeviceNode node) {
        this.nodes.remove(node);
    }

    @Override
    public int getDeviceCount() {
        return this.nodes.size();
    }

    @Override
    public void displayOnScreen() {
        for(AbstractDeviceNode n : nodes){
            n.displayOnScreen();
        }
    }

    @Override
    public void turnOn() {
        for(AbstractDeviceNode n : nodes){
            n.turnOn();
        }

    }

    @Override
    public void turnOff() {
        for(AbstractDeviceNode n : nodes){
            n.turnOff();
        }
    }

    @Override
    public int getPowerConsumption() {
        int totalPower = 0;
        for (AbstractDeviceNode n : nodes){
            totalPower +=n.getPowerConsumption();
        }
        return totalPower;
    }

    @Override
    public String getName() {
        return "Zone";
    }
}
