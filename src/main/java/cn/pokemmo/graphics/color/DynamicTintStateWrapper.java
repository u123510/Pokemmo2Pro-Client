package cn.pokemmo.graphics.color;

import f.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class DynamicTintStateWrapper extends br_1 implements sj0_0 {
    public LPT6_ be;

    public DynamicTintStateWrapper() {
        super();
    }

    public DynamicTintStateWrapper(Texture texture) {
        super();
        this.Ew(new LPT6_(texture));
    }

    public DynamicTintStateWrapper(LPT6_ texture) {
        super();
        this.Ew(texture);
    }

    public DynamicTintStateWrapper(si_2 source) {
        super(source);
        this.Ew(source.be);
    }

    @Override
    public void Xd(ui_1 renderer, float x, float y, float width, float height) {
        renderer.S50(this.be, x, y, width, height);
    }

    @Override
    public void pRN(ui_1 renderer, float x, float y, float width, float height,
                    float u, float v, float u2, float v2, float extra) {
        renderer.u2(this.be, x, y, width, height, u, v, u2, v2, extra);
    }

    public final void Ew(LPT6_ texture) {
        this.be = texture;
        if (texture != null) {
            this.wv = texture.bz;
            this.u1 = texture.xZ;
        }
    }

    public YA tp(Color color) {
        B5 copy = this.be instanceof yo_2 ? new tz_1((yo_2) this.be) : new B5(this.be);
        copy.Wx(color);
        copy.An(this.wv, this.u1);
        od_0 result = new od_0(copy);
        result.GA0 = this.GA0;
        result.f60 = this.f60;
        result.dL0 = this.dL0;
        result.bB = this.bB;
        return result;
    }
}
