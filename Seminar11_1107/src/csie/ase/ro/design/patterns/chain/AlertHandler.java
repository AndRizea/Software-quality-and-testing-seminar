package csie.ase.ro.design.patterns.chain;

public abstract class AlertHandler {
    protected AlertHandler succesor = null;

    public void setSuccessor(AlertHandler succesor){
        this.succesor = succesor;
    }

    public abstract void manageRequest(Alert alert);
}
