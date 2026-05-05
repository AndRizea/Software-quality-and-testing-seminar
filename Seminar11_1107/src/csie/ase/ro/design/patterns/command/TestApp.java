package csie.ase.ro.design.patterns.command;

public class TestApp {
    public static void main(String[] args){

        TasksManager manager = new TasksManager();

        BackupModule backupModule = new BackupModule();
        UpdateModule updateModule = new UpdateModule();

        manager.addAsyncTask(new AsyncTask("memory folder", backupModule));
        manager.addAsyncTask(new AsyncTask("update folder", updateModule));

        manager.executeNextTask();
        manager.executeNextTask();
    }
}
