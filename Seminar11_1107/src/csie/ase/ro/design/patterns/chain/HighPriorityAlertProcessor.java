package csie.ase.ro.design.patterns.chain;

public class HighPriorityAlertProcessor extends AlertHandler{
    @Override
    public void manageRequest(Alert alert) {
        if(alert.getPriority() > 50 && alert.getPriority() <=100){
            System.out.println("High priority alert: " + alert.getText());
        }
        else {
            if(this.succesor != null){
                this.succesor.manageRequest(alert);
            }
        }
    }
}
