package cn.pokemmo.task.callback;

import f.*;

public abstract class TaskCallbackM0Underscore0 implements Runnable  {
    public final Dt0 nb0;
    public long bM0;
    public long h90;
    public int eL0;
    public volatile _finally RB;

    public TaskCallbackM0Underscore0() {
        Dt0 dt = lg_0.k;
        this.nb0 = dt;
        if (dt == null) {
            throw new IllegalStateException("Gdx.app not available.");
        }
    }

    public final void ky0() {
        _finally v1 = this.RB;
        if (v1 != null) {
            synchronized (v1) {
                synchronized (this) {
                    this.bM0 = 0L;
                    this.RB = null;
                    v1.OA.sj0(this, true);
                }
            }
        } else {
            synchronized (this) {
                this.bM0 = 0L;
                this.RB = null;
            }
        }
    }

    public final synchronized long LW() {
        return this.bM0;
    }
}
