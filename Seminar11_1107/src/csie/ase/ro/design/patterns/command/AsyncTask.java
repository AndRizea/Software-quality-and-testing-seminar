package csie.ase.ro.design.patterns.command;

public class AsyncTask extends AbstractAsyncTask{

    String params;
    IGameModule module;

    public AsyncTask(String params, IGameModule module){
        this.params = params;
        this.module = module;
    }

    @Override
    public void doAction() {
        if(this.module!=null){
            this.module.executeTask(this.params);
        }
    }
}
