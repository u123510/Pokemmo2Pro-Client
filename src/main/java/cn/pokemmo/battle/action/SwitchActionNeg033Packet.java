package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchActionNeg033Packet extends Nt implements eb0_0 {
    public final byte oa;
    public final String xy;

    public SwitchActionNeg033Packet(byte type) {
        super();
        this.oa = type;
        this.xy = "";
        if (!this.ZJ()) {
            this.V5();
            return;
        }
        throw new IllegalArgumentException();
    }

    public SwitchActionNeg033Packet(byte type, String value) {
        super();
        this.oa = type;
        this.xy = value;
        if (this.ZJ()) {
            this.V5();
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final byte BL0() {
        return (byte) -33;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 ui, qn_1 callback) {
        switch (this.oa) {
            case 0:
                ui.I1(sm0_0.wa0(16780708, second.A60()), "", null);
                ui.lZ.add(new kw_0(new C00(second)));
                return;
            case 1:
                ui.wJ(sm0_0.c0(5957), "", null);
                return;
            case 2:
                ui.wJ(sm0_0.wa0(5958, second.A60()), "", null);
                return;
            case 3:
            case 4:
            case 5:
                String[] parts = new String[] { this.xy, this.Po0(), second.A60() };
                ui.I1(sm0_0.Bx(200532, parts), "", null);
                ui.lZ.add(new kw_0(new id0_2(first).vv(second)));
                return;
            default:
                return;
        }
    }

    @Override
    public final boolean Hm() {
        return this.oa != 1;
    }

    public final boolean ZJ() {
        return this.oa == 3 || this.oa == 4 || this.oa == 5;
    }

    public final String Po0() {
        switch (this.oa) {
            case 3:
                return sm0_0.c0(101734);
            case 4:
                return sm0_0.c0(101736);
            case 5:
                return sm0_0.c0(101738);
            default:
                return "";
        }
    }
}
