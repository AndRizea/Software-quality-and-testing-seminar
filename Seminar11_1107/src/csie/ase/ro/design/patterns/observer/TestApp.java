package csie.ase.ro.design.patterns.observer;

public class TestApp {
    public static void main(String[] args){
        ConnectionMonitor monitor = new ConnectionMonitor();

        NotificationsModule notificationsModule = new NotificationsModule();

        monitor.registerObserver(notificationsModule);
        monitor.registerObserver(new BackupModule());

        monitor.checkConnection();

        monitor.unregisterObserver(notificationsModule);
        monitor.checkConnection();

    }
}
