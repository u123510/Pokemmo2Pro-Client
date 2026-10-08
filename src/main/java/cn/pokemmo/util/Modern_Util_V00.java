package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.V00
 */
public class Modern_Util_V00 {

    public final O8 Dt;
    public final kt_2 Ok;
    public final PF kG0;
    public final short jl;

    public Modern_Util_V00(O8 source, byte slot, kt_2 type, PF entity, short value) {
        if (!(source instanceof Jh)) {
            throw new IllegalArgumentException();
        }
        this.Dt = source.Sf(slot);
        this.Ok = type;
        this.kG0 = entity;
        this.jl = value;
    }

    public final String toString() {
        String name = this.Dt.zn();
        switch (this.Ok.iy) {
            case 12:
                return "";
            case 3:
            case 13:
                return sm0_0.wa0(5069, name);
            case 4:
            case 10:
            case 16:
                return sm0_0.wa0(5068, name);
            case 2:
                se_0 marker = this.Dt.L00[this.jl % this.Dt.qc].B3;
                if (marker != null) {
                    return sm0_0.Bx(5067, new String[]{name, sm0_0.c0(marker.Bn.Yb0 + 150000)});
                }
                return sm0_0.Bx(5067, new String[]{name, ""});
            case 1:
                mc0_1 creature = gu0.l2.lPT6(this.jl);
                return sm0_0.Bx(5066, new String[]{name, sm0_0.c0(creature.Nl), this.kG0 == null ? "" : this.kG0.nz0(false)});
            case 0:
                vk0_1 item = (vk0_1) ec0_2.Sx().f4.f5(this.jl);
                return sm0_0.Bx(5065, new String[]{name, this.kG0 == null ? "" : this.kG0.nz0(false), item == null ? "" : sm0_0.c0(item.bt)});
            default:
                return this.Ok.Dg0 + " " + this.jl;
        }
    }
}

