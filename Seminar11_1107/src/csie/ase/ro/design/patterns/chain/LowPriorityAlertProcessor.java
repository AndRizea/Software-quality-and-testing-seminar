package csie.ase.ro.design.patterns.chain;

public class LowPriorityAlertProcessor extends AlertHandler{
    public void manageRequest(Alert alert)
    {
        if (alert.getPriority() <= 50){
            System.out.println("\n Low priority alert: "+alert.getText());
        }
    }
}
