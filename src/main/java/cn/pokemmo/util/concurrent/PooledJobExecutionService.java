package cn.pokemmo.util.concurrent;

import f.T00;
import f.cq_1;
import f.nb_2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PooledJobExecutionService {
    public final ThreadPoolExecutor Ip;
    public final nb_2 Be0;
    public final nb_2 Gl;
    public final nb_2 mA;

    public PooledJobExecutionService() {
        this(Integer.MAX_VALUE);
    }

    public PooledJobExecutionService(int maximum) {
        boolean unbounded = maximum == Integer.MAX_VALUE;
        int core = unbounded ? 0 : maximum;
        BlockingQueue<Runnable> queue = unbounded
                ? new SynchronousQueue<>()
                : new LinkedBlockingQueue<>();
        this.Ip = new ThreadPoolExecutor(core, maximum, 60L, TimeUnit.SECONDS,
                queue, new cq_1());
        this.Ip.allowCoreThreadTimeOut(!unbounded);
        this.Be0 = new nb_2();
        this.Gl = new nb_2();
        this.mA = new nb_2();
    }

    public synchronized void PQ(T00 value) {
        this.Be0.ns0(value);
        this.Gl.ns0(value);
        this.mA.ns0(value);
    }
}
