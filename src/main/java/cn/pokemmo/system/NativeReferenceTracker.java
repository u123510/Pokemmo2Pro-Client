package cn.pokemmo.system;

import f.bi_1;
import f.hg_1;
import f.ll0_0;
import f.u40_0;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class NativeReferenceTracker {
    public static final ReferenceQueue PS;
    public static final Set hM;
    public static final Map XF0;

    public NativeReferenceTracker() {
    }

    public static void dd(bi_1 value) {
        hg_1 reference = new hg_1(value);
        ((AtomicInteger) XF0.computeIfAbsent(
                Long.valueOf(value.U9),
                (java.util.function.Function<Long, AtomicInteger>) (key -> S40(key))
        )).incrementAndGet();
        hM.add(reference);
    }

    public static AtomicInteger S40(Long value) {
        return new AtomicInteger(0);
    }

    static {
        PS = new ReferenceQueue();
        hM = Collections.synchronizedSet(new HashSet());
        XF0 = Collections.synchronizedMap(new HashMap());
        Thread releaseThread = new ll0_0();
        releaseThread.setDaemon(true);
        releaseThread.setName("jnigen release thread");
        releaseThread.setUncaughtExceptionHandler(new u40_0());
        releaseThread.start();
    }
}
