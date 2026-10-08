package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;
import java.util.Collections;

public class BattleWeatherDisplayTask extends N60 {
    public final ML0 Al;
    public final Ku0 Tq0;

    public BattleWeatherDisplayTask(Ku0 ku0, ML0 ml0) {
        this.Tq0 = ku0;
        this.Al = ml0;
    }

    @Override
    public final void ii() {
        if (!(this.Al instanceof L5)) {
            return;
        }
        L5 l5 = (L5) this.Al;
        short[][] arrs = this.Tq0.oN;
        int count = arrs.length;
        jq_1[] arrjq1 = new jq_1[count];
        for (byte b = 0; b < arrs.length && b < l5.V6.length; b++) {
            int statSum = 0;
            int stat0 = arrs[b][0];
            for (int i = 1; i < 6; i++) {
                statSum += arrs[b][i];
            }
            int iv = (int) Math.ceil((float) stat0 / 51.0f);
            int ev = (int) Math.ceil((float) statSum / 80.0f);
            arrjq1[b] = new jq_1(b, arrs[b][6], iv + ev);
            el_2 el2 = l5.V6[b];
            el2.n70 = iv;
            el2.jg = ev;
        }
        Collections.sort(Arrays.asList(arrjq1));
        int maxEG = 0;
        for (byte b = 0; b < count; b++) {
            jq_1 jq1 = arrjq1[b];
            l5.V6[jq1.v9].Z60.Nk(new Wr[]{ji0_0.Hg.PZ[b]});
            if (b == 0) {
                maxEG = jq1.EG;
                l5.YE0 = jq1.v9;
            }
        }
        float speed = 1.0f / (float) maxEG;
        l5.O9.Ll(false);
        l5.Xt0.Ll(false);
        l5.Fd0.Ll(false);
        l5.XC.Ll(false);
        l5.Zo();
        l5.ZZ = true;
        l5.S8.Ll(true);
        cn_0 s8 = l5.S8;
        s8.z70 = new N1(new t5_0(s8), gn_0.TRANSPARENT);
        for (int i = 0; i < 4; i++) {
            l5.rJ[i].Ns(false);
            l5.V6[i].Ll(true);
            el_2 el2 = l5.V6[i];
            el2.WD0 = speed;
            el2.PF0 = 0;
            el2.ud0 = 0;
            el2.eB.aE(0.0f);
            el2.mt = hk0_1.KG;
        }
        l5.Bu = 0;
        l5.i7 = hk0_1.KG;
        tw0_0.RE0.Eh((byte) 1, (short) 446, true, false);
    }

    @Override
    public final boolean lPt1() {
        if (!(this.Al instanceof L5)) {
            return true;
        }
        L5 l5 = (L5) this.Al;
        return l5.Bu == 3 && hk0_1.KG - l5.i7 > 10000L;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}
