package cn.pokemmo.util.collection;

import f.*;

public class PrimitiveSparseBitMatrix {
    public static final Object V30;
    public static XP nF0;
    public final es_1 OA;

    public static _finally HG() {
        synchronized (V30) {
            XP xp = UY();
            if (xp.ia0 == null) {
                xp.ia0 = new _finally();
            }
            return xp.ia0;
        }
    }

    public static XP UY() {
        synchronized (V30) {
            XP xp = nF0;
            if (xp == null || xp.ZD0 != lg_0.I70) {
                if (xp != null) {
                    xp.dispose();
                }
                nF0 = new XP();
            }
            return nF0;
        }
    }

    public PrimitiveSparseBitMatrix() {
        this.OA = new es_1(false, 8);
        this.h60();
    }

    static {
        V30 = new Object();
    }

    public final m0_0 dH0(m0_0 v1, float f2) {
        synchronized (V30) {
            synchronized (this) {
                synchronized (v1) {
                    if (v1.RB != null) {
                        throw new IllegalArgumentException("The same task may not be scheduled twice.");
                    }
                    v1.RB = (_finally) (Object) this;
                    long nanoMillis = System.nanoTime() / 1000000L;
                    long executeTimeMillis = nanoMillis + (long) (f2 * 1000.0f);
                    long pauseMillis = nF0.eK;
                    if (pauseMillis > 0L) {
                        executeTimeMillis -= (nanoMillis - pauseMillis);
                    }
                    v1.bM0 = executeTimeMillis;
                    v1.h90 = 0L;
                    v1.eL0 = 0;
                    this.OA.Ue0(v1);
                }
            }
            V30.notifyAll();
            return v1;
        }
    }

    public final void h60() {
        synchronized (V30) {
            es_1 es = UY().mk0;
            if (es.j4(this, true)) {
                return;
            }
            es.Ue0(this);
            V30.notifyAll();
        }
    }

    public final synchronized long tW(long timeMillis, long waitMillis) {
        int i = 0;
        int n = this.OA.KB;
        while (i < n) {
            m0_0 task = (m0_0) this.OA.get(i);
            synchronized (task) {
                long taskTime = task.bM0;
                if (taskTime > timeMillis) {
                    waitMillis = Math.min(waitMillis, taskTime - timeMillis);
                } else {
                    if (task.eL0 == 0) {
                        task.RB = null;
                        this.OA.Tx0(i);
                        i--;
                        n--;
                    } else {
                        task.bM0 = timeMillis + task.h90;
                        waitMillis = Math.min(waitMillis, task.h90);
                        if (task.eL0 > 0) {
                            task.eL0--;
                        }
                    }
                    task.nb0.lPT5(task);
                }
            }
            i++;
        }
        return waitMillis;
    }

    public final synchronized void lQ(long delayMillis) {
        int i = 0;
        int n = this.OA.KB;
        while (i < n) {
            m0_0 task = (m0_0) this.OA.get(i);
            synchronized (task) {
                task.bM0 += delayMillis;
            }
            i++;
        }
    }
}
