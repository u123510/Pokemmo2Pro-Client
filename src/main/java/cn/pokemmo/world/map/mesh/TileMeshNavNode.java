package cn.pokemmo.world.map.mesh;

import f.*;

public class TileMeshNavNode {
    public final BP FB0;
    public final Ou0 ge;
    public final C8 v50;
    public final Ll0 ph;
    public final LT[] ws0;
    public final pd0_1[] te0;
    public final boolean[] qm0;
    public byte JI;
    public float tJ;
    public bi0_1 Jq0;
    public pd0_1 sQ;
    public boolean qN;
    public byte UF;
    public final kq0_0 H90;

    public TileMeshNavNode(kq0_0 v1, BP v2, Ou0 v3) {
        this.H90 = v1;
        LT[] ws0_arr = new LT[4];
        this.ws0 = ws0_arr;
        this.te0 = new pd0_1[4];
        this.qm0 = new boolean[4];
        this.JI = 0;
        this.tJ = 0.0f;
        this.Jq0 = null;
        this.sQ = null;
        this.qN = false;
        this.UF = 0;
        this.FB0 = v2;
        this.ge = v3;

        C8 v50_ = new C8();
        this.v50 = v50_;
        v3.ho.V1(v50_);

        cb_0 v3_cb = (cb_0) v1.WK;
        this.ph = v3_cb.fm((float) v2.tH0, (float) v2.Dk0, (float) v2.Su0, null);
        ws0_arr[0] = v3_cb.fm((float) v2.tH0 + 0.5f, (float) (v2.Dk0 + 2) + 0.5f, (float) v2.Su0, null);
        ws0_arr[1] = v3_cb.fm((float) v2.tH0 + 0.5f, (float) (v2.Dk0 - 2) + 0.5f, (float) v2.Su0, null);
        ws0_arr[3] = v3_cb.fm((float) (v2.tH0 + 2) + 0.5f, (float) v2.Dk0 + 0.5f, (float) v2.Su0, null);
        ws0_arr[2] = v3_cb.fm((float) (v2.tH0 - 2) + 0.5f, (float) v2.Dk0 + 0.5f, (float) v2.Su0, null);

        byte[] jv0 = t70_0.jv0;
        for (byte b : jv0) {
            this.ws0[b].Mw(new CJ(v1, (pd0_1) this, b));
        }

        if (v2.zj0 != 2) {
            this.ph.Mw(new CJ(v1, (pd0_1) this, (byte) -1));
        }
    }

    public final void zg(byte i1, pd0_1 v2) {
        this.te0[i1] = v2;
        this.qm0[i1] = true;
        v2.te0[t70_0.Kc0(i1)] = (pd0_1) this;
    }

    public final pd0_1 k0(byte i1, bi0_1 v2, boolean i3) {
        if (i1 == -1) {
            return null;
        }
        if (this.JI != 0) {
            return null;
        }
        pd0_1 v4 = this.te0[i1];
        if (v4 == null) {
            return null;
        }
        if (!this.qm0[i1]) {
            return v4.k0(t70_0.Kc0(i1), v2, false);
        }
        this.JI = 1;
        this.tJ = 0.5f;
        this.sQ = v4;
        this.qN = i3;
        this.UF = i1;
        this.Jq0 = v2;
        return (pd0_1) this;
    }

    public final void nA0() {
        C8 v1 = kq0_0.Id;
        v1.x = 0.0f;
        v1.y = 0.125f;
        v1.z = 0.25f;
        switch (this.UF) {
            case 0:
                v1.y = 0.625f;
                break;
            case 1:
                v1.y = -0.375f;
                break;
            case 2:
                v1.x = -0.5f;
                break;
            case 3:
                v1.x = 0.5f;
                break;
            default:
                break;
        }
        bi0_1 v2 = this.Jq0;
        if (v2 != null) {
            v2.il0.f60(this.ge, false, v1);
        }
    }
}
