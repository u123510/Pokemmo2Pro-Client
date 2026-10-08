package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleActionNeg030Packet extends Nt implements eb0_0 {
    public final byte Ev0;
    public final byte cx0;
    public final byte Gt;
    public final byte ua0;
    public final short Y4;
    public final boolean g80;

    public BattleActionNeg030Packet(byte b, byte b2, byte b3, byte b4, short s, boolean z) {
        this.Ev0 = b;
        this.cx0 = b2;
        this.Gt = b3;
        this.ua0 = b4;
        this.Y4 = s;
        this.g80 = z;
    }

    @Override
    public final byte BL0() {
        return -30;
    }

    @Override
    public final void IE0(PF pf, PF pf2, boolean z, boolean z2, short s, boolean z3, ML0 ml0, qn_1 qn_1) {
        if (this.Ev0 == 0) {
            String str = "";
            if (this.Y4 == 113) {
                str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, ml0.yd0.Vs0(this.cx0, 128), sm0_0.zb0);
            } else if (this.Y4 == 115) {
                str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, ml0.yd0.Vs0(this.cx0, 124), sm0_0.zb0);
            } else if (this.Y4 == 3113 || this.Y4 == 3115) {
                vk0_1 vk0_1 = (vk0_1) ec0_2.Sx().f4.f5(this.Y4);
                if (vk0_1 != null) {
                    str = sm0_0.wa0(ml0.yd0.Vs0(this.cx0, 16807048), sm0_0.c0(vk0_1.bt));
                }
            }
            if (this.g80 && pf2 != null) {
                ml0.I1(str, "", this.el(ml0, pf2));
            } else {
                ml0.wJ(str, "", this.el(ml0, pf2));
            }
        } else if (this.Ev0 == 2) {
            String str = "";
            vk0_1 vk0_1 = (vk0_1) ec0_2.Sx().f4.f5(this.Y4);
            if (vk0_1 != null) {
                str = sm0_0.wa0(ml0.yd0.Vs0(this.cx0, 16807046), sm0_0.c0(vk0_1.bt));
            }
            ml0.wJ(str, "", this.xA0(ml0));
        } else if (this.Ev0 == 1) {
            String str = "";
            if (this.Y4 == 113) {
                str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, ml0.yd0.Vs0(this.cx0, 130), sm0_0.zb0);
            } else if (this.Y4 == 115) {
                str = sm0_0.Bw((byte) 2, lpt6__2.Q80, 15, ml0.yd0.Vs0(this.cx0, 126), sm0_0.zb0);
            } else if (this.Y4 == 3113 || this.Y4 == 3115) {
                vk0_1 vk0_1 = (vk0_1) ec0_2.Sx().f4.f5(this.Y4);
                if (vk0_1 != null) {
                    str = sm0_0.wa0(ml0.yd0.Vs0(this.cx0, 16807048), sm0_0.c0(vk0_1.bt));
                }
            }
            ml0.wJ(str, "", this.ga0(ml0));
        }
    }

    @Override
    public final boolean Hm() {
        if (this.g80 && (this.Ev0 == 0 || this.Ev0 == 2)) {
            return true;
        }
        return super.Hm();
    }

    public final Runnable el(ML0 ml0, PF pf) {
        return () -> this.i50(ml0, pf, ml0.yd0.mn(this.cx0).zI);
    }

    public final Runnable xA0(ML0 ml0) {
        return () -> this.pk0(ml0.yd0.mn(this.cx0).zI, ml0);
    }

    public final Runnable ga0(ML0 ml0) {
        return () -> this.Nh(ml0.yd0.mn(this.cx0).zI, ml0);
    }

    public final void Nh(ek_0 ek_0, ML0 ml0) {
        if (tw0_0.LD0.he0 != null) {
            if (this.Y4 == 115 || this.Y4 == 3115) {
                ek_0.Rz0 = 0;
                ek_0.rE0 = 0;
                ek_0.wb0 = 0;
                ek_0.vD0 = 0;
                ek_0.LPt4 = false;
            } else if (this.Y4 == 113 || this.Y4 == 3113) {
                ek_0.fP = 0;
                ek_0.aw0 = 0;
                ek_0.ei0 = 0;
                ek_0.id0 = 0;
            }
            ml0.yd0.p0(ml0, this.cx0);
        }
    }

    public final void pk0(ek_0 ek_0, ML0 ml0) {
        if (tw0_0.LD0.he0 != null) {
            if (this.Y4 == 115 || this.Y4 == 3115) {
                ek_0.wb0 = (byte) (ek_0.wb0 - 1);
            } else if (this.Y4 == 113 || this.Y4 == 3113) {
                ek_0.ei0 = (byte) (ek_0.ei0 - 1);
            }
            ml0.yd0.p0(ml0, this.cx0);
        }
    }

    public final void i50(ML0 ml0, PF pf, ek_0 ek_0) {
        if (tw0_0.LD0.he0 != null) {
            if (this.g80) {
                ml0.lZ.add(new kw_0((byte) 0, qk_2.cR.import$(pf, this.Y4)));
            }
            if (this.Y4 == 115 || this.Y4 == 3115) {
                ek_0.Rz0 = this.Y4;
                ek_0.rE0 = this.Gt;
                ek_0.wb0 = this.ua0;
                ek_0.vD0 = 0;
                ek_0.LPt4 = this.ua0 > 1;
            } else if (this.Y4 == 113 || this.Y4 == 3113) {
                ek_0.fP = this.Y4;
                ek_0.aw0 = this.Gt;
                ek_0.ei0 = this.ua0;
                ek_0.id0 = 0;
                ek_0.Oa = this.ua0 > 1;
            }
            ml0.yd0.p0(ml0, this.cx0);
        }
    }
}
