package cn.pokemmo.ui.widget.table.model;

import f.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.table.model.BaseTableModel;

import java.text.NumberFormat;

public class ItemBagTableModel extends BaseTableModel {
    public static final OJ[] H9 = new OJ[0];
    public static final String[] instanceof$ = {
            sm0_0.c0(7901), sm0_0.c0(7902), sm0_0.c0(7903),
            sm0_0.c0(7904), sm0_0.c0(7905)
    };
    public OJ[] Dx0;

    public ItemBagTableModel() {
        this.Dx0 = H9;
    }

    public final int oK0() {
        return this.Dx0.length;
    }

    public final int Zy() {
        return instanceof$.length;
    }

    public final String LPT7(int index) {
        return instanceof$[index];
    }

    public final Object RG0(int index, int kind) {
        OJ value = this.Dx0[index];
        boolean enabled = false;
        int requirement = value.qE;
        if (requirement != 0 && sm0_0.cU.l90(requirement)) {
            BR client = tw0_0.rl;
            tu_0 type = value.u;
            if (type != tu_0.M4) {
                jx_2 entry = (jx_2) com9__2.Om.go.get(type);
                if (entry != null && entry.Be()) {
                    cq0_0 state = client.oY;
                    int code = value.CQ;
                    cq0_0.w0((short) code);
                    enabled = state.lY.kp((short) code);
                }
            } else {
                enabled = client.yh0.Ny(value.Q80, value.CQ);
            }
        }
        if (kind == 0) {
            return sm0_0.c0(value.zD0 + 250000);
        }
        if (kind == 1) {
            if (!enabled) return "???";
            int count = value.Ef0();
            if (count < 1) return sm0_0.c0(7910);
            return tx_1.HU(count, 1);
        }
        if (kind == 2) {
            if (!enabled) return "???";
            int amount = value.zg0();
            if (amount >= 100) return String.valueOf(amount);
            return amount + "+";
        }
        if (kind == 3) {
            if (!enabled) return "???";
            return value.ZX();
        }
        if (kind == 4) {
            if (!enabled) return "???";
            return sm0_0.wa0(7911, NumberFormat.getInstance().format((long) value.uY));
        }
        return "";
    }

    public final Object fh0(int index, int kind) {
        return "";
    }
}
