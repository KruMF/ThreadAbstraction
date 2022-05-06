package ThreadAbstraction;

import DelayCalculator.DelayCalculator;
import DelayCalculator.DelayOptions;

//TODO: add javadoc
public abstract class AbstractUpdater extends AbstractThread {
    private boolean running;

    /**
     * A public-access DelayCalculator object for handling thread delay.
     * Use this to set/reset preferences.
     */
    public DelayCalculator delayCalculator;

    /**
     * Creates an abstract updater with default delay options.
     */
    public AbstractUpdater() {
        running = false;
        delayCalculator = new DelayCalculator();
    }

    /**
     * Creates an abstract updater with specified delay in milliseconds.
     *
     * @param delay Milliseconds.
     */
    public AbstractUpdater(long delay) {
        running = false;
        delayCalculator = new DelayCalculator(delay);
    }

    /**
     * Creates an abstract updater with specified delay options.
     *
     * @param delayOptions Delay options.
     */
    public AbstractUpdater(DelayOptions delayOptions) {
        running = false;
        delayCalculator = new DelayCalculator(delayOptions);
    }

    //TODO: add javadoc
    @SuppressWarnings("BusyWait")
    @Override
    public final void run() {
        running = true;
        while (running) {
            update();
            try {
                Thread.sleep(delayCalculator.getDelay());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            endCheck();
        }
        finish();
    }

    //TODO: add javadoc
    //override this to check for cycle breaking
    public void endCheck() {}

    //TODO: add javadoc
    //call this to stop
    public final void end() {
        running = false;
    }
}