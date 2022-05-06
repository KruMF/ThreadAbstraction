package ThreadAbstraction;

import DelayCalculator.DelayCalculator;
import DelayCalculator.DelayOptions;
import com.google.inject.internal.Nullable;

/**
 * An abstract thread that performs an infinite loop when started.
 * Use start() to start the thread.
 */
@SuppressWarnings("unused")
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
    public AbstractUpdater(@Nullable DelayOptions delayOptions) {
        running = false;
        delayCalculator = new DelayCalculator(delayOptions);
    }

    /**
     * Happens when thread runs.
     * Not overridable (see super.update() for custom actions).
     */
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

    /**
     * Override this for custom end check for breaking the infinite loop.
     * Happens at the end of every cycle.
     */
    public void endCheck() {}

    /**
     * Call this to stop the infinite loop.
     */
    public final void end() {
        running = false;
    }
}