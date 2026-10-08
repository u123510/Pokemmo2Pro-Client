package cn.pokemmo.battle;

import f.*;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * 现代化重构类 - 原始混淆类: f.OI
 */
public abstract class Modern_Battle_OI {

    public final kd_1 AA;
    public int sH;
    public int gH0;

    public Modern_Battle_OI(kd_1 value) {
        super();
        this.AA = value;
        this.sH = value.size();
        this.gH0 = value.uT();
    }

    public final boolean hasNext() {
        if (this.sH != this.AA.Rv) {
            throw new ConcurrentModificationException();
        }

        byte[] values = this.AA.Ut;
        int index = this.gH0;
        while (true) {
            int previous = index;
            index--;
            if (previous <= 0 || values[index] == 1) {
                break;
            }
        }
        return index >= 0;
    }

    public void remove() {
        if (this.sH != this.AA.Rv) {
            throw new ConcurrentModificationException();
        }

        try {
            this.AA.o00 = true;
            this.AA.dx0(this.gH0);
        } finally {
            this.AA.o00 = false;
        }
        this.sH--;
    }

    public final void aA() {
        if (this.sH != this.AA.Rv) {
            throw new ConcurrentModificationException();
        }

        byte[] values = this.AA.Ut;
        int index = this.gH0;
        while (true) {
            int previous = index;
            index--;
            if (previous <= 0 || values[index] == 1) {
                break;
            }
        }
        this.gH0 = index;
        if (index < 0) {
            throw new NoSuchElementException();
        }
    }
}

