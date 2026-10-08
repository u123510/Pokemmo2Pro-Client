package cn.pokemmo.world.entity.npc;

import f.*;

public abstract class NpcScriptDialogTrigger extends G20 {
    public static final MD0 Po;
    public static final MD0 Kg;
    public static final MD0 Wm;
    public hc_0 yN;
    public boolean cj0;
    public short Lu;
    public short wE0;
    public CH0 lO;
    public short ax;
    public byte Pc0;
    public boolean Q30;
    public Runnable M40;
    public int ge;
    public int ej0;
    public int vc0;
    public int NX;

    static {
        Po = MD0.cB("dragActive");
        Kg = MD0.cB("dropOk");
        Wm = MD0.cB("dropBlocked");
    }

    public NpcScriptDialogTrigger(short s, CH0 ch0, short s2, short s3, boolean z) {
        super("", "");
        this.ge = 6;
        this.ej0 = 4;
        this.vc0 = 24;
        this.NX = 24;
        uf("item-slot");
        this.Lu = s3;
        this.wE0 = s;
        this.lO = ch0;
        this.ax = s2;
        this.Q30 = z;
        Ez0();
        PF();
    }

    public void Ez0() {
        a7_0.bH(this.ER.Fc0);
        this.GH0 = 100;
        short s = this.wE0;
        if (s < 1) {
            SU("");
            this.yj0 = null;
            yB0();
            return;
        }
        mc0_1 lPT6 = gu0.l2.lPT6(s);
        if (this.ax > -1) {
            SU(this.ax + "x");
        } else {
            SU("");
        }
        if (lPT6.Iq != null) {
            this.yj0 = new gi_1(lPT6, this.Pc0, null);
            yB0();
        } else {
            this.yj0 = lb0_2.Sp0(lPT6, true, false);
            yB0();
        }
    }

    @Override
    public boolean nd0(i70_0 i70_0) {
        if (i70_0.Li() && i70_0.zu == 4 && i70_0.nA0 == 0) {
            Runnable runnable = this.M40;
            if (runnable != null) {
                runnable.run();
            }
            return true;
        }
        return super.nd0(i70_0);
    }

    public final void of(Runnable runnable) {
        this.M40 = runnable;
    }

    public void PF() {
        short s = this.wE0;
        if (s == 0) {
            this.zW.lo0();
        } else if (s < 0) {
            vk0_1 vk0_1 = (vk0_1) ec0_2.Sx().f4.f5((short) (s * -1));
            if (vk0_1 != null) {
                short s2;
                switch (vk0_1.oG(null, null).ordinal()) {
                    case 0:
                        s2 = 5420;
                        break;
                    case 1:
                        s2 = 5335;
                        break;
                    case 2:
                        s2 = 5421;
                        break;
                    case 3:
                        s2 = 5333;
                        break;
                    case 4:
                        s2 = 5353;
                        break;
                    case 5:
                        s2 = 5350;
                        break;
                    case 6:
                        s2 = 5403;
                        break;
                    case 7:
                        s2 = 5392;
                        break;
                    case 8:
                        s2 = 5401;
                        break;
                    case 9:
                    default:
                        s2 = 0;
                        break;
                    case 10:
                        s2 = 5388;
                        break;
                    case 11:
                        s2 = 5422;
                        break;
                    case 12:
                        s2 = 5349;
                        break;
                    case 13:
                        s2 = 5351;
                        break;
                    case 14:
                        s2 = 5330;
                        break;
                    case 15:
                        s2 = 5334;
                        break;
                    case 16:
                        s2 = 5329;
                        break;
                    case 17:
                        s2 = 5328;
                        break;
                }
                this.zW.Nk(new Wr[]{gh_1.aH0.Jg(s2, false)});
                this.zW.OA0 = true;
                this.zW.IF = this.vc0;
                this.zW.gx0 = this.NX;
                this.zW.gY = this.ge;
                this.zW.a4 = this.ej0;
            } else {
                this.zW.lo0();
            }
        } else {
            this.zW.Nk(new Wr[]{gh_1.aH0.Jg(s, false)});
            this.zW.OA0 = true;
            this.zW.IF = this.vc0;
            this.zW.gx0 = this.NX;
            this.zW.gY = this.ge;
            this.zW.a4 = this.ej0;
        }
    }

    public void Hr(int i, int i2) {
        this.ge = i;
        this.ej0 = i2;
    }

    public final void ka0() {
        this.vc0 = 48;
        this.NX = 48;
    }

    public final void TK() {
        this.Q30 = false;
    }

    public void Uj0(byte b, short s, short s2) {
        this.wE0 = s;
        if (s <= 0) {
            s2 = 0;
        }
        this.ax = s2;
        this.Pc0 = b;
        Ez0();
        PF();
    }

    public void UR(K5 k5) {
    }

    public final void cl0(hc_0 hc_0) {
        this.yN = hc_0;
    }

    public final void RI(boolean z, boolean z2) {
        this.M.j70(Kg, z && z2);
        this.M.j70(Wm, z && !z2);
    }

    @Override
    public void Dw0(zk0_1 zk0_1) {
        if (!this.cj0) {
            super.Dw0(zk0_1);
        }
    }

    public void Kp0(zk0_1 zk0_1, int i, int i2, int i3) {
    }
}
