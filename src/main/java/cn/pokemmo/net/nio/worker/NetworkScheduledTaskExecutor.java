package cn.pokemmo.net.nio.worker;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class NetworkScheduledTaskExecutor implements wz_1 {
    public static final dl_1 r1;
    public static final lpt5__5 hL;
    public final se0_0 Com4;

    public static lpt5__5 I20() {
        return hL;
    }

    public NetworkScheduledTaskExecutor() {
        this.Com4 = new se0_0(new we_0());
    }

    static {
        r1 = Cq0.E1(NetworkScheduledTaskExecutor.class);
        hL = new lpt5__5();
    }

    public final ScheduledFuture<?> ZD(Runnable task, long delay) {
        if (delay < 0L) {
            delay = 0L;
        }
        try {
            return this.Com4.schedule(task, delay, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException ignored) {
            return null;
        }
    }

    public final ScheduledFuture<?> AH0(Runnable task, long delay) {
        if (delay < 0L) {
            delay = 0L;
        }
        long period = 15000L;
        try {
            return this.Com4.scheduleAtFixedRate(task, period, delay, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException ignored) {
            return null;
        }
    }
}
