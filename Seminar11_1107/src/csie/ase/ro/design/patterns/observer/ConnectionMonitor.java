package csie.ase.ro.design.patterns.observer;

import java.util.ArrayList;

public class ConnectionMonitor {

    ArrayList<INotificationService> observers = new ArrayList<>();

    public void registerObserver(INotificationService observer){
        this.observers.add(observer);
    }

    public void unregisterObserver(INotificationService observer){
        this.observers.remove(observer);
    }

    public void sendNotifications(){
        for (INotificationService o : observers){
            o.react("Connection lost");
        }
    }

    public void checkConnection(){
        System.out.println("Connection UP");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection DOWN");
        this.sendNotifications();
    }
}
