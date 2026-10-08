/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.color;

import f.*;


import com.badlogic.gdx.graphics.Color;
import f.C8;
import f.px_1;
import java.nio.ByteBuffer;

/*
 * Renamed from f.rj0
 */
public class GdxMaterialLightingColor {
    public final Color r30;
    public final Color sm0;
    public final Color Ak0;
    public final Color oE;
    public final Color B90;
    public final C8 Ze;

    public GdxMaterialLightingColor(Color color, Color color2, Color color3, Color color4, Color color5, C8 c8) {
        this.r30 = color;
        this.sm0 = color2;
        this.Ak0 = color3;
        this.oE = color4;
        this.B90 = color5;
        this.Ze = c8;
    }

    public GdxMaterialLightingColor(ByteBuffer byteBuffer) {
        byteBuffer.position();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        short s_r30 = byteBuffer.getShort();
        short s_oE = byteBuffer.getShort();
        byteBuffer.getShort();
        short s_B90 = byteBuffer.getShort();
        byteBuffer.get();
        float f3 = (float)(byteBuffer.getShort() & 0xFFFF) / 65536.0f;
        float f4 = (float)(byteBuffer.getShort() & 0xFFFF) / 65536.0f;
        float f5 = (float)(byteBuffer.getShort() & 0xFFFF) / 65536.0f;
        byteBuffer.get();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        short s_sm0 = byteBuffer.getShort();
        short s_Ak0 = byteBuffer.getShort();
        this.r30 = px_1.ep0(s_r30);
        this.sm0 = px_1.ep0(s_sm0);
        this.Ak0 = px_1.ep0(s_Ak0);
        this.oE = px_1.ep0(s_oE);
        this.B90 = px_1.ep0(s_B90);
        this.Ze = new C8(-f3, -f4, -f5);
    }
}

