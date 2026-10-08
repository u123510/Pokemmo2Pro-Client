package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackEn0 implements Runnable  {
    public final ok_1 ad;

    public TaskCallbackEn0(ok_1 owner) {
        super();
        this.ad = owner;
    }

    @Override
    public final void run() {
        ok_1 owner = this.ad;
        yi0_1 settings = owner.Ik;
        if (settings.N0 < 1) {
            return;
        }

        rz_0 selected = null;
        if (settings.Hw0) {
            byte selectedIndex = (byte) (owner.aF.mu0.Mw0 - 1);
            selected = (rz_0) rz_0.RM.BM(selectedIndex);
            if (selected == null) {
                tw0_0.rl.qK(sm0_0.c0(5618));
                return;
            }
        }

        byte secondaryIndex = -1;
        if (settings.yB) {
            secondaryIndex = (byte) (owner.Jv0.mu0.Mw0 - 1);
            if (secondaryIndex < 0) {
                tw0_0.rl.qK(sm0_0.c0(5623));
                return;
            }
        }

        wx_2 entries = new wx_2();
        if (settings.b50 > 0) {
            for (int i = 0; i < settings.b50; ++i) {
                vk0_1 entry = owner.cF0[owner.Kk0[i].mu0.Mw0];
                if (entry != null && entry.hC0 >= 1 && !entries.bL0(entry.hC0)) {
                    entries.TI0(entry.hC0);
                }
            }
        }
        if (entries.Rv != settings.b50) {
            tw0_0.rl.qK(sm0_0.wa0(5619, Integer.toString(settings.b50)));
            return;
        }

        mv_1 types = new mv_1();
        if (settings.gR > 0) {
            for (gc_2 type : gc_2.ME) {
                if (!type.j8 && owner.Da0[type.CoM2].ER.U20()) {
                    types.Is0((byte) owner.Bx0[type.CoM2].eB0, type);
                }
            }
        }
        if (types.Rv != settings.gR) {
            tw0_0.rl.qK(sm0_0.wa0(5620, Integer.toString(settings.gR)));
            return;
        }

        short[] entryIds = entries.Eo();
        gc_2[] typeArray = (gc_2[]) types.Fy(new gc_2[types.Rv]);
        byte[] values = new byte[types.Rv];
        byte[] storedValues = types.ZA0;
        Object[] storedTypes = types.Yw;
        int output = 0;
        for (int slot = storedTypes.length - 1; slot >= 0; --slot) {
            Object type = storedTypes[slot];
            if (type != iw_2.VW && type != iw_2.J80) {
                values[output++] = storedValues[slot];
            }
        }

        fb0_1 payload = new fb0_1(selected, secondaryIndex, entryIds, typeArray, values);
        BR client = tw0_0.rl;
        o60_0 target = owner.i30;
        CH0 character = target.Uv0;
        byte slot = target.sA;
        short group = owner.dF.Dw.GM;
        client.fk0.uQ(new E30(character, slot, payload, group, (byte) 0));
        owner.xe0();
    }
}
