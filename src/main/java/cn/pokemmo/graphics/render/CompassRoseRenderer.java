package cn.pokemmo.graphics.render;

import f.*;
import com.badlogic.gdx.graphics.Color;

public class CompassRoseRenderer {
    public static final Bp0[] Rz0 = {
        new Bp0(0.5F, 1.0F), new Bp0(1.0F, 1.0F), new Bp0(1.0F, 0.5F),
        new Bp0(1.0F, 0.0F), new Bp0(0.5F, 0.0F), new Bp0(0.0F, 0.0F),
        new Bp0(0.0F, 0.5F), new Bp0(0.0F, 1.0F), new Bp0(0.5F, 1.0F)
    };
    public LPT6_ zf0;
    public final float[] cP;
    public int uW;
    public Bp0 Hz;
    public Bp0 Li0;
    public int PY;
    public int eD;
    public int o60;
    public int ey;
    public float nm;
    public float Of;
    public float Ct0;
    public float gh;
    public float r1;
    public float qT;
    public boolean iV;
    public final Color for$;

    public CompassRoseRenderer() {
        this.uW = 0;
        this.PY = 0;
        this.eD = 0;
        this.o60 = 75;
        this.ey = 75;
        this.iV = false;
        this.cP = new float[80];
        this.for$ = Color.WHITE.cpy();
        this.T30();
    }

    public final void T30() {
        this.uW = 0;
        float angle = 90.0F;
        this.iV = true;
        float ratio = this.qT;
        if (ratio >= 1.0F) {
            ratio = 0.9999899864F;
        }
        this.r1 = angle - (ratio * 360.0F % 360.0F);
        this.Li0 = new Bp0(LW.gc0(this.r1) + 0.5F, LW.Om(this.r1) + 0.5F);
        boolean found = false;
        if (this.iV) {
            int index = 0;
            while (!found && index < Rz0.length) {
                int next = index + 1;
                Bp0 a = Rz0[index];
                index += 2;
                Bp0 b = Rz0[next];
                Bp0 c = Rz0[index];
                found = this.ad0(a, b, c, this.Li0);
            }
        } else {
            int index = 8;
            while (!found && index > 0) {
                int prev = index - 1;
                Bp0 a = Rz0[index];
                index -= 2;
                Bp0 b = Rz0[prev];
                Bp0 c = Rz0[index];
                found = this.ad0(a, b, c, this.Li0);
            }
        }
    }

    public final boolean ad0(Bp0 a, Bp0 b, Bp0 c, Bp0 point) {
        this.Hz = new Bp0(0.5F, 0.5F);
        Bp0 intersection = new Bp0();
        float color = this.for$.toFloatBits();
        this.Ob0(this.Hz, color);
        this.Ob0(a, color);
        if (R30.pY(this.Hz, point, a, b, intersection)) {
            this.Ob0(intersection, color);
            this.Ob0(intersection, color);
            return true;
        }
        if (R30.pY(this.Hz, point, b, c, intersection)) {
            this.Ob0(b, color);
            this.Ob0(intersection, color);
            return true;
        }
        this.Ob0(b, color);
        this.Ob0(c, color);
        return false;
    }

    public final void Ob0(Bp0 point, float color) {
        float x = this.PY + point.x * this.o60;
        float y = this.eD + point.y * this.ey;
        float u = this.nm + point.x * this.Ct0;
        float v = this.Of + point.y * this.gh;
        int index = this.uW;
        this.cP[index] = x;
        this.cP[index + 1] = y;
        this.cP[index + 2] = color;
        this.cP[index + 3] = u;
        this.cP[index + 4] = v;
        this.uW = index + 5;
    }
}
