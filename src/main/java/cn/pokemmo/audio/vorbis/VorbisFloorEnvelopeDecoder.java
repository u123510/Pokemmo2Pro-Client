package cn.pokemmo.audio.vorbis;

import f.*;

public class VorbisFloorEnvelopeDecoder implements MJ0 {
    public static final float[] YL0 = new float[]{
            2.0f, 1.587401f, 1.2599211f, 1.0f, 0.7937005f, 0.62996054f, 0.5f, 0.39685026f, 0.31498027f, 0.25f,
            0.19842513f, 0.15749013f, 0.125f, 0.099212565f, 0.07874507f, 0.0625f, 0.049606282f, 0.039372534f, 0.03125f, 0.024803141f,
            0.019686267f, 0.015625f, 0.012401571f, 0.009843133f, 0.0078125f, 0.0062007853f, 0.0049215667f, 0.00390625f, 0.0031003926f, 0.0024607833f,
            0.001953125f, 0.0015501963f, 0.0012303917f, 9.765625E-4f, 7.750982E-4f, 6.151958E-4f, 4.8828125E-4f, 3.875491E-4f, 3.075979E-4f, 2.4414062E-4f,
            1.937745E-4f, 1.53799E-4f, 1.2207031E-4f, 9.68873E-5f, 7.68995E-5f, 6.1035156E-5f, 4.84436E-5f, 3.84497E-5f, 3.0517578E-5f, 2.42218E-5f,
            1.92249E-5f, 1.5258789E-5f, 1.21109E-5f, 9.6124E-6f, 7.6293945E-6f, 6.0555E-6f, 4.8062E-6f, 3.8146973E-6f, 3.0277E-6f, 2.4031E-6f,
            1.9073486E-6f, 1.5139E-6f, 1.2016E-6f, 0.0f
    };

    public kk_1 p4;
    public c50_0 uR;
    public B7 Rm;
    public B7 rc;
    public bn_1 o4;
    public int A9;
    public int Si0;
    public int mv;
    public Tn[] uP;
    public final AE0 z30 = new AE0();

    public VorbisFloorEnvelopeDecoder() {
    }

    @Override
    public final void a7() {
        this.mv = this.uR.yZ;
        this.uP = new Tn[32];
        this.Si0 = this.uR.fJ;
        Ic();
        for (int i = 0; i < this.mv; i++) {
            this.uP[i].uf0(this.p4, this.uR, this.z30);
        }
        TE();
        if (this.z30 == null) {
            c50_0 c50_0Var = this.uR;
            short s = c50_0Var.wA0;
            short s2 = c50_0Var.cz.iO;
            c50_0Var.cz.iO = -1;
            if (s2 != s) {
                return;
            }
        }
        for (int i = 0; i < this.mv; i++) {
            this.uP[i].zC0(this.p4, this.uR);
        }
        boolean z = false;
        boolean z2 = false;
        int i3 = this.uR.fJ;
        do {
            for (int i = 0; i < this.mv; i++) {
                z = this.uP[i].Rb(this.p4);
            }
            do {
                for (int i = 0; i < this.mv; i++) {
                    z2 = this.uP[i].po0(this.A9, this.Rm, this.rc);
                }
                this.Rm.d9(this.o4);
                if (this.A9 == 0 && i3 != 3) {
                    this.rc.d9(this.o4);
                }
            } while (!z2);
        } while (!z);
    }

    public void Ic() {
        int i = this.Si0;
        if (i == 3) {
            for (int i2 = 0; i2 < this.mv; i2++) {
                this.uP[i2] = new V4(i2);
            }
        } else if (i == 1) {
            int i2 = 0;
            while (i2 < this.uR.zg0) {
                this.uP[i2] = new lg0_1(i2);
                i2++;
            }
            while (i2 < this.mv) {
                this.uP[i2] = new PA0(i2);
                i2++;
            }
        } else {
            for (int i2 = 0; i2 < this.mv; i2++) {
                this.uP[i2] = new lg0_1(i2);
            }
        }
    }

    public void TE() {
    }
}
