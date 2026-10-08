package cn.pokemmo.graphics.color;

import f.*;
import com.badlogic.gdx.graphics.Color;

public class DynamicAlphaStateWrapper extends br_1 implements sj0_0 {
    public B5 cM0;

    public DynamicAlphaStateWrapper() {
        super();
    }

    public DynamicAlphaStateWrapper(B5 sprite) {
        super();
        this.S6(sprite);
    }

    public DynamicAlphaStateWrapper(od_0 source) {
        super(source);
        this.S6(source.cM0);
    }

    @Override
    public final void Xd(ui_1 ui, float x, float y, float width, float height) {
        float colorBits = this.cM0.UB0.toFloatBits();
        this.cM0.Wx(this.cM0.UB0.mul(ui.oH));
        this.cM0.B1 = 0.0F;
        this.cM0.Zi0 = 1.0F;
        this.cM0.D60 = 1.0F;
        this.cM0.o70 = true;
        this.cM0.ss(x, y, width, height);
        this.cM0.jN(ui);
        Color.abgr8888ToColor(this.cM0.UB0, colorBits);
        float[] vertices = this.cM0.Sx;
        vertices[2] = colorBits;
        vertices[7] = colorBits;
        vertices[12] = colorBits;
        vertices[17] = colorBits;
    }

    @Override
    public final void pRN(ui_1 ui, float x, float y, float originX, float originY,
                           float width, float height, float scaleX, float scaleY, float rotation) {
        float colorBits = this.cM0.UB0.toFloatBits();
        this.cM0.Wx(this.cM0.UB0.mul(ui.oH));
        this.cM0.FJ0(originX, originY);
        this.cM0.B1 = rotation;
        this.cM0.Zi0 = scaleX;
        this.cM0.D60 = scaleY;
        this.cM0.o70 = true;
        this.cM0.ss(x, y, width, height);
        this.cM0.jN(ui);
        Color.abgr8888ToColor(this.cM0.UB0, colorBits);
        float[] vertices = this.cM0.Sx;
        vertices[2] = colorBits;
        vertices[7] = colorBits;
        vertices[12] = colorBits;
        vertices[17] = colorBits;
    }

    public final void S6(B5 sprite) {
        this.cM0 = sprite;
        this.wv = sprite.l();
        this.u1 = sprite.LD0();
    }
}
