package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class AcroBikeTileBehavior extends BaseTileBehavior {
    public final byte VG0;
    public final byte pQ;
    public final nk_0[] Ki;
    public boolean a4;
    public nk_0 m7;

    public AcroBikeTileBehavior(byte mode, byte type, nk_0... keys) {
        this.a4 = false;
        this.VG0 = mode;
        this.pQ = type;
        this.Ki = keys;
    }

    public final AcroBikeTileBehavior Con() { this.a4 = true; return this; }
    public final AcroBikeTileBehavior an0(nk_0 value) { this.m7 = value; return this; }

    @Override
    public final boolean fu(LT move, bi0_1 actor, byte kind) {
        if (this.VG0 != 0) return false;
        if (this.pQ != -1 && kind != this.pQ) return false;
        if (this.a4) {
            F90 table = move.F2().Xg0();
            if (table == null) return false;
            if (table.Ub0(move.Tz(), move.HR()) == null) return false;
        }
        return actor.il0.Zw(move, false, this.Ki);
    }

    @Override
    public final boolean aH(LT move, bi0_1 actor, byte kind, byte unused) {
        if (this.VG0 != 1 && !((Object) this instanceof xm_2)) return false;
        if (this.pQ >= 0 && kind != this.pQ) return false;
        if (this.a4) {
            F90 table = move.F2().Xg0();
            if (table == null) return false;
            if (table.Ub0(move.Tz(), move.HR()) == null) return true;
        }
        nk_0[] keys = this.Ki;
        if (keys != null && keys.length > 0) {
            nk_0 first = keys[0];
            if (first == nk_0.d5 || first == nk_0.Jo0 || first == nk_0.w) {
                if (kind == 3) keys = new nk_0[]{nk_0.Jo0, nk_0.Jo0};
                else keys = new nk_0[]{nk_0.w};
            }
        } else {
            nk_0 key = kind == 0 ? nk_0.t20 : kind == 1 ? nk_0.cOM9 : kind == 3 ? nk_0.lpT8 : nk_0.pM;
            keys = new nk_0[]{key};
        }
        return actor.il0.Zw(move, false, keys);
    }

    @Override
    public final nk_0 new$() { return this.m7; }
}
