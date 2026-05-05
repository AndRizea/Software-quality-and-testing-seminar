package csie.ase.ro.design.patterns.chain;

public class TestApp {
    public static void main(String[] args){
        AlertHandler lowP = new LowPriorityAlertProcessor();
        AlertHandler highP = new HighPriorityAlertProcessor();
        AlertHandler criticalP = new CriticalPriorityAlertProcessor();
        AlertHandler anticheat = new AntiCheatProcessor();

        criticalP.setSuccessor(highP);
        highP.setSuccessor(lowP);

        anticheat.setSuccessor(criticalP);

        Alert alert1 = new Alert("Cheat detected", 200);
        Alert alert2 = new Alert("Player disconnected", 45);

        anticheat.manageRequest(alert1);
        anticheat.manageRequest(alert2);
    }
}
