package cn.pokemmo.graphics.model;

import f.*;

public class ModelNodeTransformController {
    public static final nb_2 Com5;
    public static final cd0_0 VK;
    public final GB gs;
    public boolean um;
    public final cn.pokemmo.graphics.gdx.model.GdxModelInstance iJ0;

    static {
        Com5 = new nb_2();
        VK = new cd0_0();
    }

    public ModelNodeTransformController(cn.pokemmo.graphics.gdx.model.GdxModelInstance v1) {
        super();
        this.gs = new GB();
        this.um = false;
        this.iJ0 = v1;
    }

    public static final int IM(float f0, es_1 v1) {
        int i2 = v1.KB - 1;
        if (i2 <= 0 || f0 < ((li0_2) v1.get(0)).Ls0 || f0 > ((li0_2) v1.get(i2)).Ls0) {
            return 0;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (i3 + i2) / 2;
            int i5 = i4 + 1;
            if (f0 > ((li0_2) v1.get(i5)).Ls0) {
                i3 = i5;
            } else if (f0 < ((li0_2) v1.get(i4)).Ls0) {
                i2 = i4 - 1;
            } else {
                return i4;
            }
        }
        return i3;
    }

    public static final cd0_0 Jf(yg0_0 v0, float f1) {
        cd0_0 v2 = VK;
        C8 trans = v2.l6;
        es_1 tk = v0.TK;
        if (tk == null) {
            trans.np(v0.Cr.BI0);
        } else if (tk.KB == 1) {
            trans.np((C8) ((li0_2) tk.get(0)).Yo);
        } else {
            int idx = IM(f1, tk);
            li0_2 first = (li0_2) v0.TK.get(idx);
            trans.np((C8) first.Yo);
            int nextIdx = idx + 1;
            if (nextIdx < v0.TK.KB) {
                li0_2 second = (li0_2) v0.TK.get(nextIdx);
                float alpha = (f1 - first.Ls0) / (second.Ls0 - first.Ls0);
                trans.JA((C8) second.Yo, alpha);
            }
        }

        me0_2 rot = v2.M30;
        es_1 rk = v0.l;
        if (rk == null) {
            rot.CA0(v0.Cr.RG);
        } else if (rk.KB == 1) {
            rot.CA0((me0_2) ((li0_2) rk.get(0)).Yo);
        } else {
            int idx = IM(f1, rk);
            li0_2 first = (li0_2) v0.l.get(idx);
            rot.CA0((me0_2) first.Yo);
            int nextIdx = idx + 1;
            if (nextIdx < v0.l.KB) {
                li0_2 second = (li0_2) v0.l.get(nextIdx);
                float alpha = (f1 - first.Ls0) / (second.Ls0 - first.Ls0);
                rot.ZI((me0_2) second.Yo, alpha);
            }
        }

        C8 scale = v2.M2;
        es_1 sk = v0.HG;
        if (sk == null) {
            scale.np(v0.Cr.Fc0);
        } else if (sk.KB == 1) {
            scale.np((C8) ((li0_2) sk.get(0)).Yo);
        } else {
            int idx = IM(f1, sk);
            li0_2 first = (li0_2) v0.HG.get(idx);
            scale.np((C8) first.Yo);
            int nextIdx = idx + 1;
            if (nextIdx < v0.HG.KB) {
                li0_2 second = (li0_2) v0.HG.get(nextIdx);
                float alpha = (f1 - first.Ls0) / (second.Ls0 - first.Ls0);
                scale.JA((C8) second.Yo, alpha);
            }
        }
        return v2;
    }

    public static void Ux0(nb_2 v0, GB v1, float f2, ji0_2 v3, float f4) {
        if (v0 == null) {
            I2 iter = v3.jl.ZD();
            while (iter.hasNext()) {
                yg0_0 nodeAnim = (yg0_0) iter.next();
                Xz0 node = nodeAnim.Cr;
                node.Jq = true;
                cd0_0 transform = Jf(nodeAnim, f4);
                node.TJ0.oF0(transform.l6, transform.M30, transform.M2);
            }
            return;
        }

        us0_0 nodeIter = v0.mC0();
        nodeIter.getClass();
        while (nodeIter.hasNext()) {
            Xz0 node = (Xz0) nodeIter.next();
            node.Jq = false;
        }

        I2 animIter = v3.jl.ZD();
        while (animIter.hasNext()) {
            yg0_0 nodeAnim = (yg0_0) animIter.next();
            Xz0 node = nodeAnim.Cr;
            node.Jq = true;
            cd0_0 transform = Jf(nodeAnim, f4);
            int idx = v0.Va(node);
            cd0_0 existingTransform = (idx >= 0) ? (cd0_0) v0.Pr[idx] : null;
            if (existingTransform != null) {
                if (f2 > 0.99999899f) {
                    existingTransform.W80(transform.l6, transform.M30, transform.M2);
                } else {
                    existingTransform.l6.JA(transform.l6, f2);
                    existingTransform.M30.ZI(transform.M30, f2);
                    existingTransform.M2.JA(transform.M2, f2);
                }
            } else if (f2 > 0.99999899f) {
                cd0_0 pooled = (cd0_0) v1.obtain();
                pooled.W80(transform.l6, transform.M30, transform.M2);
                v0.WK0(node, pooled);
            } else {
                cd0_0 pooled = (cd0_0) v1.obtain();
                pooled.W80(node.BI0, node.RG, node.Fc0);
                pooled.l6.JA(transform.l6, f2);
                pooled.M30.ZI(transform.M30, f2);
                pooled.M2.JA(transform.M2, f2);
                v0.WK0(node, pooled);
            }
        }

        a60_0 entries = v0.lb0();
        entries.getClass();
        while (entries.hasNext()) {
            xn_1 entry = (xn_1) entries.next();
            Xz0 node = (Xz0) entry.I20;
            if (!node.Jq) {
                node.Jq = true;
                cd0_0 transform = (cd0_0) entry.kM;
                transform.l6.JA(node.BI0, f2);
                transform.M30.ZI(node.RG, f2);
                transform.M2.JA(node.Fc0, f2);
            }
        }
    }
}
