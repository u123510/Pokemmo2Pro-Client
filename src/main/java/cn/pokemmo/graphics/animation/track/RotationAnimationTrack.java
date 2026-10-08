package cn.pokemmo.graphics.animation.track;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.C8;
import f.Vs0;
import f.a00_0;
import f.hk0_1;
import f.hl0_1;
import f.ly0_0;
import f.ph_1;
import f.s4_0;
import f.tw0_0;
import f.z20_0;

public class RotationAnimationTrack
extends BaseAnimationTrack {
    public long al0 = hk0_1.lQ();
    public int HM = 0;

    public RotationAnimationTrack(s4_0 s4_02, boolean bl) {
        super(s4_02, bl);
    }

    @Override
    public final void lI() {
        int n = this.ig0 ? 255 : 0;
        this.HM = n;
    }

    @Override
    public final void ro0(hl0_1 hl0_12) {
        long l = hk0_1.KG;
        if (this.al0 + 30L < l) {
            this.al0 = l;
            if (this.CJ) {
                int n = this.HM;
                if (n > 0) {
                    this.HM = n - 20;
                }
            } else {
                int n = this.HM;
                if (n < 255) {
                    this.HM = n + 20;
                }
            }
        }
        if (this.HM < 1) {
            return;
        }
        ly0_0 ly0_02 = tw0_0.LD0.Sc.Ej0();
        C8 c8 = ly0_02.jG0;
        l = hk0_1.KG;
        int n = (int)c8.x / 64 * 64 - (int)(l / 4L % 64L);
        int n2 = (int)c8.y / 64 * 64 + -64 - (int)(l / 25L % 64L);
        Texture texture = ph_1.Ry().bt0.H8();
        float f = (float)this.HM / 255.0f;
        Color color = Vs0.se.cpy().mul(1.0f, 1.0f, 1.0f, f);
        hl0_12.oH.set(color);
        hl0_12.og = color.toFloatBits();
        a00_0 a00_02 = a00_0.xm0;
        texture.setWrap(a00_02, a00_02);
        f = n;
        float f2 = n2;
        n = 0;
        int n3 = 0;
        C8 c82 = ly0_02.ec0;
        int n4 = (int)c82.x + 512;
        int n5 = (int)c82.y + 512;
        hl0_12.Ya0(texture, f, f2, n, n3, n4, n5);
        float f3 = Vs0.lv;
        Color.abgr8888ToColor(hl0_12.oH, f3);
        hl0_12.og = f3;
    }
}
