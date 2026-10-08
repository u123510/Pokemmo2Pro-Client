package cn.pokemmo.util.logging;

import f.KV;
import f.dl_1;
import f.eb_0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class Slf4jLoggerFactoryAdapter implements KV {
    public volatile boolean wm0;
    public final ConcurrentHashMap<String, eb_0> tc;
    public final LinkedBlockingQueue aK0;

    public Slf4jLoggerFactoryAdapter() {
        this.wm0 = false;
        this.tc = new ConcurrentHashMap<String, eb_0>();
        this.aK0 = new LinkedBlockingQueue();
    }

    @Override
    public synchronized dl_1 getLogger(String v1) {
        eb_0 v2 = this.tc.get(v1);
        if (v2 == null) {
            v2 = new eb_0(v1, this.aK0, this.wm0);
            this.tc.put(v1, v2);
        }
        return v2;
    }
}
