package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BattleStatStageModifier extends TC0 {
    public final short FU;
    public final Map mh0;
    public final a10_0 D10;

    public BattleStatStageModifier(a10_0 a10_0Var, short s, HashMap hashMap) {
        this.D10 = a10_0Var;
        this.FU = s;
        this.mh0 = hashMap;
    }

    @Override
    public final void QC(ML0 ml0) {
        this.D10.Pl0 = this.FU;
        tw0_0.lM.BO();
        Iterator it = this.D10.l2.entrySet().iterator();
        while (it.hasNext()) {
            bj0_2 bj0_2Var = (bj0_2) ((Map.Entry) it.next()).getValue();
            byte b = bj0_2Var.Cw0;
            if (b != 127) {
                bj0_2Var.Cw0 = (byte) (b - 1);
            }
        }
        for (O8 o8 : this.D10.eG) {
            ek_0 ek_0Var = o8.zI;
            byte b = ek_0Var.bB0;
            if (b > 0) {
                ek_0Var.bB0 = (byte) (b - 1);
            }
            byte b2 = ek_0Var.Wn0;
            if (b2 > 0 && b2 < 127) {
                ek_0Var.Wn0 = (byte) (b2 - 1);
            }
            byte b3 = ek_0Var.COm5;
            if (b3 > 0 && b3 < 127) {
                ek_0Var.COm5 = (byte) (b3 - 1);
            }
            byte b4 = ek_0Var.cU;
            if (b4 > 0 && b4 < 127) {
                ek_0Var.cU = (byte) (b4 - 1);
            }
            byte b5 = ek_0Var.kI0;
            if (b5 > 0) {
                ek_0Var.kI0 = (byte) (b5 - 1);
            }
            if (ek_0Var.Rz0 > 0) {
                ek_0Var.vD0++;
            }
            if (ek_0Var.fP > 0) {
                ek_0Var.id0++;
            }
            this.D10.p0(ml0, o8.ZG0);
        }
        Iterator it2 = this.mh0.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            b30_0 b30_0Var = (b30_0) entry.getKey();
            this.D10.getClass();
            PF pf = this.D10.Ce(b30_0Var.Pp0, b30_0Var.B6);
            if (pf != null) {
                pf.Iw0(((Byte) entry.getValue()).byteValue());
            }
        }
        if (this.FU > 1 && !this.D10.qQ.isEmpty()) {
            Iterator it3 = this.D10.qQ.entrySet().iterator();
            while (it3.hasNext()) {
                this.D10.N8((b30_0) ((Map.Entry) it3.next()).getKey(), null, (short) 0);
            }
            this.D10.qQ.clear();
        }
        zo_0 zo_0Var = zo_0.n4;
        tw0_0.rl.jC("", zo_0Var);
        tw0_0.rl.jC(sm0_0.yN(5075, new String[] { String.valueOf((int) this.FU) }), zo_0Var);
    }
}
