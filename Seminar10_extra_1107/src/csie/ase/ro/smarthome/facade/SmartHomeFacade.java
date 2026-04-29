package csie.ase.ro.smarthome.facade;

public class SmartHomeFacade {

    LightingSystem lightingSystem;
    HVACSystem hvacSystem;
    SecuritySystem securitySystem;

    public SmartHomeFacade(String homeId, String alarmPin){
        this.lightingSystem = new LightingSystem(homeId);
        this.hvacSystem = new HVACSystem(homeId);
        this.securitySystem = new SecuritySystem(alarmPin);
    }

    public void goodNight(){
        this.lightingSystem.turnOff();
        this.hvacSystem.setCurrentTemperature(22);
        this.securitySystem.securityOn();
    }
}
