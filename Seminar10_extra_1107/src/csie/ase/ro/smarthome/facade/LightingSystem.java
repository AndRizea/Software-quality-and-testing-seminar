package csie.ase.ro.smarthome.facade;

public class LightingSystem {
    String zoneId;

    public LightingSystem(String zoneId){
        this.zoneId = zoneId;
    }

    public void turnOn(){
        System.out.println("Light are on in zone " + zoneId);
    }

    public void turnOff(){
        System.out.println("Light are off in zone " + zoneId);
    }

    public void dimAll(int percent){
        System.out.println("Lights dimmed to " + percent + " in zone " + zoneId);
    }

}
