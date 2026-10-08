package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SwitchActionNeg038Packet extends Nt implements eb0_0 {
    public final byte Lc0;
    public final byte n40;

    public SwitchActionNeg038Packet(byte kind, byte value) {
        super();
        this.Lc0 = kind;
        this.n40 = value;
    }

    @Override
    public final byte BL0() {
        return (byte) -38;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2,
                          short value, boolean flag3, ML0 model, qn_1 callback) {
        switch (this.Lc0) {
            case 0:
                model.wJ(sm0_0.Bx(200603,
                        new String[]{second.Yp(), Integer.toString(this.n40)}), "", null);
                return;
            case 1:
                model.wJ(sm0_0.Bx(200601,
                        new String[]{second.Yp(), Integer.toString(this.n40)}), "", null);
                return;
            case 2:
                model.wJ(sm0_0.Bx(200599,
                        new String[]{second.Yp(), first.Yp()}), "", null);
                return;
            case 3:
                tu0_0.mk(second, 200600, model, "", null);
                return;
            case 4:
                tu0_0.mk(second, 200602, model, "", null);
                return;
            default:
                return;
        }
    }
}
