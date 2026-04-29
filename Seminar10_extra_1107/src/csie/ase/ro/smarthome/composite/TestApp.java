package csie.ase.ro.smarthome.composite;

public class TestApp {
    public static void main(String[] args){
        AbstractDeviceNode zone = new Zone();
        AbstractDeviceNode light1 = new SmartLight("Kitchen light ceiling", 20);
        AbstractDeviceNode ligth2 = new SmartLight("Kitchen spotlight", 10);

        zone.addNode(light1);
        zone.addNode(ligth2);

        AbstractDeviceNode subZone = new Zone();

        zone.addNode(subZone);

        subZone.addNode(new SmartLight("Living room main light", 30));
        zone.turnOn();
        System.out.println(zone.getPowerConsumption());
    }
}
