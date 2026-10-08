package cn.pokemmo.ui.twl.core;

import f.zk0_1;

/**
 * 界面定时器 (Timer)
 */
public class TwlTimer {
    public final zk0_1 vo;
    public int Ln;
    public int Ig0 = 10;
    public boolean ad0;
    public Runnable bm0;

    public TwlTimer(zk0_1 gui) {
        this.vo = gui;
    }

    public zk0_1 getGui() {
        return this.vo;
    }

    public int getDelay() {
        return this.Ig0;
    }

    public void setDelay(int delay) {
        if (delay >= 1) {
            this.Ig0 = delay;
            return;
        }
        throw new IllegalArgumentException("delay < 1");
    }

    public void start() {
        int n = this.Ln;
        if (n == 0) {
            this.Ln = this.Ig0;
            this.vo.GG0.add(this);
        } else if (n < 0) {
            this.Ln = -2;
        }
    }

    public void stop() {
        int n = this.Ln;
        if (n > 0) {
            this.Ln = 0;
            this.vo.GG0.remove(this);
        } else if (n < 0) {
            this.Ln = -3;
        }
    }

    public boolean isRunning() {
        return this.Ln > 0;
    }

    public boolean isContinuous() {
        return this.ad0;
    }

    public void setContinuous(boolean continuous) {
        this.ad0 = continuous;
    }

    public Runnable getCallback() {
        return this.bm0;
    }

    public void setCallback(Runnable callback) {
        this.bm0 = callback;
    }

    public final void Mu(int n) {
        setDelay(n);
    }

    public final void Gi0() {
        start();
    }

    public final void wg0() {
        stop();
    }
}
