package cn.pokemmo.graphics.animation;

import f.*;
import java.lang.reflect.Array;

public class SteppedKeyframeInterpolator {
    public Object[] p10;
    public float VK;
    public int sq0;
    public float WI;
    public OI0 kK0;

    public SteppedKeyframeInterpolator(float step, es_1 values) {
        this.VK = step;
        this.kK0 = OI0.DC;
        Object[] result = (Object[])Array.newInstance(values.rZ.getClass().getComponentType(), values.KB);
        for (int index = 0; index < values.KB; index++) {
            result[index] = values.get(index);
        }
        this.aw0(result);
    }

    public SteppedKeyframeInterpolator(float step, es_1 values, OI0 mode) {
        this(step, values);
        this.XB(mode);
    }

    public SteppedKeyframeInterpolator(float step, Object... values) {
        this.VK = step;
        this.kK0 = OI0.DC;
        this.aw0(values);
    }

    public final Object Jy(float elapsed, boolean advance) {
        OI0 previous = this.kK0;
        if (advance) {
            if (previous == OI0.DC) {
                this.kK0 = OI0.MW;
            } else if (previous == OI0.PRN) {
                this.kK0 = OI0.vC0;
            }
        } else if (previous != OI0.DC && previous != OI0.PRN) {
            this.kK0 = previous == OI0.vC0 ? OI0.PRN : OI0.MW;
        }
        Object result = this.hE0(elapsed);
        this.kK0 = previous;
        return result;
    }

    public final Object hE0(float elapsed) {
        int index;
        if (this.p10.length == 1) {
            index = 0;
        } else {
            int raw = (int)(elapsed / this.VK);
            switch (this.kK0) {
                case DC:
                    index = Math.min(this.p10.length - 1, raw);
                    break;
                case MW:
                    index = raw % this.p10.length;
                    break;
                case Mf0:
                    index = raw % (this.p10.length * 2 - 2);
                    index = index < this.p10.length ? index : this.p10.length * 2 - 2 - index;
                    break;
                case RI:
                    if ((int)(this.WI / this.VK) == raw) {
                        index = this.sq0;
                    } else {
                        index = (int)(LW.Yu.nextLong(this.p10.length));
                    }
                    break;
                case PRN:
                    index = Math.max(this.p10.length - raw - 1, 0);
                    break;
                case vC0:
                    index = raw % this.p10.length;
                    index = this.p10.length - 1 - index;
                    break;
                default:
                    index = raw;
                    break;
            }
            this.sq0 = index;
            this.WI = elapsed;
        }
        return this.p10[index];
    }

    public final void aw0(Object... values) {
        this.p10 = values;
    }

    public final void XB(OI0 mode) {
        this.kK0 = mode;
    }

    public final boolean d40(float elapsed) {
        return (int)(elapsed / this.VK) < this.p10.length - 1;
    }
}
