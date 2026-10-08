package cn.pokemmo.ui.window.misc;

import f.*;

import com.badlogic.gdx.graphics.Texture;

/**
 * 地图缩略图小窗
 *
 * 原混淆类: f.JV
 */
public class MapPreviewWindow extends R90 implements tr_1  {
    public final JV asBridge() {
        return (JV) (Object) this;
    }

    public final byte si;
    public int dK;
    public final Texture qN;
    public final S70 uq;
    public final S70[] Xe0;

    public MapPreviewWindow(byte value, short layout) {
        super();
        this.uf("base-frame-padded");
        this.Hy("");
        this.ff0(1);
        this.bD(false);
        this.Pb0(this::is);
        this.si = value;

        FJ source = new FJ(tw0_0.Ll0.t1.nuL().COM7("/a/1/7/4"));
        Tt0 first = new Tt0(source.EG(15));
        Gt0 second = new Gt0(source.EG(16));
        i4_0 composite = new IA0(source.EG(17)).dB(first, second);
        i4_0 textureData = new i4_0(144, 48, composite.rH0());
        textureData.dw0(composite, 56, 64, 144, 48);
        this.qN = new Texture(textureData);
        this.uq = new S70();
        this.uq.JH().LX(this.qN);
        this.SL(this.uq);
        composite.dispose();
        textureData.dispose();

        byte[] icons;
        if (layout == 1) {
            icons = new byte[]{11, 8, 6, 7, 19};
        } else if (layout == 2) {
            icons = new byte[]{22, 0, 19, 4, 17};
        } else if (layout == 3) {
            icons = new byte[]{7, 14, -1, 14, 7};
        } else {
            icons = new byte[]{4, 18, 2, 0, 15, 4};
        }
        this.Xe0 = new S70[icons.length];
        for (int i = 0; i < icons.length; ++i) {
            S70 icon = new S70();
            this.Xe0[i] = icon;
            if (icons[i] != -1) {
                icon.JH().o60(QL(icons[i])[0]);
            }
            icon.JH().nq0(36, 36);
            this.SL(icon);
        }
        this.Xq();
    }

    public static AG0[] QL(byte value) {
        return yh_0.Xm0.qC0(yh_0.Ed(value, (short) 201), (byte) 0, false);
    }

    public final void is() {
        BU.T50.u3(this);
        tw0_0.rl.ze0(this.si, (byte) 0);
    }

    public final void C(zk0_1 viewport) {
        lpt6__0.v90(this);
        this.Xq();
        le0_2 parent = this.K20;
        int x = kq_0.lpT2(parent.a3(), this.Mx, 2, parent.A20 + parent.e80);
        this.E40(x, kq_0.lpT2(parent.k5(), this.OB, 4, parent.SB0 + parent.y9));
    }

    public final boolean nd0(i70_0 event) {
        if (E00.ZU(event.zu) && event.iT()) {
            int key = event.finally$;
            rp_0 first = rp_0.nK0;
            if ((first != null && first.Ov(key)) || (rp_0.sJ0 != null && rp_0.sJ0.Ov(key))) {
                this.is();
                return true;
            }
        }
        return super.nd0(event);
    }

    public final void HP(zk0_1 value) {
        super.HP(value);
    }

    public final void Xq() {
        int width = (int) (tw0_0.LD0.Hv0() * 0.75);
        this.dK = Math.min((int) (tw0_0.LD0.ew0() * 0.75) / 144, width / 48);
        if (this.dK < 1) {
            this.dK = 1;
        }
        this.RY(this.dK * 144 + 3, this.dK * 48 + 2);
        this.oY(this.dK * 144 + 3, this.dK * 48 + 2);
    }

    public final void K8() {
        this.Xq();
        super.K8();
        this.uq.E40(this.A20 + this.e80 + 2, this.SB0 + this.y9);
        this.uq.og.EJ0 = this.dK;
        int totalWidth = this.Xe0.length * 36 / 2 * this.dK;
        int x = (this.a3() - totalWidth) / 2 + this.A20 + this.e80 - this.dK * 18 / 2;
        for (int i = 0; i < this.Xe0.length; ++i) {
            this.Xe0[i].E40(i * 36 / 2 * this.dK + x,
                    (int) ((float) this.OB / 2.5f + this.SB0 + this.y9 - (float) (this.dK * 36 / 2)));
            this.Xe0[i].og.EJ0 = this.dK;
        }
    }

    public final void t5() {
        super.t5();
        this.qN.dispose();
    }
}
