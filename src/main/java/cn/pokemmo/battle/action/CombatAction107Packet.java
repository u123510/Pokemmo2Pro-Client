package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CombatAction107Packet extends Nt implements eb0_0 {
    public final short Ps;
    public final short sG0;
    public final short hW;
    public final short Bj0;

    public CombatAction107Packet(short s, short s2, short s3, short s4) {
        this.Ps = s;
        this.sG0 = s2;
        this.hW = s3;
        this.Bj0 = s4;
    }

    @Override
    public final byte BL0() {
        return 107;
    }

    public final void Rm(ML0 v1, PF v2) {
        v1.Hi(v2).le0(v2, true, this.hW);
    }

    @Override
    public final void IE0(PF v1, PF v2, boolean z3, boolean z4, short s5, boolean z6, ML0 v7, qn_1 v8) {
        short s = v2.p10();
        tb0_1 tb0_12 = v2.r10;
        CH0 ch0 = v2.Zo0();
        short s2 = this.Ps;
        byte b = v2.Ya0();
        String string = v2.zi0.Bn.kX;
        byte b2 = v2.Wm();
        byte b3 = v2.coM9();
        se_0 se_02 = v2.zi0;
        short s3 = se_02.Bn.IB;
        short s4 = se_02.T0;
        short s5_ = this.hW;
        short s6 = this.Bj0;
        QL ql = v2.FZ != QL.lQ ? v2.FZ : se_02.Vg0;
        byte b4 = se_02.HP();
        byte b5 = v2.rp0();
        tb0_12.eo0(ch0, s2, b, string, b2, b3, s3, s4, s5_, s6, ql, b4, b5);
        v2.rm0 = this.Ps;
        v2.Z10 = (cq_0) mp_1.vf0().k2.get(Short.valueOf(this.Ps));
        v2.Sk0 = this.sG0;
        v7.lZ.add(new im0(v2, b30_0.U5(v2.cD0, v2.Kj0)));
        String[] arrstring = new String[]{
                sm0_0.c0(s + 150000),
                sm0_0.c0(this.Ps + 150000)
        };
        v7.wJ(sm0_0.Bx(200501, arrstring), "", null);
        i40_0 i40_02 = i40_0.Gc;
        v2.gp = i40_02;
        v2.Qj = i40_02;
        lg_0.k.lPT5(() -> Rm(v7, v2));
    }
}
