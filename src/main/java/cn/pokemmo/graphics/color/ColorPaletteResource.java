package cn.pokemmo.graphics.color;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 现代化重构类 - 原始类: f.Vs0
 */
public class ColorPaletteResource implements fy0_0 {

    public static final dl_1 aA0 = Cq0.E1(ColorPaletteResource.class);
    public static int cOM7 = -1;
    public static float TA0 = 0.0f;
    public static float q80 = 0.0f;
    public static final Color se = new Color();
    public static boolean c3 = false;
    public static final Color Rr;
    public static final float vG;
    public static final Color ao0 = new Color();
    public static float lv = 0.0f;
    public final SQ Qs0 = new SQ();
    public final SQ NJ0 = new SQ();
    public final SQ go = new SQ();
    public final Texture Qx0;

    static {
        Rr = new Color(0.7f, 0.7f, 0.85f, 1.0f);
        vG = Rr.toFloatBits();
    }

    public ColorPaletteResource() {
        Texture texture = null;
        try {
            ByteBuffer data = ByteBuffer.wrap(lg_0.I70.cD0("data/sprites/overlays-data.pak").kI0()).order(ByteOrder.LITTLE_ENDIAN);
            if (data.getInt() != 21709136) {
                throw new RuntimeException("Missing header");
            }
            short smallCount = data.getShort();
            short largeCount = data.getShort();
            texture = new Texture(lg_0.I70.cD0("data/sprites/overlays.pak"));
            for (int index = 0; index < smallCount; index++) {
                short low = data.getShort();
                short high = data.getShort();
                byte layer = data.get();
                short textureX = data.getShort();
                short textureY = data.getShort();
                B5 sprite = new B5(new LPT6_(texture, textureX, textureY, 8, 8));
                this.NJ0.uu0(high * 65536 + low, new nv_0(layer, sprite));
            }
            for (int index = 0; index < largeCount; index++) {
                short low = data.getShort();
                byte high = data.get();
                short textureX = data.getShort();
                short textureY = data.getShort();
                B5 sprite = new B5(new LPT6_(texture, textureX, textureY, 16, 16));
                this.go.uu0(high * 65536 + low, sprite);
            }
        } catch (Exception exception) {
            aA0.error("", exception);
        }
        this.Qx0 = texture;
    }

    public static void aT(boolean enabled) {
        if (enabled == c3) return;
        c3 = enabled;
        if (enabled) {
            for (yb_1 colorSource : yb_1.Mh) {
                ao0.set(colorSource.tg0).mul(Rr);
                colorSource.YH0.set(ao0);
            }
            se.set(Rr);
            lv = vG;
        } else {
            se.set(q80, q80, TA0, 1.0f);
            lv = se.toFloatBits();
        }
    }

    public final void Ty0() {
        SQ chunks = this.Qs0;
        new Hm(chunks);
        us_2 iterator = new us_2(chunks);
        while (iterator.hasNext()) {
            II chunk = (II)iterator.ty();
            if (chunk.Qv0 != null) {
                chunk.Qv0.dispose();
            }
            chunk.Qv0 = null;
        }
        this.Qs0.clear();
    }

    public final II k40(int x, int y) {
        synchronized (this.Qs0) {
            int key = y * 65536 + x;
            II chunk = (II)this.Qs0.get(key);
            if (chunk != null) return chunk;
            if (x >= 100) {
                chunk = new II(x - 100, y - 100, tw0_0.Ll0.LPT2);
            } else {
                chunk = new II(x, y, tw0_0.Ll0.YB0);
            }
            for (db0_2 tile : chunk.w3) {
                for (int row = 0; row < 2; row++) {
                    for (int column = 0; column < 4; column++) {
                        int overlayId = tile.Lw0[row][column].E70 & 1023;
                        int coordinate;
                        if (overlayId > chunk.Pp0) {
                            overlayId -= chunk.Pp0;
                            coordinate = y;
                        } else {
                            coordinate = x;
                        }
                        nv_0 overlay = (nv_0)this.NJ0.get(overlayId * 65536 + coordinate);
                        if (overlay == null) continue;
                        if (tile.Nf == null) tile.Nf = new B5[2][];
                        if (tile.Nf[row] == null) tile.Nf[row] = new B5[4];
                        tile.Nf[row][column] = overlay.h30;
                    }
                }
            }
            this.Qs0.j10(this.Qs0.yw0(key), chunk);
            return chunk;
        }
    }

    public final void Ru0(int value) {
        if (value == cOM7) return;
        float brightness = value / 255.0f;
        cOM7 = value;
        TA0 = 1.0f - value / lpt3__1.an0 / 255.0f;
        q80 = 1.0f - value / lpt3__1.Kr / 255.0f;
        se.set(q80, q80, TA0, 1.0f);
        lv = se.toFloatBits();
        for (yb_1 colorSource : yb_1.Mh) {
            ao0.set(colorSource.tg0).mul(se);
            colorSource.YH0.set(ao0);
        }
        SQ smallSprites = this.NJ0;
        new Hm(smallSprites);
        us_2 smallIterator = new us_2(smallSprites);
        while (smallIterator.hasNext()) {
            nv_0 sprite = (nv_0)smallIterator.ty();
            if (sprite.Wm == 0) sprite.h30.Ha0(brightness);
        }
        SQ largeSprites = this.go;
        new Hm(largeSprites);
        us_2 largeIterator = new us_2(largeSprites);
        while (largeIterator.hasNext()) {
            ((B5)largeIterator.ty()).Ha0(brightness);
        }
    }

    public final void dispose() {
        this.Ty0();
        if (this.Qx0 != null) this.Qx0.dispose();
    }
}
