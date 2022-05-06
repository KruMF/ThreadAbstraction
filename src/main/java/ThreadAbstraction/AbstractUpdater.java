package ThreadAbstraction;

import DelayCalculator.DelayCalculator;
import DelayCalculator.DelayOptions;

//TODO: add javadoc
public abstract class AbstractUpdater extends AbstractThread {
    private boolean running;
    public DelayCalculator delayCalculator;

    public AbstractUpdater() {
        running = false;
        delayCalculator = new DelayCalculator();
    }

    public AbstractUpdater(long delay) {
        running = false;
        delayCalculator = new DelayCalculator(delay);
    }

    public AbstractUpdater(DelayOptions delayOptions) {
        running = false;
        delayCalculator = new DelayCalculator(delayOptions);
    }

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

    //override this to check for cycle breaking
    public void endCheck() {}

    //call this to stop
    public final void end() {
        running = false;
    }
}