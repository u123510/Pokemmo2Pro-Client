package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Texture;
import java.util.Iterator;

public class ParticleAnchorMeshRenderer extends BaseMapMeshRenderer {
    public na_0 rp0;
    public ER pk0;
    public final cn0_0 G10;
    public final es_1 Ux;
    public final cf_2 jF0;
    public boolean K4;
    public final Ou0 COm4;

    public ParticleAnchorMeshRenderer(hm_0 hm_02, cn0_0 cn0_02) {
        super(hm_02);
        this.jF0 = new cf_2();
        this.K4 = false;
        this.G10 = cn0_02;
        this.Ux = new es_1(6);

        v80_0.Cb0().getClass();
        Ou0 ou0 = v80_0.sb((byte) 4, 124, false);
        ou0.ho.m80(2.625f, -0.2f, 2.875f);
        ou0.ho.tO(C8.X, -75.0f);
        ou0.sY = false;
        ou0.PE0 = 0.66f;
        ou0.TU(0, true);
        this.Ux.Ue0(ou0);
        this.yS(ou0);

        v80_0.Cb0().getClass();
        Ou0 ou02 = v80_0.sb((byte) 4, 125, false);
        ou02.ho.m80(4.125f, -0.2f, 13.125f);
        ou02.ho.tO(C8.X, -75.0f);
        ou02.sY = false;
        ou02.PE0 = 0.66f;
        ou02.TU(0, true);
        this.Ux.Ue0(ou02);
        this.yS(ou02);

        v80_0.Cb0().getClass();
        Ou0 ou03 = v80_0.sb((byte) 4, 157, false);
        this.COm4 = ou03;
        ou03.ho.m80(3.625f, 0.0f, 13.125f);
        ou03.Ni(ParticleAnchorMeshRenderer::X5);
        ou03.TU(0, true);
        this.yS(ou03);
    }

    public static boolean X5() {
        BR bR = tw0_0.rl;
        if (bR != null) {
            return bR.yh0.Ny((byte) 4, (short) 1364);
        }
        return false;
    }

    public final void j80(U5 u5, ER eR, BJ0 bJ0) {
        if (this.rp0 != null && lg_0.lW.nI0(135)) {
            this.rp0.dispose();
            ((uu_0) this.pk0.KF).dispose();
            this.rp0 = null;
        }

        if (this.rp0 == null) {
            this.rp0 = new na_0(ix0_0.Vw, (int) bJ0.Ui, (int) bJ0.yG, true);
            String string = ab0_1.i0.bC0("invert.fragment.glsl").gd0(null);
            String string2 = ab0_1.i0.bC0("default.vertex.glsl").gd0(null);
            this.pk0 = new ER(new XB(string2, string), new FG());
        }

        this.rp0.synchronized$();
        lg_0.OH0.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        lg_0.OH0.glClear(16640);
        this.pk0.jK(bJ0);

        I2 i2 = this.Ux.ZD();
        while (i2.hasNext()) {
            Ou0 ou0 = (Ou0) i2.next();
            this.pk0.eo0(ou0);
        }

        com7__4 com7__42 = this.jF0.K00();
        com7__42.getClass();
        while (com7__42.hasNext()) {
            i10_0 i10_02 = (i10_0) com7__42.next();
            if (i10_02.IU != ng0_2.xc0) {
                this.pk0.eo0(i10_02.Su0);
            }
        }

        this.pk0.end();
        this.rp0.end();

        Texture texture = this.G10.Rp;
        if (texture == null || texture != (Texture) (lq_2) this.rp0.f1.KI()) {
            this.G10.SA0 = 0.035f;
            this.G10.g80.x = 0.5f;
            this.G10.g80.y = 0.425f;
            this.G10.Rp = (Texture) (lq_2) this.rp0.f1.KI();
        }

        eR.Lh0(this.COm4, u5);
    }

    @Override
    public final void dispose() {
        super.dispose();
        ((uu_0) this.pk0.KF).dispose();
        this.rp0.dispose();
        this.G10.SA0 = 0.045f;
        this.G10.g80.x = 0.5f;
        this.G10.g80.y = 0.5f;
        this.G10.Rp = null;
    }

    @Override
    public final void lpt1(float f) {
        I2 i2 = this.Ux.ZD();
        while (i2.hasNext()) {
            ((Ou0) i2.next()).bo0(f);
        }

        com7__4 com7__42 = this.jF0.K00();
        com7__42.getClass();
        while (com7__42.hasNext()) {
            ((i10_0) com7__42.next()).Su0.bo0(f);
        }

        Iterator iterator = tw0_0.e60.pn0.values().iterator();
        while (iterator.hasNext()) {
            bi0_1 bi0_12 = (bi0_1) iterator.next();
            if (!(bi0_12 instanceof MO) || bi0_12.ki0() != 219) {
                continue;
            }
            MO mO = (MO) bi0_12;
            i10_0 i10_02 = (i10_0) this.jF0.vC(mO.pu, null);
            if (i10_02 == null) {
                v80_0.Cb0().getClass();
                Ou0 ou0 = v80_0.sb((byte) 4, 126, false);
                ou0.sY = false;
                ou0.PE0 = 0.66f;
                ou0.sC0(0, true, null);
                ou0.rF0();
                this.y50.Ue0(ou0);
                i10_02 = new i10_0(ou0);
                this.jF0.n3(mO.pu, i10_02);
            }

            if (this.K4 && i10_02.IU == ng0_2.xc0) {
                i10_02.IU = ng0_2.Lk0;
            }

            if (mO.Nf0 == -1 && i10_02.IU == ng0_2.GJ0 && tw0_0.LD0.he0 != null) {
                i10_02.IU = ng0_2.xc0;
            }

            C8 c8 = mO.hj.ze0;
            i10_02.Su0.ho.Yp0(c8.x, -0.5f, c8.z + 0.75f);
            i10_02.Su0.ho.tO(C8.X, -75.0f);
        }

        this.K4 = false;
        super.lpt1(f);
    }

    @Override
    public final void sn0(short[] sArray) {
        if (sArray.length < 1) {
            return;
        }
        if (sArray[0] == 4707) {
            this.K4 = true;
        }
    }
}
