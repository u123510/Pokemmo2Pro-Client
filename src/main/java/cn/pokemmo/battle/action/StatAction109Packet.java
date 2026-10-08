package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction109Packet extends Nt implements eb0_0 {
    public final short m9;
    public final byte Bv;
    public final String lPT9;
    public final short lpt4;
    public final byte R80;
    public final byte AU;
    public final byte lA0;

    public StatAction109Packet(short mode, byte type, String name, short amount, byte flag1, byte flag2, byte slot) {
        this.m9 = mode;
        this.Bv = type;
        this.lPT9 = name;
        this.lpt4 = amount;
        this.R80 = flag1;
        this.AU = flag2;
        this.lA0 = slot;
    }

    public final byte BL0() {
        return 109;
    }

    public final void IE0(PF first, PF second, boolean value1, boolean value2, short value3,
            boolean value4, ML0 layout, qn_1 unused) {
        if (tw0_0.PK0 == null) {
            return;
        }
        tb0_1 target = second.r10;
        se_0 state = target.B3;
        state.Bn.Yb0 = this.m9;
        state.ZE0 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(state.Bn.Yb0));
        CE entry = state.Bn;
        entry.wj = this.Bv;
        entry.kX = this.lPT9;
        entry.n7(this.lpt4);
        state.D4 = this.R80;
        state.nF0 = this.AU;
        int slot = this.lA0;
        if (slot < 0 || slot > 24) {
            slot = 3;
        }
        entry.QQ = (byte) slot;
        target.Wb();

        second.rm0 = 0;
        second.VZ = 0;
        second.s10 = "";
        second.Mu0 = false;
        second.U1 = false;
        second.ZR = (byte) -128;
        second.c10 = (byte) -1;
        second.h60 = (byte) -1;
        second.Z10 = null;
        second.r10.Wb();

        String[] args = { second.A60() };
        int id = layout.yd0.QX(478, second);
        String message = sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, id, args);
        layout.wJ(message, "", null);
        second.wb0(second.cD0 == tw0_0.PK0.Ez0());
        second.ZI(second.COm2(), true);
        second.nm0();
    }
}
