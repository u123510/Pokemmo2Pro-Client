package cn.pokemmo.graphics.gdx.render;

import f.*;


import com.badlogic.gdx.math.Matrix4;

public class GdxSkyboxCubemapRenderer extends Sr {
    public static final /* synthetic */ int dm0 = 0;
    public com3__3 t60;
    public com3__3 jx;
    public xt_0 dC;

    public GdxSkyboxCubemapRenderer(byte b) {
        super(b);
    }

    @Override
    public final void cJ() {
        super.cJ();
        this.SA = new Tz0(tw0_0.Ll0.nC0);
        Ou0 ou0 = this.SA.Jj0;
        this.og0.Ue0(ou0);
        Ou0 ou02 = this.SA.ef;
        this.og0.Ue0(ou02);
        this.SA.ef.ho.el0(0.0f, -0.5f, 0.0f);
        this.SA.ef.ho.w2(4.0f, 4.0f, 4.0f);
        this.Ns.Wu0 = 0.1f;
        this.Ns.Qy = 200.0f;
        this.Ns.zo0 = 40.0f;
        this.Ns.d00 = 0.0f;
        this.Ns.Q30 = 0.0f;
        this.Ns.jd0.x = 0.0f;
        this.Ns.jd0.y = 0.0f;
        this.Ns.jd0.z = -1.0f;
        this.Ns.v40.x = 0.0f;
        this.Ns.v40.y = 2.5f;
        this.Ns.v40.z = 2.5f;
        C8 y = C8.Y;
        this.Ns.St0.np(y);
        C8 x = C8.X;
        float f = -50.0f;
        this.Ns.jd0.YO(x, f);
        this.Ns.St0.YO(x, f);
        this.Ns.jd0.YO(y, 0.0f);
        this.Ns.St0.YO(y, 0.0f);
        C8 z = C8.Z;
        this.Ns.jd0.YO(z, 0.0f);
        this.Ns.St0.YO(z, 0.0f);
        this.Ns.ye(true);
        pw_1.xC().TD0()
            .y80(ao_1.yp(4, this.Ns).kt(0.0f, 6.0f, 6.0f))
            .y80(ao_1.DX(this.Ns, 4, 1.5f).kt(0.0f, 3.25f, 4.0f))
            .y80(ao_1.pc(new db0_1((eg0_0) (Object) this)))
            .mz0()
            .Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void Iu() {
        int i1;
        if ((i1 = this.Js) > -1) {
            Matrix4 ho = this.YM[i1].ho;
            C8 v2 = Sr.HN;
            ho.V1(v2);
            v2.y += 0.18f;
            float f1 = (v2.z -= 0.05f);
            com3__3 v3 = this.Wr0;
            v3.j.x = v2.x;
            v3.j.z = f1;
            v2.x = 0.0f;
            v2.y = 0.5f;
            v2.z = 1.0f;
            v3.Ji(v2, this.Ns.St0);
        }
        super.Iu();
    }

    @Override
    public final void Dq() {
        super.Dq();
        if (this.t60 != null && this.jx != null && this.VK0 >= 2) {
            xt_0 xt_02;
            if ((xt_02 = this.dC) != null) {
                lg_0.k.lPT5(xt_02);
            }
            C8 c8 = Sr.HN;
            c8.x = 0.0f;
            c8.y = 0.5f;
            c8.z = 1.0f;
            this.jx.Ji(c8, this.Ns.St0);
            this.jx.Vg();
            this.jx.GA(lg_0.S4.uL);
            this.t60.Ji(c8, this.Ns.St0);
            this.t60.Vg();
            this.t60.GA(lg_0.S4.uL);
            this.iD0.Lh0(this.t60, this.nm0);
            this.iD0.Lh0(this.jx, this.nm0);
        }
    }

    @Override
    public final void O70() {
        short s = (short)(this.Js * 3 + 387);
        xt_0 xt_02;
        if ((xt_02 = this.dC) != null) {
            xt_02.dispose();
            this.dC = null;
        }
        this.dC = yh_0.Xm0.P90((byte)0, s, false, false);
        this.dC.j9(dw_2.Tv0);
        this.jx = com3__3.xD(this.dC);
        this.jx.OF0(0.0125f);
        LPT6_ lPT6_ = new LPT6_(this.SA.XB0);
        this.t60 = new com3__3(lPT6_.bz, lPT6_.xZ, lPT6_, false);
        this.t60.OF0(0.00125f);
        Matrix4 ho = this.YM[this.Js].ho;
        C8 sv0 = Sr.Sv0;
        ho.V1(sv0);
        Matrix4 ho2 = this.YM[this.Js].ho;
        C8 hn = Sr.HN;
        ho2.V1(hn);
        hn.y += 1.5f;
        hn.z = 1.5f;
        hn.x = 0.0f;
        this.jx.CQ.v50.set(1.0f, 1.0f, 1.0f, 0.0f);
        this.jx.qr0(sv0);
        this.t60.qr0(hn);
        ao_1 t60_7 = ao_1.DX(this.t60, 7, 0.5f);
        t60_7.h5[0] = 1.25f;
        ao_1 jx_9 = ao_1.DX(this.jx, 9, 0.1f);
        jx_9.h5[0] = 1.0f;
        this.Con = (pw_1) pw_1.xC().TD0().Xf0()
            .y80(ao_1.DX(this.t60, 4, 0.25f).kt(sv0.x, sv0.y - 0.4f, sv0.z))
            .y80(t60_7)
            .mz0()
            .y80(jx_9)
            .mz0()
            .y80(ao_1.pc(this::BE0))
            .Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void nm() {
        Qy0 qy0 = Qy0.yI0;
        lpt3__4 dialog = new lpt3__4(
            sm0_0.Bw((byte)3, lpt6__2.Q80, 360, this.Js + 1, sm0_0.zb0),
            this::E7,
            null
        );
        Runnable cancelAction = this::DA;
        if (cancelAction != null) {
            dialog.qp0.RR(cancelAction);
        }
        dialog.D80 = true;
        qy0.sr0(dialog);
    }

    @Override
    public final void E7() {
        ao_1 ns_8 = ao_1.DX(this.Ns, 8, 0.8f);
        ns_8.h5[0] = 24.0f;
        this.Con = (pw_1) pw_1.xC().TD0()
            .y80(ao_1.pc(this::nk0))
            .y80(ns_8)
            .y80(ao_1.pc(this::Aj))
            .mz0()
            .Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void dispose() {
        xt_0 xt_02;
        if ((xt_02 = this.dC) != null) {
            xt_02.dispose();
        }
        super.dispose();
    }

    public final void Aj(int i1, D2 v2) {
        tw0_0.rl.ze0(this.L9, (byte)(this.Js + 1));
        this.VK0 = 4;
    }

    public final void nk0(int i1, D2 v2) {
        di0_0.xE0((short)(this.Js * 3 + 387));
    }

    public final void BE0(int i1, D2 v2) {
        di0_0.xE0((short)(this.Js * 3 + 387));
    }
}
