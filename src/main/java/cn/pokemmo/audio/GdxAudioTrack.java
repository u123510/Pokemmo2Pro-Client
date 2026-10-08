package cn.pokemmo.audio;

import f.*;


import com.badlogic.gdx.math.Matrix4;

public class GdxAudioTrack extends Sr {
    public static final int[] NE;
    public static final int[] ln0;
    public static final int[] LpT2;
    public static final int[] ca0;
    public Gv0 lZ;
    public ee0_1 vE0;
    public PC0 gE0;
    public hl0_1 COM5;
    public Bp0[] Gr0;

    static {
        NE = new int[]{40, 50, 60};
        ln0 = new int[]{70, 130, 190};
        LpT2 = new int[]{1, 0, 2};
        ca0 = new int[]{2, 1, 3};
    }

    public GdxAudioTrack(byte b) {
        super(b);
    }

    @Override
    public void cJ() {
        super.cJ();
        this.COM5 = new hl0_1(256, new qd0_0().mF0);
        PC0 pc0 = new PC0((float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0());
        this.gE0 = pc0;
        pc0.LH = 1.0f;
        this.vE0 = new ee0_1(P9.iw, 512.0f, 256.0f, this.gE0);
        if (this.SA == null) {
            this.SA = new Tz0(tw0_0.Ll0.Qz0);
        }
        this.og0.Ue0(this.SA.EK0);
        this.SA.EK0.Ey("psel_s02", false, null);
        Tz0 tz0 = this.SA;
        this.lZ = tz0.bM;
        Ou0[] arr = new Ou0[3];
        this.YM = arr;
        Ou0 ku0 = tz0.ku0;
        arr[0] = ku0;
        arr[1] = tq0_0.ip0(ku0, ku0);
        this.YM[1].I0 = true;
        this.YM[2] = tq0_0.ip0(this.SA.ku0, this.SA.ku0);
        this.YM[2].I0 = true;
        this.YM[0].ho.el0(-0.2f, 0.425f, 0.0225f);
        this.YM[1].ho.el0(0.0f, 0.425f, -0.125f);
        this.YM[2].ho.el0(0.2f, 0.425f, 0.0225f);
        this.Gr0 = new Bp0[3];
        for (int i = 0; i < 3; i++) {
            int i2 = i * 80;
            int i3 = (i == 1) ? 24 : 32;
            B5[] b5Arr = this.SA.bX[i];
            int length = b5Arr.length;
            for (int i6 = 0; i6 < length; i6++) {
                B5 b5 = b5Arr[i6];
                b5.ak0((float) i3, (float) i2);
                b5.Ha0(0.0f);
                b5.Zi0 = 0.5f;
                b5.D60 = 0.5f;
                b5.o70 = true;
            }
            this.Gr0[i] = new Bp0((float) i3, (float) i2);
        }
        B5[] ca = this.SA.CA;
        for (int i = 0; i < ca.length; i++) {
            ca[i].Ha0(0.0f);
        }
        B5[] tf0 = this.SA.TF0;
        for (int i = 0; i < tf0.length; i++) {
            tf0[i].Ha0(0.0f);
        }
        LPT6_ lpt6_ = new LPT6_(this.SA.Fl);
        com3__3 com3 = new com3__3(lpt6_.bz, lpt6_.xZ, lpt6_, false);
        this.Wr0 = com3;
        com3.OF0(0.00325f);
        this.Wr0.j.y = 0.605f;
        ao_1 a1 = ao_1.DX(this.Wr0, 2, 0.4f);
        a1.h5[0] = this.Wr0.j.y + 0.05f;
        ao_1 a2 = ao_1.DX(this.Wr0, 2, 0.4f);
        a2.h5[0] = this.Wr0.j.y;
        this.VE = (pw_1) ((pw_1) pw_1.xC().TD0().y80(a1).y80(a2).mz0().Yu0(9999999, 0.0f)).Ms(tw0_0.LD0.Ov);
        this.Con = pw_1.xC();
        pw_1 p = this.Con.TD0();
        ao_1 a_ca = ao_1.DX(this.SA.CA[0], 8, 1.0f);
        a_ca.h5[0] = 1.0f;
        p.y80(a_ca);
        p.Xf0();
        ao_1 a_b0 = ao_1.DX(this.SA.bX[0][1], 8, 0.6f);
        a_b0.h5[0] = 1.0f;
        p.y80(a_b0);
        ao_1 a_b1 = ao_1.DX(this.SA.bX[1][1], 8, 0.6f);
        a_b1.h5[0] = 1.0f;
        p.y80(a_b1);
        ao_1 a_b2 = ao_1.DX(this.SA.bX[2][1], 8, 0.6f);
        a_b2.h5[0] = 1.0f;
        p.y80(a_b2);
        p.mz0();
        p.p1(1.0f);
        p.mz0();
        p.xF0 = new N(this);
        this.Con.Ms(tw0_0.LD0.Ov);
        for (Ou0 item : this.YM) {
            this.og0.Ue0(item);
        }
    }

    @Override
    public final void Iu() {
        int i = this.Js;
        if (i > -1) {
            Matrix4 ho = this.YM[i].ho;
            C8 hn = Sr.HN;
            ho.V1(hn);
            hn.y += 0.18f;
            hn.z -= 0.05f;
            float z = hn.z;
            this.Wr0.j.x = hn.x;
            this.Wr0.j.z = z;
            hn.x = 0.0f;
            hn.y = 0.5f;
            hn.z = 1.0f;
            this.Wr0.Ji(hn, this.Ns.St0);
        }
        super.Iu();
    }

    @Override
    public final int J7(int i1) {
        int res = super.J7(i1);
        if (res == -2) {
            return -2;
        }
        this.Con = pw_1.xC();
        pw_1 v2 = this.Con.TD0();
        int i3 = this.Js;
        B5[][] bX = this.SA.bX;
        int i5 = (res < 0) ? 0 : res;
        B5[] v4 = bX[i5];
        B5[] v5 = bX[i3];
        int i7 = (res < 0) ? 0 : res;
        int i3_new = ca0[i7];
        int i6 = ca0[i3];
        pw_1 v3 = pw_1.xC().Xf0().TD0();
        ao_1 a_ca_old = ao_1.DX(this.SA.CA[i6], 8, 0.75f);
        a_ca_old.h5[0] = 1.0f;
        v3.y80(a_ca_old);
        ao_1 a_tf_old = ao_1.DX(this.SA.TF0[i6], 8, 0.1f);
        a_tf_old.h5[0] = 1.0f;
        v3.y80(a_tf_old);
        v3.mz0();
        v3.Xf0();
        ao_1 a_ca_new = ao_1.DX(this.SA.CA[i3_new], 8, 0.75f);
        a_ca_new.h5[0] = 0.0f;
        v3.y80(a_ca_new);
        ao_1 a_tf_new = ao_1.yp(8, this.SA.TF0[i3_new]);
        a_tf_new.h5[0] = 0.0f;
        v3.y80(a_tf_new);
        if (res > -1) {
            ao_1 a_v4_0 = ao_1.DX(v4[0], 8, 0.75f);
            a_v4_0.h5[0] = 0.0f;
            v3.y80(a_v4_0);
            v3.y80(ao_1.DX(v4[0], 6, 0.75f).UD(0.5f, 0.5f));
            v3.y80(ao_1.DX(v4[1], 6, 0.75f).UD(0.5f, 0.5f));
            v3.y80(ao_1.DX(v4[0], 3, 0.75f).UD(this.Gr0[res].x, this.Gr0[res].y));
            v3.y80(ao_1.DX(v4[1], 3, 0.75f).UD(this.Gr0[res].x, this.Gr0[res].y));
        }
        ao_1 a_v5_0 = ao_1.DX(v5[0], 8, 0.75f);
        a_v5_0.h5[0] = 1.0f;
        v3.y80(a_v5_0);
        v3.y80(ao_1.DX(v5[0], 6, 0.75f).UD(1.0f, 1.0f));
        v3.y80(ao_1.DX(v5[1], 6, 0.75f).UD(1.0f, 1.0f));
        v3.y80(ao_1.DX(v5[0], 3, 0.75f).UD(this.Gr0[1].x, this.Gr0[1].y + 24.0f));
        v3.y80(ao_1.DX(v5[1], 3, 0.75f).UD(this.Gr0[1].x, this.Gr0[1].y + 24.0f));
        v3.mz0();
        v3.mz0();
        v2.xi0(v3);
        v2.y80(ao_1.pc(this::EH));
        v2.mz0();
        this.Con.Ms(tw0_0.LD0.Ov);
        return res;
    }

    @Override
    public final void Kk(boolean b) {
        if (b) {
            CI0.r40(0, 0, lg_0.S4.Kr0(), lg_0.S4.sD0());
        } else {
            CI0.r40(0, 0, lg_0.S4.Kr0() / 2, lg_0.S4.sD0());
        }
    }

    @Override
    public final void qL(int i1, int i2) {
        int i3 = i1 / 2;
        super.qL(i3, i2);
        this.vE0.Yw0(i1, i2);
        this.vE0.df = i3;
        this.gE0.Ka0((float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0(), true);
        this.gE0.R1(true);
        this.COM5.Po(this.gE0.iJ);
    }

    @Override
    public final void LK0() {
        int i1 = (int) (this.Xb * 40.0f);
        switch (this.VK0) {
            case 0:
            case 1:
                i1 = Math.min(i1, 40);
                break;
            case 2:
                i1 = Math.min(i1, 9) + NE[this.Js];
                break;
            case 3:
            case 4:
                i1 = Math.min(i1, 59);
                if (i1 == 0) {
                    di0_0.xE0((short) (this.Js * 3 + 495));
                }
                if (i1 == 59 && this.VK0 != 4) {
                    this.VK0 = 4;
                    tw0_0.rl.ze0(this.L9, (byte) (this.Js + 1));
                }
                i1 += ln0[this.Js];
                break;
        }
        float f2 = this.lZ.Fx0(3, i1) / 64.0f;
        float f3 = this.lZ.Fx0(4, i1) / 64.0f;
        float f4 = this.lZ.Fx0(5, i1) / 64.0f;
        float f5 = this.lZ.Fx0(0, i1);
        float f6 = this.lZ.Fx0(1, i1);
        float f1 = this.lZ.Fx0(2, i1);
        BJ0 ns = this.Ns;
        ns.Wu0 = 0.1f;
        ns.Qy = 200.0f;
        ns.zo0 = 80.0f;
        ns.d00 = 0.0f;
        ns.Q30 = 0.0f;
        ns.jd0.x = 0.0f;
        ns.jd0.y = 0.0f;
        ns.jd0.z = -1.0f;
        ns.v40.x = f2;
        ns.v40.y = f3;
        ns.v40.z = f4;
        C8 v2 = C8.Y;
        ns.St0.np(v2);
        C8 x = C8.X;
        this.Ns.jd0.YO(x, f5);
        this.Ns.St0.YO(x, f5);
        this.Ns.jd0.YO(v2, f6);
        this.Ns.St0.YO(v2, f6);
        C8 z = C8.Z;
        this.Ns.jd0.YO(z, f1);
        this.Ns.St0.YO(z, f1);
        this.Ns.ye(true);
        super.LK0();
    }

    @Override
    public final void Ct0() {
        this.vE0.kF(true);
        this.COM5.Po(this.gE0.iJ);
        this.COM5.getClass();
        this.COM5.W30();
        for (B5 b5 : this.SA.CA) {
            b5.jN(this.COM5);
        }
        for (B5 b5 : this.SA.TF0) {
            b5.jN(this.COM5);
        }
        for (int i = 0; i < 3; i++) {
            int idx = LpT2[i];
            this.SA.bX[idx][1].jN(this.COM5);
            this.SA.bX[idx][0].jN(this.COM5);
        }
        this.COM5.TV();
        this.COM5.end();
    }

    @Override
    public final void nm() {
        Qy0 qy = Qy0.yI0;
        String text = sm0_0.Bw((byte) 2, lpt6__2.YG0, 430, 20, sm0_0.zb0);
        lpt3__4 dialog = new lpt3__4(text, this::E7, null);
        Runnable r = this::DA;
        if (r != null) {
            dialog.qp0.RR(r);
        }
        dialog.D80 = true;
        qy.sr0(dialog);
    }

    @Override
    public final void dispose() {
        super.dispose();
        this.COM5.dispose();
    }

    public final void EH(int i1, D2 v2) {
        di0_0.xE0((short) (this.Js * 3 + 495));
    }
}
