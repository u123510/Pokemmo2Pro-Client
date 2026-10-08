package cn.pokemmo.ui.twl.renderer;

import f.KG0;
import f.MD0;
import f.gg_0;
import f.rb_1;
import f.zk0_1;

/**
 * 界面动画状态机实现 (AnimationState)
 */
public class TwlAnimationState implements rb_1 {
    public final KG0 O80;
    public gg_0[] OX;
    public zk0_1 A40;

    public TwlAnimationState(KG0 parent, int initialCapacity) {
        this.O80 = parent;
        this.OX = new gg_0[initialCapacity];
    }

    public TwlAnimationState(KG0 parent) {
        this(parent, 16);
    }

    public void setGUI(zk0_1 gui) {
        this.A40 = gui;
        long time = this.getCurrentTime();
        gg_0[] arr = this.OX;
        if (arr != null) {
            for (gg_0 entry : arr) {
                if (entry != null) {
                    entry.Zs = time;
                }
            }
        }
    }

    public final void W20(zk0_1 gui) {
        setGUI(gui);
    }

    @Override
    public int Bd(MD0 key) {
        int id = key.d1;
        gg_0 entry = (id < this.OX.length) ? this.OX[id] : null;
        if (entry != null) {
            long diff = this.getCurrentTime() - entry.Zs;
            return (int) Math.min(Integer.MAX_VALUE, diff);
        } else {
            KG0 parent = this.O80;
            return parent != null ? parent.Bd(key) : (int) this.getCurrentTime() & Integer.MAX_VALUE;
        }
    }

    @Override
    public boolean t5(MD0 key) {
        int id = key.d1;
        gg_0 entry = (id < this.OX.length) ? this.OX[id] : null;
        if (entry != null) {
            return entry.Ib;
        }
        KG0 parent = this.O80;
        return parent != null && parent.t5(key);
    }

    @Override
    public boolean tI0(MD0 key) {
        int id = key.d1;
        gg_0 entry = (id < this.OX.length) ? this.OX[id] : null;
        if (entry != null) {
            return entry.Eh;
        }
        KG0 parent = this.O80;
        return parent != null && parent.tI0(key);
    }

    public void setAnimationState(MD0 key, boolean active) {
        gg_0 entry = this.getOrCreateEntry(key);
        if (entry.Ib != active) {
            entry.Ib = active;
            entry.Zs = this.getCurrentTime();
            entry.Eh = true;
        }
    }

    public final void j70(MD0 key, boolean active) {
        setAnimationState(key, active);
    }

    public void resetAnimationTime(MD0 key) {
        gg_0 entry = this.getOrCreateEntry(key);
        entry.Zs = this.getCurrentTime();
        entry.Eh = true;
    }

    public final void Mk(MD0 key) {
        resetAnimationTime(key);
    }

    public gg_0 getOrCreateEntry(MD0 key) {
        int id = key.d1;
        gg_0[] arr = this.OX;
        if (id < arr.length && arr[id] != null) {
            return arr[id];
        }

        if (id >= arr.length) {
            gg_0[] newArr = new gg_0[id + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            this.OX = newArr;
        }

        gg_0 created = new gg_0();
        created.Zs = this.getCurrentTime();
        this.OX[id] = created;
        return created;
    }

    public final gg_0 Ye0(MD0 key) {
        return getOrCreateEntry(key);
    }

    public long getCurrentTime() {
        zk0_1 gui = this.A40;
        return gui != null ? gui.ss0 : 0L;
    }

    public final long sf() {
        return getCurrentTime();
    }
}
