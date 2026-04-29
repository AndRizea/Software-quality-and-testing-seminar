package csie.ase.ro.smarthome.facade;

public class HVACSystem {
    String zoneId;
    int currentTemperature;

    public HVACSystem(String zoneId){
        this.zoneId = zoneId;
    }

    public void setCurrentTemperature(int celsius){
        this.currentTemperature = celsius;
        System.out.println("HVAC temp set to " + celsius);
    }

    public void HVACon(){
        System.out.println("HVAC on in zone " + zoneId);
    }
}
