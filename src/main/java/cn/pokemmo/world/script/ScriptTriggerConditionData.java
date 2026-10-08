package cn.pokemmo.world.script;

import f.*;

public class ScriptTriggerConditionData {
    public final vk0_1 M60;
    public final byte mE0;
    public final Wx0 Pi0;
    public final mc0_1 je;
    public final int IP;
    public String TA;
    public ia0_1 FX;
    public ia0_1 yw;
    public final String k1;
    public final String aq;
    public final String XS;

    public ScriptTriggerConditionData(short id, byte category, Wx0 type, mc0_1 item) {
        this.TA = null;
        vk0_1 value = ec0_2.Sx().SX(id);
        this.M60 = value;
        this.mE0 = category;
        this.Pi0 = type;
        this.je = item;
        String prefix = value.Mk() == 0 ? "-" : Integer.toString(value.Mk());
        this.k1 = prefix;
        this.aq = Integer.toString(value.N1());
        byte form = value.zp0();
        String suffix = form == 0 || form == 101 ? "100" : Integer.toString(form);
        this.XS = suffix;
        int index = 0;
        if (item != null && item.nI()) {
            try {
                index = Integer.parseInt(item.getName().replaceAll("\\D+", ""));
            } catch (NumberFormatException ignored) {
                index = 0;
            }
        }
        this.IP = index;
    }

    public final String JJ() {
        return sm0_0.c0(this.M60.bt);
    }

    public final int D() {
        if (this.je != null) {
            if (this.je.nI()) {
                return this.IP + 1001;
            }
            return 1000;
        }
        if (this.Pi0 == null) {
            return -3;
        }
        switch (this.Pi0.ordinal()) {
            case 0: return 4000;
            case 1: return 2000;
            case 2: return 6000;
            case 3: return 3000;
            case 4: return 1002;
            case 5: return 5000;
            case 6: return -4;
            default: return 1000;
        }
    }

    public final int Dq() {
        byte value = this.M60.mt0;
        return value == 0 || value == 101 ? 100 : value;
    }
}
