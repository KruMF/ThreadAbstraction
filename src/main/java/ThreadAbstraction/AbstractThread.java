package ThreadAbstraction;

//TODO: add javadoc
public abstract class AbstractThread extends Thread implements Runnable {

    @Override
    public void run() {
        update();
        finish();
    }

    //override this for thread actions
    public abstract void update();

    //happens upon finishing thread; can be overriden
    public void finish() {}
}