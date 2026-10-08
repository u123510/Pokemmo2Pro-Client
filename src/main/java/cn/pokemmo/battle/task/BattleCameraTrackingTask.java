package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleCameraTrackingTask extends N60 {
    public final ML0 eg0;
    public final boolean MC;
    public final lu0_0 Lpt6;

    public BattleCameraTrackingTask(lu0_0 source, ML0 model, boolean rotate) {
        super();
        this.Lpt6 = source;
        this.eg0 = model;
        this.MC = rotate;
    }

    @Override
    public final void ii() {
        ML0 model = this.eg0;
        int side = this.Lpt6.Fm;
        boolean rotate = this.MC;
        a10_0 state = model.yd0;
        if (rotate) {
            PF[] row = state.wI0[side];
            PF first = row[0];
            System.arraycopy(row, 0, row, 1, row.length - 1);
            row[row.length - 1] = first;
        } else {
            PF[] row = state.wI0[side];
            int lastIndex = row.length - 1;
            PF last = row[lastIndex];
            System.arraycopy(row, 1, row, 0, lastIndex);
            row[0] = last;
        }
        PF[] row = state.wI0[side];
        for (int i = 0; i < row.length; i++) {
            PF value = row[i];
            if (value != null) {
                value.Kj0 = (byte) i;
                value.lPT2();
            }
        }
        Oz0 overlay = tw0_0.LD0.he0;
        if (overlay != null) {
            overlay.JM(side == state.Ez0(), rotate);
        }
        model.X60(false);
        row = model.yd0.wI0[side];
        for (int i = 0; i < row.length; i++) {
            jd0_1 slot = model.Tb0[side][(byte) i];
            PF value = row[i];
            if (value != null && !value.zi0.hf0()) {
                slot.Hm(true);
                slot.z2(value);
            } else {
                slot.Hm(false);
            }
        }
    }

    @Override
    public final boolean lPt1() {
        return true;
    }

    @Override
    public final NU gJ0() {
        return NU.Yt;
    }
}
