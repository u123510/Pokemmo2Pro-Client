package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackXp implements Runnable, com6__4  {
    public final uv_2 ZD0;
    public final du_2 gh;
    public final es_1 mk0;
    public _finally ia0;
    public long eK;

    public TaskCallbackXp() {
        super();
        this.mk0 = new es_1(1);
        this.ZD0 = lg_0.I70;
        Dt0 dt0 = lg_0.k;
        this.gh = dt0;
        dt0.NH(this);
        qY();
        Thread thread = new Thread(this, "Timer");
        thread.setDaemon(true);
        thread.start();
    }

    @Override
    public final void run() {
        while (true) {
            synchronized (_finally.V30) {
                if (_finally.nF0 != this || this.ZD0 != lg_0.I70) {
                    dispose();
                    return;
                }
                long delay = 5000L;
                if (this.eK == 0L) {
                    long now = System.nanoTime() / 1000000L;
                    int i = 0;
                    int size = this.mk0.KB;
                    while (i < size) {
                        try {
                            delay = ((_finally) this.mk0.get(i)).tW(now, delay);
                            i++;
                        } catch (Throwable th) {
                            throw new nf_1("Task failed: " + ((_finally) this.mk0.get(i)).getClass().getName(), th);
                        }
                    }
                }
                if (_finally.nF0 != this || this.ZD0 != lg_0.I70) {
                    dispose();
                    return;
                }
                if (delay > 0L) {
                    try {
                        _finally.V30.wait(delay);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public final void qY() {
        synchronized (_finally.V30) {
            long pauseMillis = (System.nanoTime() / 1000000L) - this.eK;
            int size = this.mk0.KB;
            for (int i = 0; i < size; i++) {
                ((_finally) this.mk0.get(i)).lQ(pauseMillis);
            }
            this.eK = 0L;
            _finally.V30.notifyAll();
        }
    }

    @Override
    public final void wy0() {
        synchronized (_finally.V30) {
            this.eK = System.nanoTime() / 1000000L;
            _finally.V30.notifyAll();
        }
    }

    @Override
    public final void dispose() {
        synchronized (_finally.V30) {
            if (_finally.nF0 == this) {
                _finally.nF0 = null;
            }
            this.mk0.clear();
            _finally.V30.notifyAll();
        }
        ((Dt0) this.gh).ws(this);
    }
}
