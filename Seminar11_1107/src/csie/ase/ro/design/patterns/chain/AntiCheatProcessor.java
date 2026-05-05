package csie.ase.ro.design.patterns.chain;

public class AntiCheatProcessor extends AlertHandler{
    @Override
    public void manageRequest(Alert alert) {
        if(alert.getText().toLowerCase().contains("cheat")){
            System.out.println("Anti-cheat triggered");
        }
        if(this.succesor != null){
            this.succesor.manageRequest(alert);
        }
    }
}
