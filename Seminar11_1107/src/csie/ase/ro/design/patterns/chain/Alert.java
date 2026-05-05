package csie.ase.ro.design.patterns.chain;

public class Alert {
    private int priority;
    private String text;

    public Alert(String Text, int priority){
        this.text = Text;
        this.priority = priority;
    }

    public int getPriority(){
        return priority;
    }

    public String getText(){
        return text;
    }
}
