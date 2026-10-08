package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.BH;
import f.Bp0;
import f.C8;
import f.Vs0;
import f.a00_0;
import f.ev0_0;
import f.hk0_1;
import f.hl0_1;
import f.jk_0;
import f.ly0_0;
import f.ph_1;
import f.rg0_2;
import f.s4_0;
import f.tw0_0;
import f.z20_0;

public class ScaleAnimationTrack
extends BaseAnimationTrack {
    public long cOm2 = hk0_1.lQ();
    public long mK = hk0_1.lQ();
    public ev0_0[] cR;
    public int abstract$ = 0;

    public ScaleAnimationTrack(s4_0 s4_02, boolean bl) {
        super(s4_02, bl);
    }

    @Override
    public final void lI() {
        int n = this.ig0 ? 50 : 0;
        ScaleAnimationTrack bC = this;
        bC.abstract$ = n;
        bC.cR = new ev0_0[3];
        n = 0;
        while (true) {
            if (n >= this.cR.length) break;
            this.cR[n] = new ev0_0();
            ++n;
        }
    }

    @Override
    public final void ro0(hl0_1 hl0_12) {
        long l = hk0_1.KG;
        if (this.cOm2 + 30L < l) {
            this.cOm2 = l;
            if (this.CJ) {
                int n = this.abstract$;
                if (n > 0) {
                    this.abstract$ = n - 10;
                }
            } else {
                int n = this.abstract$;
                if (n < 50) {
                    this.abstract$ = n + 10;
                }
            }
        }
        if (this.abstract$ < 1) {
            return;
        }
        ly0_0 ly0_02 = tw0_0.LD0.Sc.Ej0();
        C8 c8 = ly0_02.jG0;
        int n = (int)c8.x / 64 * 64 + -64 - (int)(hk0_1.KG / 60L % 64L);
        int n2 = (int)c8.y / 64 * 64 + -64;
        Texture texture = ph_1.Ry().Qh0.H8();
        float f = (float)this.abstract$ / 255.0f;
        Color color = Vs0.se.cpy().mul(1.0f, 1.0f, 1.0f, f);
        hl0_12.oH.set(color);
        hl0_12.og = color.toFloatBits();
        a00_0 a00_02 = a00_0.xm0;
        texture.setWrap(a00_02, a00_02);
        f = n;
        float f2 = n2;
        int n3 = 0;
        int n4 = 0;
        C8 c82 = ly0_02.ec0;
        int n5 = (int)c82.x + 512;
        int n6 = (int)c82.y + 512;
        hl0_12.Ya0(texture, f, f2, n3, n4, n5, n6);
        float f3 = Vs0.lv;
        Color.abgr8888ToColor(hl0_12.oH, f3);
        hl0_12.og = f3;
        if (this.mK + 2500L < hk0_1.KG) {
            for (n5 = 0; n5 < this.cR.length; ++n5) {
                Bp0 bp0;
                BH bH;
                if (rg0_2.r4(100) >= 25) continue;
                this.mK = hk0_1.KG;
                ev0_0 ev0_02 = this.cR[n5];
                ev0_02.getClass();
                jk_0[] jk_0Array = new jk_0[1];
                jk_0[] jk_0Array2 = jk_0Array;
                int n7 = 2;
                jk_0Array[0] = new jk_0(ph_1.Ry().Zd0[n7]);
                ly0_0 ly0_03 = tw0_0.LD0.Sc.Ej0();
                n7 = rg0_2.j40(0, (int)ly0_03.Xa0.x);
                n3 = (int)ly0_03.Xa0.y;
                float f4 = n7;
                bp0 = new Bp0(f4, 0.0f);
                bH = new BH(jk_0Array2, rg0_2.j40(0, 4) * 250, rg0_2.j40(1, 3) * 500, new Bp0(f4, n3), bp0);
                f4 = 5.0f;
                int n8 = (int)Math.floor(Math.abs(bH.ab.ut(bH.Gp0) / f4));
                Bp0 bp02 = bH.Gp0;
                Bp0 bp03 = bH.ab;
                f = n8;
                bH.ID0 = (bp02.x - bp03.x) / f;
                bH.E4 = (bp02.y - bp03.y) / f;
                ev0_02.bj0.add(bH);
            }
        }
        n5 = 0;
        while (true) {
            ev0_0[] ev0_0Array = this.cR;
            if (n5 >= this.cR.length) break;
            ev0_0Array[n5].nr(hl0_12);
            ++n5;
        }
    }
}
