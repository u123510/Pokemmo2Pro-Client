package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction098Packet extends Nt implements eb0_0 {
    public final byte vE;
    public final short Sl;

    public StatAction098Packet(byte type, short value) {
        super();
        if (!bo0(type) && value > 0) {
            throw new IllegalStateException("");
        }
        this.vE = type;
        this.Sl = value;
    }

    public static boolean bo0(byte type) {
        return type == 3 || type == 4;
    }

    @Override
    public final byte BL0() {
        return 98;
    }

    @Override
    public final void IE0(PF first, PF second, boolean flag1, boolean flag2, short value,
                          boolean flag3, ML0 ui, qn_1 callback) {
        switch (this.vE) {
            case 0:
                ui.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ui.yd0.QX(881, second),
                        new String[] { second.A60() }), "", null);
                second.G90 = true;
                return;
            case 1:
                ui.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ui.yd0.QX(887, second),
                        new String[] { second.A60() }), "", null);
                return;
            case 2:
                ui.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ui.yd0.QX(884, second),
                        new String[] { second.A60() }), "", null);
                second.G90 = false;
                return;
            case 3:
                ui.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, ui.yd0.QX(890, second),
                        new String[] { second.A60(), localizedValue() }), "", null);
                return;
            case 4:
                ui.wJ(sm0_0.Bx(200580, new String[] { second.Yp(), localizedValue() }), "", null);
                return;
            case 5:
                tu0_0.mk(second, 200581, ui, "", null);
                return;
            default:
                return;
        }
    }

    private String localizedValue() {
        vk0_1 value = (vk0_1) ec0_2.Sx().f4.f5(this.Sl);
        return sm0_0.c0(value.bt);
    }
}
