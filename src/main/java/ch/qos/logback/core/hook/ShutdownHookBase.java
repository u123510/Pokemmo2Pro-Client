package ch.qos.logback.core.hook;

import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.spi.ContextAwareBase;

public abstract class ShutdownHookBase extends ContextAwareBase implements ShutdownHook {
    public ShutdownHookBase() {
    }

    public void stop() {
        addInfo("Logback context being closed via shutdown hook");
        if (getContext() instanceof ContextBase) ((ContextBase) getContext()).stop();
    }
}
