package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.AG0;
import f.C8;
import f.LPT6_;
import f.Vs0;
import f.a00_0;
import f.hk0_1;
import f.hl0_1;
import f.ly0_0;
import f.ph_1;
import f.s4_0;
import f.tw0_0;
import f.z20_0;


public class TranslationAnimationTrack
extends BaseAnimationTrack {
    public long uq = hk0_1.lQ();
    public int nt0 = 0;

    public TranslationAnimationTrack(s4_0 s4_02, boolean bl) {
        super(s4_02, bl);
    }

    @Override
    public final void lI() {
        int n = this.ig0 ? 255 : 0;
        this.nt0 = n;
    }

    @Override
    public final void ro0(hl0_1 hl0_12) {
        long l = hk0_1.KG;
        if (this.uq + 30L < l) {
            this.uq = l;
            if (this.CJ) {
                int n = this.nt0;
                if (n > 0) {
                    this.nt0 = n - 20;
                }
            } else {
                int n = this.nt0;
                if (n < 255) {
                    this.nt0 = n + 20;
                }
            }
        }
        if (this.nt0 < 1) {
            return;
        }
        AG0 aG0 = ph_1.Ry().nF0[(int)(hk0_1.KG / 1000L % 2L)];
        ly0_0 ly0_02 = tw0_0.LD0.Sc.Ej0();
        C8 c8 = ly0_02.jG0;
        int n = (int)c8.x / 64 * 64 + -64;
        int n2 = (int)c8.y / 64 * 64 + -128 + (int)(hk0_1.KG / 100L % 64L);
        LPT6_ lPT6_ = aG0.d3();
        a00_0 a00_02 = a00_0.xm0;
        lPT6_.OB.setWrap(a00_02, a00_02);
        float f = (float)this.nt0 / 255.0f;
        Color color = Vs0.se.cpy().mul(1.0f, 1.0f, 1.0f, f);
        hl0_12.oH.set(color);
        hl0_12.og = color.toFloatBits();
        Texture texture = lPT6_.OB;
        float f2 = n;
        float f3 = n2;
        int n3 = lPT6_.Zi0();
        int n4 = Math.round(lPT6_.Y60 * (float)lPT6_.OB.getHeight());
        C8 c82 = ly0_02.ec0;
        int n5 = (int)c82.x + 512;
        int n6 = (int)c82.y + 512;
        hl0_12.Ya0(texture, f2, f3, n3, n4, n5, n6);
        float f4 = Vs0.lv;
        Color.abgr8888ToColor(hl0_12.oH, f4);
        hl0_12.og = f4;
    }
}
