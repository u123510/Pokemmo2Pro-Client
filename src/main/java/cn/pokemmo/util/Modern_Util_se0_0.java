package cn.pokemmo.util;

import f.*;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * 现代化重构类 - 原始混淆类: f.se0_0
 */
public class Modern_Util_se0_0
extends ScheduledThreadPoolExecutor {

    public Modern_Util_se0_0(we_0 we_02) {
        super(3, we_02);
    }

    @Override
    public final void shutdown() {
        Modern_Util_se0_0 se0_02 = this;
        se0_02.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        super.shutdown();
    }

    @Override
    public final void afterExecute(Runnable runnable, Throwable throwable) {
        super.afterExecute(runnable, throwable);
        Future future = (Future)((Object)runnable);
        if (future.isDone()) {
            try {
                future.get();
            }
            catch (CancellationException cancellationException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {
                runnable = Thread.currentThread();
                ((Thread)runnable).getUncaughtExceptionHandler().uncaughtException((Thread)runnable, executionException.getCause());
            }
        }
    }
}


