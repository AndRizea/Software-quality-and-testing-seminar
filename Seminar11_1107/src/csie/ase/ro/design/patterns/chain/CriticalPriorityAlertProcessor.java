package csie.ase.ro.design.patterns.chain;

public class CriticalPriorityAlertProcessor extends AlertHandler {
    @Override
    public void manageRequest(Alert alert) {
        if(alert.getPriority() > 100){
            System.out.println("Critical priority alert: " + alert.getText());
        }
        else {
            if(this.succesor != null){
                this.succesor.manageRequest(alert);
            }
        }
    }
}
