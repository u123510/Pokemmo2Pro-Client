package cn.pokemmo.battle;

import f.*;

public class BattleCameraTargetPosition {
    public byte lf;
    public final le0_2 LZ;
    public final qd_2 H3;
    public final cn_0 e10;
    public final cn_0 TG;
    public final cn_0 na0;
    public final S70 k20;
    public final dc_0 Si0;
    public final oi_0 OJ0;
    public final J70 IF0;

    public BattleCameraTargetPosition(L5 contest, byte slot) {
        super();
        this.lf = slot;

        this.LZ = new le0_2();
        this.LZ.uf("contest-gui-enemy");
        this.LZ.sy(tw0_0.LD0.ew0() / 2 + 104, slot * 100 + 10);
        this.LZ.RY(296, 85);
        this.LZ.oY(296, 85);
        this.LZ.g2(296, 85);

        this.k20 = new S70(32, 32);
        this.OJ0 = new oi_0().I60((short) 96, (short) 22);
        this.Si0 = new dc_0();
        this.IF0 = new J70();

        this.H3 = new qd_2();
        this.H3.uf("love-meter");
        this.H3.aE(1.0f);
        this.H3.oY(240, 8);
        this.H3.sy(this.H3.Nl0() + 80, this.LZ.wF() + 7);

        this.e10 = new cn_0("");
        this.e10.uf("redlabel");
        this.TG = new cn_0("/ " + contest.BM().mn(slot).jI());
        this.TG.uf("redlabel");
        this.na0 = new cn_0("");
        this.na0.uf("redlabel");

        this.LZ.SL(this.TG);
        this.LZ.SL(this.k20);
        this.LZ.SL(this.OJ0);
        this.LZ.SL(this.Si0);
        this.LZ.SL(this.IF0);
        this.LZ.SL(this.H3);
        this.LZ.SL(this.e10);
        this.LZ.SL(this.na0);
    }

    public final void Ns(boolean visible) {
        this.H3.Ll(visible);
        this.LZ.Ll(visible);
        this.e10.Ll(visible);
        this.TG.Ll(visible);
        this.k20.Ll(visible);
        this.OJ0.Ll(visible);
        this.Si0.Ll(visible);
        this.IF0.Ll(visible);
        this.na0.Ll(visible);
    }
}
