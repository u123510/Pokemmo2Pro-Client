package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Texture;
import java.util.Iterator;

public class WeatherOverlayMeshRenderer extends BaseMapMeshRenderer {
    public na_0 Fn;
    public ER de;
    public final cn0_0 xD0;
    public final Ou0 Zx;
    public Ou0 wK0;
    public final i4_0 jr;
    public final Texture qr0;

    public WeatherOverlayMeshRenderer(cb_0 v1, cn0_0 v2) {
        super(v1);
        this.xD0 = v2;
        Ou0 ou = fi_0.xL().eh();
        this.Zx = ou;
        i4_0 i4 = new i4_0(4, 4, ix0_0.Vp0);
        this.jr = i4;
        i4.K7(1.0F, 1.0F, 1.0F, 0.95F);
        i4.kd();
        Texture tex = new Texture(i4);
        this.qr0 = tex;
        mz_2 mz = (mz_2) ((BM) ou.Y3.get(0)).Qy(mz_2.g7);
        mz.R4(new LPT6_(tex));
    }

    @Override
    public final void j80(U5 v1, ER v2, BJ0 v3) {
        if (this.Fn == null) {
            int width = lg_0.S4.Kr0();
            if (width > sx_1.jg0) {
                width = sx_1.jg0;
            }
            int height = lg_0.S4.sD0();
            if (height > sx_1.jg0) {
                height = sx_1.jg0;
            }
            this.Fn = new na_0(ix0_0.Vw, width, height, true);
            this.de = new ER(new XB(), new FG());
        }

        this.Fn.synchronized$();
        lg_0.OH0.glClearColor(0.0F, 0.0F, 0.0F, 0.016666668F);
        lg_0.OH0.glClear(16640);
        this.de.jK(v3);
        Iterator iter = tw0_0.e60.pn0.values().iterator();
        while (iter.hasNext()) {
            this.QX((bi0_1) iter.next());
        }
        this.QX(tw0_0.e60.jB0);
        this.de.end();
        this.Fn.end();

        Texture currentTex = this.xD0.Rp;
        lq_2 fboTex = (lq_2) this.Fn.f1.KI();
        if (currentTex == null || currentTex != fboTex) {
            this.xD0.Rp = (Texture) fboTex;
        }

        super.j80(v1, v2, v3);
    }

    @Override
    public final void dispose() {
        super.dispose();
        if (this.de != null && this.de.KF instanceof uu_0) {
            ((uu_0) this.de.KF).dispose();
        }
        if (this.Fn != null) {
            this.Fn.dispose();
        }
        this.xD0.Rp = null;
        this.jr.dispose();
        this.qr0.dispose();
    }

    public final void sn0(short[] v1) {
        if (v1.length < 1) {
            return;
        }
        if (v1[0] == 4465) {
            if (this.wK0 != null) {
                this.wK0.O4();
                this.y50.sj0(this.wK0, true);
            }
            short i0 = (short) (v1[1] + 116);
            short i1 = v1[2];
            short i2 = v1[3];
            fi_0.xL().getClass();
            v80_0.Cb0().getClass();
            this.wK0 = v80_0.CW(fi_0.xL().LM[3], i0, new int[0]);
            this.wK0.ho.m80(((float) i1) * 0.25F + 0.125F, 0.0F, ((float) i2) * 0.25F);
            this.wK0.Th();
            this.wK0.rF0();
            this.y50.Ue0(this.wK0);
        }
    }

    public final void QX(bi0_1 v1) {
        if (v1 == null) {
            return;
        }
        Ou0 ou = this.Zx;
        C8 pos = v1.uR().ze0;
        ou.ho.F();
        ou.ho.el0(pos.x, pos.y, pos.z);
        ou.ho.el0(0.0F, -0.25F, 0.0F);

        byte dir = v1.ba0.Y30;
        int stepX = 0;
        int stepZ = 0;
        for (int step = 1; step < 5; step++) {
            stepX = v1.ba0.Lq0;
            stepZ = v1.ba0.B5;
            switch (dir) {
                case 0:
                    stepZ += step;
                    break;
                case 1:
                    stepZ -= step;
                    break;
                case 2:
                    stepX -= step;
                    break;
                case 3:
                    stepX += step;
                    break;
                default:
                    break;
            }
            LT lt = tw0_0.e60.N60().Fn(stepX, stepZ, v1.ba0.JT);
            if (lt == null || lt.LPt1() || tw0_0.e60.Vm0(v1.ba0.JT, lt)) {
                break;
            }
            if (v1.CI0()) {
                E90 jB0 = tw0_0.e60.jB0;
                if (jB0 != null && jB0.a1(v1.ba0.JT, lt)) {
                    break;
                }
            }
        }

        float f1 = 1.0F;
        switch (dir) {
            case 0:
                f1 = ((float) stepZ) * 0.25F - pos.z;
                break;
            case 1:
                f1 = pos.z - ((float) (stepZ + 1)) * 0.25F;
                break;
            case 2:
                f1 = pos.x - ((float) (stepX + 1)) * 0.25F;
                break;
            case 3:
                f1 = ((float) stepX) * 0.25F - pos.x;
                break;
            default:
                break;
        }

        f1 = Math.min(f1, 0.75F);
        switch (dir) {
            case 0:
                ou.ho.el0(0.0F, 0.0F, f1);
                ou.ho.tO(C8.X, -90.0F);
                ou.ho.tO(C8.Y, 180.0F);
                ou.ho.w2(0.75F, f1, 0.75F);
                break;
            case 1:
                ou.ho.el0(0.0F, -0.1F, -f1 - 0.2F);
                ou.ho.tO(C8.X, 90.0F);
                ou.ho.tO(C8.Y, 180.0F);
                ou.ho.w2(0.75F, f1, 0.75F);
                break;
            case 2:
                ou.ho.el0(-f1 - 0.1F, 0.0F, 0.0F);
                ou.ho.tO(C8.Z, -90.0F);
                ou.ho.tO(C8.Y, 270.0F);
                ou.ho.w2(0.75F, f1, 0.75F);
                break;
            case 3:
                ou.ho.el0(f1 + 0.1F, 0.0F, 0.0F);
                ou.ho.tO(C8.Z, 90.0F);
                ou.ho.tO(C8.Y, 15.0F);
                ou.ho.w2(0.75F, f1, 0.75F);
                break;
            default:
                break;
        }

        this.de.eo0(ou);
    }
}
