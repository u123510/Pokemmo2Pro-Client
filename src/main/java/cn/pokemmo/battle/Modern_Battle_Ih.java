package cn.pokemmo.battle;

import f.*;
import java.lang.reflect.Array;

/**
 * 现代化重构类 - 原始混淆类: f.IH
 */
public class Modern_Battle_Ih extends ht_0 {

    public final SQ hj0;

    public Modern_Battle_Ih() {
        this.hj0 = new SQ();
    }

    @Override
    public final Wr li0(int n) {
        return (Wr) this.hj0.get(n);
    }

    @Override
    public final boolean XC(int n) {
        return this.hj0.l90(n);
    }

    @Override
    public final Wr[] z4() {
        SQ map = this.hj0;
        Wr[] out = new Wr[0];
        if (map.Rv > 0) {
            out = (Wr[]) Array.newInstance(Wr.class, map.Rv);
        }
        Object[] values = map.td;
        byte[] states = map.Ut;
        int i = states.length;
        int count = 0;
        while (true) {
            i--;
            if (i <= 0) {
                break;
            }
            if (states[i] != 1) {
                continue;
            }
            out[count++] = (Wr) values[i];
        }
        return out;
    }

    @Override
    public final byte Lx0() {
        return 0;
    }

    public final void gG0(byte by, Wr wr) {
        SQ map = this.hj0;
        map.j10(map.yw0(by), wr);
    }
}

