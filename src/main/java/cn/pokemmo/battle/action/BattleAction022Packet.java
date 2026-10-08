package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction022Packet extends Nt implements eb0_0 {
    public final byte Df;

    public BattleAction022Packet(byte value) {
        super();
        this.Df = value;
    }

    @Override
    public final byte BL0() {
        return 22;
    }

    @Override
    public final void IE0(PF first, PF second, boolean b1, boolean b2, short s, boolean b3, ML0 model, qn_1 queue) {
        byte kind = this.Df;
        if (kind == 1) {
            lpt6__2 mode = lpt6__2.Q80;
            int slot = model.yd0.QX(1007, second);
            String[] args = {second.A60(), sm0_0.c0(5230)};
            model.wJ(sm0_0.fg0((byte) 2, mode, 14, slot, args), "", null);
        } else if (kind == 2) {
            lpt6__2 mode = lpt6__2.Q80;
            int slot = model.yd0.QX(1007, second);
            String[] args = {second.A60(), sm0_0.c0(210005)};
            model.wJ(sm0_0.fg0((byte) 2, mode, 14, slot, args), "", null);
        } else if (kind == 3) {
            lpt6__2 mode = lpt6__2.Q80;
            int slot = model.yd0.QX(1007, second);
            String[] args = {second.A60(), sm0_0.c0(5275)};
            model.wJ(sm0_0.fg0((byte) 2, mode, 14, slot, args), "", null);
        } else {
            lpt6__2 mode = lpt6__2.Q80;
            int slot = model.yd0.QX(514, second);
            String[] args = {second.A60()};
            model.wJ(sm0_0.fg0((byte) 2, mode, 14, slot, args), "", null);
        }
    }
}
