package cn.pokemmo.world.chunk;

import f.*;

/**
 * 现代化重构类 - 原始类: f.sf_1
 */
public class ChunkBoundsResource implements fy0_0 {

    public static final C8 UR;
    public static final C8 Fa;
    public final byte O20;
    public final MG0 Mh;
    public final int bK;
    public final int Vf;
    public pc0_0 Zw0;
    public final C8 oN;
    public final me0_2 ZF0;
    public final C8 MF0;
    public W70 u00;
    public Ou0 lPT3;

    static {
        UR = new C8();
        Fa = new C8();
        new C8();
        Cq0.E1(ChunkBoundsResource.class);
    }

    public ChunkBoundsResource(byte b, MG0 mg0, int i, int i2) {
        this.oN = new C8();
        this.ZF0 = new me0_2();
        this.MF0 = new C8(4.0f, 4.0f, 4.0f);
        this.O20 = b;
        this.Mh = mg0;
        this.bK = i;
        this.Vf = i2;
    }

    public final void Sy0() {
        if (this.lPT3 == null) {
            return;
        }
        C8 pos = new C8();
        C8 scale = new C8();
        pc0_0 pc0_0Var = this.Zw0;
        if (pc0_0Var != null) {
            pc0_0Var.ho.V1(pos);
            this.Zw0.ho.qs0(scale);
        } else {
            pos.rB0();
            scale.x = 1.0f;
            scale.y = 1.0f;
            scale.z = 1.0f;
        }
        C8 u = UR;
        C8 np = u.np(this.oN);
        np.x *= scale.x;
        np.y *= scale.y;
        np.z *= scale.z;
        np.na(pos.x, pos.y, pos.z);
        C8 f = Fa;
        C8 np2 = f.np(this.MF0);
        np2.x *= scale.x;
        np2.y *= scale.y;
        np2.z *= scale.z;
        this.lPT3.ho.oF0(u, this.ZF0, f);
        this.lPT3.a8();
    }

    public final Ou0 HJ0() {
        if (this.lPT3 == null) {
            W70 w70 = this.u00;
            byte b = this.O20;
            w70.getClass();
            MG0 mg0 = this.Mh;
            int i = this.bK;
            int i2 = this.Vf;
            Ou0 ou0 = null;
            if (b == 2) {
                nj0_0 nj0_0Var = tw0_0.Ll0.Qz0;
                an_0 an_0Var = nj0_0Var.fx.wM(mg0, i).hW;
                am_2 am_2Var = nj0_0Var.EL0(mg0, i);
                JC0 jc0 = (JC0) an_0Var.i8.get(Short.valueOf((short) i2));
                jc0.ZJ();
                pc_1 pc_1Var = new pc_1();
                w70.vc0.Ue0(pc_1Var);
                pc_1Var.Od0(jc0.iK0.KV[0], am_2Var);
                v80_0.fo0(jc0.iK0.KV[0], am_2Var);
                v80_0 v80_0Var = v80_0.Cb0();
                vt_0 vt_0Var = jc0.iK0.KV[0];
                es_1 es_1Var = jc0.JA;
                boolean z = mg0 == MG0.Wk0;
                v80_0Var.getClass();
                ou0 = v80_0.a40(vt_0Var, pc_1Var, am_2Var, es_1Var, 1.0f, z, false);
                jc0.iK0 = null;
                jc0.JA.clear();
                jc0.Di0 = false;
            } else if (b == 3) {
                ou0 = ok0_2.gm(C8.Zero, 1.0f, i2);
            } else if (b == 4) {
                ou0 = ok0_2.coM9(C8.Zero, 1.0f, i2, mg0 == MG0.rm);
            }
            this.lPT3 = ou0;
            Sy0();
        }
        return this.lPT3;
    }

    @Override
    public final void dispose() {
        Ou0 ou0 = this.lPT3;
        if (ou0 != null) {
            ou0.O4();
        }
    }
}
