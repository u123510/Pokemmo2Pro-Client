package cn.pokemmo.world.map;

import f.*;

public class MapWarpConnectionData {
    public final q10_0 SG;
    public final short ax;
    public final String AE;
    public final short El0;
    public final short[][] XD0;
    public final int Sf;
    public final z3_0[][] vf0;
    public k2[] yh0;

    public MapWarpConnectionData(q10_0 type, short id, String name, int flags, short[][] values, int rows) {
        super();
        short derivedId = (short) -1;
        this.SG = type;
        this.ax = id;
        this.AE = name;
        this.XD0 = values;
        this.Sf = flags & -8417;
        this.vf0 = new z3_0[rows][];
        for (int index = 0; index < rows; index++) {
            this.vf0[index] = new z3_0[3];
        }
        if (type != null && (!type.sB() || this.wk(4))) {
            derivedId = this.nW();
        }
        this.El0 = derivedId;
    }

    public final short nW() {
        q10_0 type = this.SG;
        if (type == q10_0.Bj0) {
            int value = this.ax;
            if (value > 255) {
                if (value < 496) {
                    return (short) (value - 4320);
                }
                throw new RuntimeException("Allocate new range");
            }
        }
        return (short) (type.iL * 256 + 2000 + this.ax);
    }

    public final short Y0() {
        return this.ax;
    }

    public final q10_0 ZD0() {
        return this.SG;
    }

    public final String HQ() {
        int id = this.SG.iL * 1000 + 20000 + (this.ax & 65535);
        if (!sm0_0.cU.l90(id)) {
            return this.AE;
        }
        return sm0_0.c0(id);
    }

    public final short KE0() {
        return this.El0;
    }

    public final boolean yt() {
        return (this.Sf & 16) != 0;
    }

    public final boolean wk(int mask) {
        return (this.Sf & mask) != 0;
    }

    public final z3_0 Yv(ew0_0 value) {
        return this.vf0[0][value.Bu0];
    }

    public final z3_0 Tz(ew0_0 value, boolean alternate, float amount) {
        k2 entry = this.yh0[alternate ? 1 : 0];
        p_0 provider = entry == null ? null : entry.nv;
        int index = 0;
        if (provider != null) {
            index = ((Byte) provider.Jy(amount, !alternate)).byteValue();
        }
        if (index != 0) {
            this.vf0[index][value.Bu0].Pu(true);
        }
        return this.vf0[index][value.Bu0];
    }
}
