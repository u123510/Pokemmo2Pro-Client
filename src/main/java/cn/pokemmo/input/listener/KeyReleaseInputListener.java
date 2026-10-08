package cn.pokemmo.input.listener;

import f.*;

public class KeyReleaseInputListener implements tx_2 {
    public lt_2[] pE0;
    public boolean BB;
    public int Zk0;
    public lt_2 bi;
    public lt_2 br0;
    public lt_2 r10;

    public KeyReleaseInputListener() {
    }

    public KeyReleaseInputListener(lt_2[] values, boolean cyclic) {
        this.o8(values, cyclic);
    }

    public final void o8(lt_2[] values, boolean cyclic) {
        if (this.bi == null) {
            this.bi = values[0].f10();
        }
        if (this.br0 == null) {
            this.br0 = values[0].f10();
        }
        if (this.r10 == null) {
            this.r10 = values[0].f10();
        }
        this.pE0 = values;
        this.BB = cyclic;
        this.Zk0 = cyclic ? values.length : values.length - 3;
    }

    public final lt_2 HB0(lt_2 value, float t) {
        float scaled = t * (float) this.Zk0;
        int index = t >= 1.0f ? this.Zk0 - 1 : (int) scaled;
        float fraction = scaled - (float) index;
        boolean cyclic = this.BB;
        if (!cyclic) {
            index++;
        }
        lt_2[] values = this.pE0;
        int length = values.length;
        float a = fraction * fraction;
        float b = fraction * a;
        ((C8) value).np((C8) values[index]);
        ((C8) value).Fg0(1.0f + 1.5f * b - 2.5f * a);
        if (cyclic || index > 0) {
            lt_2 prev = this.bi.lY(values[(index + length - 1) % length]).G7(-0.5f * b + a - 0.5f * fraction);
            ((C8) value).Xg0(prev);
        }
        if (cyclic || index < length - 1) {
            lt_2 next = this.bi.lY(values[(index + 1) % length]).G7(0.5f * fraction + 2.0f * a - 1.5f * b);
            ((C8) value).Xg0(next);
        }
        if (cyclic || index < length - 2) {
            lt_2 nextNext = this.bi.lY(values[(index + 2) % length]).G7(0.5f * b - 0.5f * a);
            ((C8) value).Xg0(nextNext);
        }
        return value;
    }

    @Override
    public final lt_2 DA0(float t, C8 output) {
        return this.HB0(output, t);
    }
}
