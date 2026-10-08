package cn.pokemmo.battle.task;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleMoveAnimationTask extends N60 {
    public final MU super$;
    public final byte Ra;

    public BattleMoveAnimationTask(MU v1) {
        super();
        this.super$ = v1;
        this.Ra = 0;
    }

    public BattleMoveAnimationTask(byte i1, MU v2) {
        super();
        this.super$ = v2;
        this.Ra = i1;
    }

    public final boolean lPt1() {
        if (this.super$.bL()) {
            return true;
        }
        return false;
    }

    public final void ii() {
        byte b = this.Ra;
        if (b == 0) {
            tw0_0.LD0.he0.aY = this.super$.us();
        } else if (b == 1) {
            tw0_0.LD0.he0.aY = this.super$.o();
        } else if (b == 2) {
            tw0_0.LD0.he0.aY = this.super$.Kh();
        }
    }

    public final NU gJ0() {
        return NU.Yt;
    }
}
