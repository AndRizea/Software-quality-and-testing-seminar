package csie.ase.ro.smarthome.facade;

public class TestApp {
    public static void main(String[] args){
        // without facade
        LightingSystem lightingSystem = new LightingSystem("home-1");
        HVACSystem hvacSystem = new HVACSystem("home-1");
        SecuritySystem securitySystem = new SecuritySystem("456");

        // go to sleep
        lightingSystem.turnOff();
        hvacSystem.setCurrentTemperature(22);
        securitySystem.securityOn();

        // with facade
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade("home-1", "456");
        smartHomeFacade.goodNight();

    }
}
