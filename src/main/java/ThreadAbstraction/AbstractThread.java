package ThreadAbstraction;

/**
 * An abstract thread that runs only once.
 * Use start() to start the thread.
 * Has to be re-created upon every re-use.
 */
public abstract class AbstractThread extends Thread implements Runnable {

    /**
     * Happens when thread runs.
     * Do not override this (see update() for custom actions).
     */
    @Override
    public void run() {
        update();
        finish();
    }

    /**
     * Gets called when thread runs.
     * Override this method for custom actions.
     */
    public abstract void update();

    /**
     * Happens upon finishing thread.
     * Can be overriden for custom ending.
     */
    public void finish() {}
}