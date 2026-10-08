package cn.pokemmo.graphics.color;

import f.*;

public class DynamicColorStateWrapper extends br_1 implements sj0_0 {
    public pb_1 JE0;

    public DynamicColorStateWrapper() {
        super();
    }

    public DynamicColorStateWrapper(pb_1 value) {
        super();
        this.KY(value);
    }

    public DynamicColorStateWrapper(ke0_2 value) {
        super(value);
        this.JE0 = value.JE0;
    }

    @Override
    public final void Xd(ui_1 ui, float x, float y, float width, float height) {
        this.JE0.P8(ui, x, y, width, height);
        ui.Il0(this.JE0.Hy0, this.JE0.oB, this.JE0.hn);
    }

    @Override
    public final void pRN(ui_1 ui, float x, float y, float offsetX, float offsetY,
                          float width, float height, float scaleX, float scaleY, float rotation) {
        pb_1 image = this.JE0;
        image.P8(ui, x, y, width, height);
        x += offsetX;
        y += offsetY;
        float[] vertices = image.oB;
        int count = image.hn;
        if (rotation != 0.0F) {
            float cos = LW.gc0(rotation);
            float sin = LW.Om(rotation);
            for (int i = 0; i < count; i += 5) {
                float dx = (vertices[i] - x) * scaleX;
                float dy = (vertices[i + 1] - y) * scaleY;
                vertices[i] = cos * dx - sin * dy + x;
                vertices[i + 1] = sin * dx + cos * dy + y;
            }
        } else if (scaleX != 1.0F || scaleY != 1.0F) {
            for (int i = 0; i < count; i += 5) {
                vertices[i] = fe_2.Ga0(vertices[i], x, scaleX, x);
                vertices[i + 1] = fe_2.Ga0(vertices[i + 1], y, scaleY, y);
            }
        }
        ui.Il0(image.Hy0, vertices, count);
    }

    public final void KY(pb_1 value) {
        this.JE0 = value;
        if (value == null) {
            return;
        }
        this.wv = value.V4 + value.pa + value.oa;
        this.u1 = value.jn + value.z0 + value.J1;
        this.dL0 = value.Mh0 == -1.0F ? this.u1 : value.Mh0;
        this.f60 = value.yy0 == -1.0F ? value.oa : value.yy0;
        this.bB = value.q5 == -1.0F ? value.J1 : value.q5;
        this.GA0 = value.VA0 == -1.0F ? value.V4 : value.VA0;
    }
}
