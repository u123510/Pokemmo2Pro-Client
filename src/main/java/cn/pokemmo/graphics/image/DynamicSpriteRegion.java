package cn.pokemmo.graphics.image;

import f.*;
import com.badlogic.gdx.graphics.Texture;

public class DynamicSpriteRegion extends LPT6_ {
    public int lw;
    public String oL;
    public float Z0;
    public float JN;
    public final int wB;
    public final int P4;
    public int Xr0;
    public int BF0;
    public boolean yI;
    public String[] EY;
    public int[][] cM;

    public DynamicSpriteRegion(Texture texture, int x, int y, int width, int height) {
        super(texture, x, y, width, height);
        this.lw = -1;
        this.Xr0 = width;
        this.BF0 = height;
        this.wB = width;
        this.P4 = height;
    }

    public DynamicSpriteRegion(yo_2 other) {
        super();
        this.lw = -1;
        this.t60(other);
        this.lw = other.lw;
        this.oL = other.oL;
        this.Z0 = other.Z0;
        this.JN = other.JN;
        this.wB = other.wB;
        this.P4 = other.P4;
        this.Xr0 = other.Xr0;
        this.BF0 = other.BF0;
        this.yI = other.yI;
        this.EY = other.EY;
        this.cM = other.cM;
    }

    public DynamicSpriteRegion(LPT6_ other) {
        super();
        this.lw = -1;
        this.t60(other);
        this.wB = this.R90();
        this.P4 = this.dV();
        this.Xr0 = this.wB;
        this.BF0 = this.P4;
    }

    @Override
    public final void Wu0(boolean horizontal, boolean vertical) {
        super.Wu0(horizontal, vertical);
        if (horizontal) {
            float offset = this.Xr0 - this.Z0;
            this.Z0 = offset - (this.yI ? this.P4 : this.wB);
        }
        if (vertical) {
            float offset = this.BF0 - this.JN;
            this.JN = offset - (this.yI ? this.wB : this.P4);
        }
    }

    public final int[] Xq(String name) {
        if (this.EY != null) {
            for (int i = 0; i < this.EY.length; i++) {
                if (name.equals(this.EY[i])) {
                    return this.cM[i];
                }
            }
        }
        return null;
    }

    @Override
    public final String toString() {
        return this.oL;
    }
}
