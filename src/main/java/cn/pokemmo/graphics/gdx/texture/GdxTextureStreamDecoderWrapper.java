package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;

public class GdxTextureStreamDecoderWrapper extends u4_0 {
    public static final ev_1 nl0;
    public static final et_0 PrN;
    public static final fj_0 YB;
    public byte AUX;

    static {
        fj_0 fj_0 = new fj_0(ix0_0.Vw);
        YB = fj_0;
        fj_0.bI(Color.BLACK);
        fj_0.XF.DP(fj_0.Je0);
        nl0 = new ev_1(fj_0);

        et_0 et_0 = new et_0(ix0_0.Vw);
        PrN = et_0;
        et_0.bI(Color.WHITE);
        et_0.XF.DP(et_0.Je0);
        new ev_1(et_0);
    }

    public GdxTextureStreamDecoderWrapper() {
        super(0);
    }

    public GdxTextureStreamDecoderWrapper(byte b, vt_0 vt_0, am_2 am_2) {
        this.AUX = b;
        Od0(vt_0, am_2);
    }

    public GdxTextureStreamDecoderWrapper(byte b, vt_0 vt_0, am_2 am_2, int i) {
        this.AUX = b;
        this.kh = i;
        Od0(vt_0, am_2);
    }

    public i4_0 Qw0(vt_0 vt_0, am_2 am_2, int i) {
        JO jo = (JO) vt_0.mT.get(i);
        if (this.QR.fl(jo.QW)) {
            return null;
        }
        if (jo.QW == null) {
            v80_0.lA0.getClass();
            return null;
        }
        String str = jo.nf0;
        if (str == null) {
            v80_0.lA0.getClass();
            i4_0 i4_0 = this.AUX == 4 ? PrN : YB;
            if (this.AUX == -1 && "tt_tabletop".equals(vt_0.QW)) {
                return PrN;
            }
            return i4_0;
        }
        String str2 = jo.kc0;
        Integer num = (Integer) am_2.mw.Wk0(str);
        Integer num2 = (Integer) am_2.J80.Wk0(str2);
        if (num == null || num2 == null) {
            v80_0.lA0.getClass();
            return null;
        }
        if (this.kh == 6 && num.intValue() == 51 && num2.intValue() == 48 && c8_0.JD0.YG() != 3) {
            num = 50;
        }
        pv_0 pv_0 = (pv_0) ((be0_1) am_2.ib0.Ks.get(num.intValue()));
        gb_0 gb_0 = (gb_0) ((be0_1) am_2.CoM5.Ks.get(num2.intValue()));
        jo.hr = pv_0.bh0.ei0;
        jo.Qu0 = pv_0.Eq;

        ru0_0 ru0_0 = tw0_0.KW;
        if (ru0_0 != null && !ru0_0.yG0.isEmpty()) {
            return null;
        }

        i4_0 i4_02;
        if (jj0_2.cy(this.AUX, c8_0.JD0.YG(), this.kh, gb_0.a00)) {
            int[] SC0 = jj0_2.SC0(this.AUX, am_2, c8_0.JD0.YG(), this.kh, num.intValue(), gb_0.a00);
            i4_02 = am_2.Rd((pv_0) ((be0_1) am_2.ib0.Ks.get(num.intValue())), SC0);
        } else {
            i4_02 = am_2.Rt0(num.intValue(), num2.intValue());
        }
        if (i4_02 == null) {
            v80_0.lA0.getClass();
            return null;
        }

        long j = jo.jo;
        int sx = (int) (((j >> 18) & 1L) + 1L);
        int sy = (int) (((j >> 19) & 1L) + 1L);
        if (sx != 1 || sy != 1) {
            int w = i4_02.XF.SH * sx;
            int h = i4_02.XF.mB0 * sy;
            i4_0 i4_03 = new i4_0(w, h, i4_02.rH0());
            i4_03.Pa0(DF0.Ha0);
            i4_03.NH0(i4_02, 0, 0);
            int flipX = 0;
            int flipY = 0;
            if (((jo.jo >> 16) & 1L) == 1L && ((jo.jo >> 18) & 1L) == 1L) {
                fp_2.A90(i4_02, i4_03, i4_02.XF.SH, 0, true, false);
                flipX = 1;
            }
            if (((jo.jo >> 17) & 1L) == 1L && ((jo.jo >> 19) & 1L) == 1L) {
                fp_2.A90(i4_02, i4_03, 0, i4_02.XF.mB0, false, true);
                flipY = 1;
            }
            if (flipX != 0 && flipY != 0) {
                fp_2.A90(i4_02, i4_03, i4_02.XF.SH, i4_02.XF.mB0, true, true);
            }
            i4_02.dispose();
            i4_02 = i4_03;
        }

        if (tt0_0.C7()) {
            this.Wj0.WK0(jo.QW, num);
            this.bb.WK0(jo.QW, num2);
            if (!this.F3.fl(Integer.valueOf(gb_0.a00))) {
                this.F3.WK0(Integer.valueOf(gb_0.a00), new es_1());
            }
            ((es_1) this.F3.Wk0(Integer.valueOf(gb_0.a00))).Ue0(jo.QW);
        }
        return i4_02;
    }

    public final void Od0(vt_0 vt_0, am_2 am_2) {
        if (tt0_0.C7()) {
            this.Ak0 = am_2;
        }
        for (int i = 0; i < vt_0.mT.KB; i++) {
            i4_0 Qw0 = Qw0(vt_0, am_2, i);
            if (Qw0 != null) {
                JO jo = (JO) vt_0.mT.get(i);
                Texture texture = new Texture(new S60(Qw0, null, false, false, false));
                texture.setFilter(eb0_1.Y30, eb0_1.Y30);
                texture.setWrap(a00_0.xm0, a00_0.xm0);
                Qw0.dispose();
                Texture texture2 = (Texture) this.QR.WK0(jo.QW, texture);
                if (texture2 != null) {
                    texture2.dispose();
                }
            }
        }
    }

    public final Texture De0(String str) {
        if (this.QR.Wk0(str) != null) {
            return (Texture) this.QR.Wk0(str);
        }
        return nl0;
    }
}
