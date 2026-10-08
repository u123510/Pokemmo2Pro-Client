package cn.pokemmo.audio;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public class GdxSoundEffect extends Sr {
    public com3__3 T8;
    public xt_0 hO;
    public Ou0[] S40;
    public float cT;
    public float P80;

    public GdxSoundEffect(byte i1) {
        super(i1);
        this.cT = 0.0f;
        this.P80 = 0.0f;
    }

    @Override
    public final void cJ() {
        super.cJ();
        this.Js = 0;
        this.SA = new Tz0(tw0_0.Ll0.t1);
        Xz0 xz = (Xz0) ((Xz0) ((Xz0) this.SA.Jj0.ZE0.get(0)).yn.get(0)).yn.get(0);
        xz.Fc0.hn0(4.0f, 2.0f, 1.25f);
        xz.BI0.na(0.0f, -15.0f, 0.0f);
        this.SA.Jj0.a8();
        this.og0.Ue0(this.SA.Jj0);
        this.og0.Ue0(this.SA.EK0);
        this.SA.EK0.sC0(0, true, null);

        this.Ns.Wu0 = 0.1f;
        this.Ns.Qy = 200.0f;
        this.Ns.zo0 = 60.0f;
        this.Ns.d00 = 0.0f;
        this.Ns.Q30 = 0.0f;
        this.Ns.Rg0 = 20.0f;
        this.Ns.v40.x = 0.0f;
        this.Ns.v40.y = 2.0f;
        this.Ns.v40.z = 2.0f;
        this.Ns.Y90(0.0f, 0.0f, 0.0f);
        this.Ns.St0.np(C8.Y);
        this.Ns.ye(true);

        B90 i3 = ((mz_2) ((BM) this.SA.ku0.Y3.get(2)).sg(mz_2.g7)).I3;
        i3.Td0(i3.uj, eb0_1.Y30, eb0_1.Y30, a00_0.x3, a00_0.x3);

        Ou0[] ymArr = new Ou0[3];
        this.YM = ymArr;
        Ou0 ku0 = this.SA.ku0;
        ymArr[0] = ku0;
        Ou0 copy1 = new Ou0(ku0);
        copy1.I0 = true;
        this.YM[1] = copy1;
        Ou0 copy2 = tq0_0.ip0(this.SA.ku0, this.SA.ku0);
        copy2.I0 = true;
        this.YM[2] = copy2;

        Ou0[] s40Arr = new Ou0[3];
        this.S40 = s40Arr;
        Ou0 l00 = this.SA.l00;
        s40Arr[0] = l00;
        Ou0 l00Copy1 = tq0_0.ip0(this.SA.l00, this.SA.l00);
        l00Copy1.I0 = true;
        this.S40[1] = l00Copy1;
        Ou0 l00Copy2 = tq0_0.ip0(this.SA.l00, this.SA.l00);
        l00Copy2.I0 = true;
        this.S40[2] = l00Copy2;

        for (int i = 0; i < 3; i++) {
            Ou0 ym = this.YM[i];
            Ou0 s40 = this.S40[i];
            ym.ho.Y1(C8.Zero);
            ym.ho.CN(C8.Y, (float) (i * -120));
            ym.ho.el0(0.0f, 0.22f, 0.5f);
            s40.ho.Y1(C8.Zero);
            s40.ho.CN(C8.Y, (float) (i * -120));
            s40.ho.el0(0.0f, 0.22f, 0.5f);
            this.og0.Ue0(ym);
            this.og0.Ue0(s40);
        }
        this.VK0 = 1;
        Dx0(this.Js);
    }

    @Override
    public final void Iu() {
        super.Iu();
        int targetIdx = this.Js >= 0 ? this.Js * -120 : 0;
        float targetAngle = (float) targetIdx;
        float currentAngle;
        if (!LW.LH0(this.cT, targetAngle)) {
            float p = this.P80 + lg_0.S4.uL;
            this.P80 = p;
            float progress = p / 0.33f;
            if (progress >= 1.0f) {
                this.cT = targetAngle;
                di0_0.xE0((short) (this.Js * 3 + 152));
                Dx0(this.Js);
                currentAngle = targetAngle;
            } else {
                float diff = ((targetAngle - this.cT) % 360.0f + 360.0f + 180.0f) % 360.0f - 180.0f;
                currentAngle = ((diff * progress + this.cT) % 360.0f + 360.0f) % 360.0f;
            }
        } else {
            currentAngle = this.cT;
        }

        this.Ns.v40.x = 0.0f;
        this.Ns.v40.y = 3.0f;
        this.Ns.v40.z = 3.0f;
        this.Ns.Y90(0.0f, 0.0f, 0.0f);
        this.Ns.St0.np(C8.Y);
        this.Ns.Aj(C8.Zero, C8.Y, currentAngle);
        this.Ns.ye(true);

        HN.x = 0.0f;
        HN.y = 1.15f;
        HN.z = 0.4f;
        HN.YO(C8.Y, currentAngle);

        this.SA.Jj0.ho.CN(C8.Y, currentAngle);
        if (this.T8 != null) {
            this.T8.DB0(this.Ns.v40, this.Ns.St0);
        }
    }

    @Override
    public final int J7(int i1) {
        int idx = this.Js >= 0 ? this.Js * -120 : 0;
        if (!LW.LH0(this.cT, (float) idx)) {
            return -2;
        }
        pw_1 pw = pw_1.xC().TD0();
        ao_1 a1 = ao_1.DX(this.T8, 9, 0.25f);
        a1.h5[0] = 0.0f;
        pw.y80(a1).mz0();
        this.Con = (pw_1) pw.Ms(tw0_0.LD0.Ov);
        tw0_0.RE0.d00(true, (byte) 4, (short) 1543, 0.0f);
        this.P80 = 0.0f;
        return super.J7(i1);
    }

    @Override
    public final void TO(int i1) {
        Ou0 ym = this.YM[i1];
        ym.PE0 = 99999.0f;
        ym.sC0(0, false, null);
    }

    @Override
    public final void Dq() {
        super.Dq();
        if (this.T8 != null && this.VK0 >= 1) {
            if (this.hO != null) {
                lg_0.k.lPT5(this.hO);
            }
            this.T8.Vg();
            this.T8.GA(lg_0.S4.uL);
            this.iD0.Lh0(this.T8, this.nm0);
        }
    }

    @Override
    public final void O70() {
        pw_1 pw = pw_1.xC().TD0();
        ao_1 a1 = ao_1.DX(this.Ns, 8, 0.8f);
        a1.h5[0] = 50.0f;
        pw.y80(a1);
        pw.y80(ao_1.pc(this::Ac));
        pw.mz0();
        this.Con = (pw_1) pw.Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void DA() {
        this.Xb = 99999.0f;
        this.VK0 = 1;
        pw_1 pw = pw_1.xC().TD0();
        ao_1 a1 = ao_1.DX(this.Ns, 8, 0.8f);
        a1.h5[0] = 67.0f;
        pw.y80(a1).mz0();
        this.Con = (pw_1) pw.Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void nm() {
        Qy0 qy = Qy0.yI0;
        String text = sm0_0.Bw((byte) 4, lpt6__2.Q80, 190, this.Js + 1, sm0_0.zb0);
        lpt3__4 dialog = new lpt3__4(text, this::E7, null);
        Runnable cancelAction = this::DA;
        if (dialog.qp0 != null) {
            dialog.qp0.RR(cancelAction);
        }
        dialog.D80 = true;
        qy.sr0(dialog);
    }

    @Override
    public final void E7() {
        pw_1 pw = pw_1.xC().TD0();
        pw.y80(ao_1.pc(this::K90));
        ao_1 a1 = ao_1.DX(this.Ns, 8, 0.8f);
        a1.h5[0] = 24.0f;
        pw.y80(a1);
        pw.y80(ao_1.pc(this::SE0));
        pw.mz0();
        this.Con = (pw_1) pw.Ms(tw0_0.LD0.Ov);
    }

    @Override
    public final void dispose() {
        if (this.hO != null) {
            this.hO.dispose();
        }
        super.dispose();
    }

    public final void Dx0(int i1) {
        short speciesId = (short) (i1 * 3 + 152);
        if (this.hO != null) {
            this.hO.dispose();
            this.hO = null;
        }
        xt_0 model = yh_0.Xm0.P90((byte) 0, speciesId, false, false);
        this.hO = model;
        model.j9((float) dw_2.Tv0);
        com3__3 com = com3__3.xD(this.hO);
        this.T8 = com;
        com.OF0(0.0125f);
        int angle = i1 * -120;
        HN.x = 0.0f;
        HN.y = 1.15f;
        HN.z = 0.4f;
        if (i1 == 0) {
            HN.x = 0.075f;
        } else if (i1 == 1) {
            HN.x = 0.025f;
        }
        HN.YO(C8.Y, (float) angle);
        this.T8.CQ.v50.set(1.0f, 1.0f, 1.0f, 0.0f);
        this.T8.qr0(HN);

        pw_1 pw = pw_1.xC().TD0();
        ao_1 a1 = ao_1.DX(this.T8, 9, 0.25f);
        a1.h5[0] = 1.0f;
        pw.y80(a1).mz0();
        this.Con = (pw_1) pw.Ms(tw0_0.LD0.Ov);
    }

    public final void SE0(int i1, D2 v2) {
        tw0_0.rl.ze0(this.L9, (byte) (this.Js + 1));
        this.VK0 = 4;
    }

    public final void K90(int i1, D2 v2) {
        di0_0.xE0((short) (this.Js * 3 + 152));
        Ou0 ym = this.YM[this.Js];
        ym.PE0 = 1.0f;
        ym.sC0(1, false, null);
        this.S40[this.Js].sC0(0, false, null);
        tw0_0.RE0.d00(true, (byte) 4, (short) 1528, 0.0f);
    }
}
