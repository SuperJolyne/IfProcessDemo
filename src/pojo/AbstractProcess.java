package pojo;

public abstract class AbstractProcess<T extends CustomObject>{

    final public void process(T context){
        if (context == null){
            return;
        }
        doProcess(context);
    }

    abstract protected void doProcess(T context);
}
