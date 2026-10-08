package cn.pokemmo.graphics.animation;

import f.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 现代化重构类 - 原始类: f.Oz0
 */
public abstract class ModelAnimationResource implements fy0_0 {

    public final a10_0 NF0;
    public final ML0 N10;
    public boolean WT;
    public MU aY;
    public final ConcurrentHashMap OC0;
    public ca_2 OE;
    public b30_0 pz0;
    public final ql_0 QK;
    public final ql_0 FZ;
    public PC0 C5;
    public hl0_1 To0;
    public d3 tz0;

    public ModelAnimationResource(ML0 model, a10_0 data) {
        this.WT = false;
        this.OC0 = new ConcurrentHashMap();
        this.OE = ca_2.mV;
        this.QK = new ql_0();
        this.FZ = new ql_0();
        this.tz0 = null;
        this.NF0 = data;
        this.N10 = model;
        this.nI0();
    }

    public static void o90(PF[] values) {
        int delay = 0;
        wx_2 keys = new wx_2();
        byte index = 0;
        while (index < values.length) {
            PF value = values[index];
            if (value != null && !value.zi0.hf0() && !keys.bL0(value.p10())) {
                keys.TI0(value.p10());
                int scheduledDelay = delay;
                lpt5__5.hL.ZD(value::xG0, scheduledDelay);
                delay = di0_0.Ks(value.p10()) + 150 + delay;
            }
            index = (byte) (index + 1);
        }
    }

    public void nI0() {
        this.To0 = new hl0_1(1000, new qd0_0().mF0);
        this.aQ();
    }

    public abstract void update();

    public abstract void bL0();

    public abstract void aQ();

    public final void tI0() {
        if (this.NF0 == null) {
            return;
        }
        StringBuilder text = new StringBuilder();
        if (this.NF0.S0 > 0) {
            String value = new StringBuilder("\n  ")
                    .append(this.NF0.S0)
                    .toString();
            text.append(sm0_0.wa0(5015, value));
            tw0_0.rl.jC(
                    sm0_0.wa0(5015, new StringBuilder().append(this.NF0.S0).append("").toString()),
                    zo_0.n4);
        }
        N2[] names = this.NF0.Zj;
        if (names.length != 0 && (names.length != 4 || this.NF0.m40)) {
            String value = "";
            for (N2 name : names) {
                if (value.length() > 0) {
                    value = value.concat(", ");
                }
                value = new StringBuilder(value)
                        .append(sm0_0.c0(name.R5))
                        .toString();
            }
            if (text.length() > 0) {
                text.append("\n");
            }
            text.append(sm0_0.wa0(5014, new StringBuilder("\n  ").append(value).toString()));
            tw0_0.rl.jC(sm0_0.wa0(5014, value), zo_0.n4);
        }
        if (this.NF0.hl.length > 0) {
            StringBuilder value = new StringBuilder();
            for (lq0 entry : this.NF0.hl) {
                if (value.length() > 0) {
                    value.append(", ");
                }
                value.append(entry.R3());
            }
            if (text.length() > 0) {
                text.append("\n");
            }
            text.append(sm0_0.wa0(5011, new StringBuilder("\n  ").append(value).toString()));
            tw0_0.rl.jC(sm0_0.wa0(5011, value.toString()), zo_0.n4);
        }
        if (this.NF0.p10 != null && this.NF0.p10.k10) {
            tw0_0.rl.jC(sm0_0.c0(5509), zo_0.n4);
        }
        if (text.length() > 0) {
            String value = text.toString();
            if (this.N10.zJ == null) {
                if (tw0_0.kz0()) {
                    this.N10.zJ = new qj_2("", 56, 56);
                } else {
                    this.N10.zJ = new qj_2("", 16, 16);
                }
                this.N10.zJ.uf("tooltip-button2");
                this.N10.zJ.GH0 = 0;
                this.N10.F9(this.N10.zJ.fU(), this.N10.zJ);
            }
            this.N10.zJ.yj0 = value;
            this.N10.zJ.yB0();
        }
    }

    public void R9(byte value, float amount, byte active) {
    }

    public void ph() {
    }

    public void Ow0() {
    }

    public void fM(d70_0 value) {
    }

    public void Z8(byte value, short amount) {
    }

    public void tt(byte value, short amount) {
    }

    public void dispose() {
        if (this.tz0 != null) {
            this.tz0.dispose();
        }
        this.To0.dispose();
        byte outer = 0;
        while (outer < this.NF0.wI0.length) {
            this.NF0.mn(outer).dispose();
            byte inner = 0;
            while (inner < this.NF0.wI0[outer].length) {
                PF value = this.NF0.Ce(outer, inner);
                if (value != null) {
                    value.c20();
                }
                inner = (byte) (inner + 1);
            }
            outer = (byte) (outer + 1);
        }
    }

    public void JM(boolean first, boolean second) {
    }
}
