package csie.ase.ro.smarthome.facade;

public class SecuritySystem {
    String pin;

    public SecuritySystem(String pin){
        this.pin = pin;
    }

    public void securityOn(){
        System.out.println("Security system is on");
    }

    public void securityOff(){
        System.out.println("Security system is off");
    }

    public void lockDoors(String pin){
        if(pin.isEmpty()){
            System.out.println("Doors cannot be locked");
        }
        else {
            System.out.println("Doors locked");
        }
    }
}
