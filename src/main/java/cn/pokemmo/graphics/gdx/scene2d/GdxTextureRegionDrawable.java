package cn.pokemmo.graphics.gdx.scene2d;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class GdxTextureRegionDrawable extends si_2 {
    public final Color UU;
    public final float Ri0;
    public final int A8;

    public GdxTextureRegionDrawable() {
        super();
        this.UU = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Ri0 = 1.0f;
        this.A8 = 12;
    }

    public GdxTextureRegionDrawable(LPT6_ region) {
        super(region);
        this.UU = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Ri0 = 1.0f;
        this.A8 = 12;
    }

    public GdxTextureRegionDrawable(si_2 regionDrawable) {
        super(regionDrawable);
        this.UU = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        this.Ri0 = 1.0f;
        this.A8 = 12;
    }

    @Override
    public final void Xd(ui_1 v1, float f2, float f3, float f4, float f5) {
        float f6 = v1.og;
        v1.oH.mul(this.UU);
        v1.og = v1.oH.toFloatBits();

        LPT6_ region = this.be;
        float scale = this.Ri0;
        int align = this.A8;

        float regionWidth = (float) region.bz * scale;
        float regionHeight = (float) region.xZ * scale;
        Texture texture = region.OB;
        float textureWidth = (float) texture.getWidth() * scale;
        float textureHeight = (float) texture.getHeight() * scale;
        float u = region.yQ;
        float v = region.Y60;
        float u2 = region.Yo;
        float v2 = region.Ll0;

        float f16 = f4 / regionWidth;
        int countX = (int) f16;
        int alignLeft = align & 8;
        float startX;
        float endX;
        if (alignLeft != 0) {
            startX = 0.0f;
            endX = f4 - (float) countX * regionWidth;
        } else if ((align & 16) != 0) {
            startX = f4 - (float) countX * regionWidth;
            endX = 0.0f;
        } else if (countX != 0) {
            if (countX % 2 != 1) {
                countX--;
            }
            startX = (f4 - (float) countX * regionWidth) * 0.5f;
            endX = startX;
        } else {
            startX = 0.0f;
            endX = 0.0f;
        }

        float f21 = f5 / regionHeight;
        int countY = (int) f21;
        int alignTop = align & 2;
        float startY;
        float endY;
        if (alignTop != 0) {
            startY = 0.0f;
            endY = f5 - (float) countY * regionHeight;
        } else if ((align & 4) != 0) {
            startY = f5 - (float) countY * regionHeight;
            endY = 0.0f;
        } else if (countY != 0) {
            if (countY % 2 != 1) {
                countY--;
            }
            startY = (f5 - (float) countY * regionHeight) * 0.5f;
            endY = startY;
        } else {
            startY = 0.0f;
            endY = 0.0f;
        }

        float f27;
        if (startX > 0.0f) {
            float curU = u2 - (startX / textureWidth);
            if (startY > 0.0f) {
                float curV = (startY / textureHeight) + v;
                v1.gP(texture, f2, f3, startX, startY, curU, curV, u2, v);
                f27 = f3 + startY;
            } else {
                f27 = f3;
            }
            if (countY == 0 && alignTop == 0 && (align & 4) == 0) {
                float f28 = (v2 - v) * 0.5f * (1.0f - f21);
                float f29 = v - f28;
                float f28_2 = v2 + f28;
                v1.gP(texture, f2, f27, startX, f5, curU, f29, u2, f28_2);
                f27 += f5;
            } else {
                for (int i28 = 0; i28 < countY; i28++) {
                    v1.gP(texture, f2, f27, startX, regionHeight, curU, v2, u2, v);
                    f27 += regionHeight;
                }
            }
            if (endY > 0.0f) {
                float f28 = v2 - (endY / textureHeight);
                v1.gP(texture, f2, f27, startX, endY, curU, v2, u2, f28);
            }
        } else {
            f27 = f3;
        }

        if (startY > 0.0f) {
            float curX = f2 + startX;
            float curV = (startY / textureHeight) + v;
            if (countX == 0 && alignLeft == 0 && (align & 16) == 0) {
                float f28 = (u2 - u) * 0.5f * (1.0f - f16);
                float f29 = u2 + f28;
                float f28_2 = u - f28;
                v1.gP(texture, curX, f3, f4, startY, f29, curV, f28_2, v);
            } else {
                for (int i28 = 0; i28 < countX; i28++) {
                    v1.gP(texture, curX, f3, regionWidth, startY, u, curV, u2, v);
                    curX += regionWidth;
                }
            }
            f27 = f3;
        }

        f2 += startX;
        int loopCountX;
        float curU;
        float curU2;
        float tileW;
        if (countX == 0 && alignLeft == 0 && (align & 16) == 0) {
            loopCountX = 1;
            float f26 = (u2 - u) * 0.5f * (1.0f - f16);
            curU2 = u2 + f26;
            curU = u - f26;
            tileW = f4;
        } else {
            loopCountX = countX;
            tileW = regionWidth;
            curU = u;
            curU2 = u2;
        }

        int loopCountY;
        float curV;
        float curV2;
        float tileH;
        if (countY == 0 && alignTop == 0 && (align & 4) == 0) {
            loopCountY = 1;
            float f31 = (v2 - v) * 0.5f * (1.0f - f21);
            curV = v - f31;
            curV2 = v2 + f31;
            tileH = f5;
        } else {
            curV = v;
            curV2 = v2;
            loopCountY = countY;
            tileH = regionHeight;
        }

        float curX = f2;
        for (int i34 = 0; i34 < loopCountX; i34++) {
            f27 = f3 + startY;
            for (int i36 = 0; i36 < loopCountY; i36++) {
                v1.gP(texture, curX, f27, tileW, tileH, curU2, curV, curU, curV2);
                f27 += tileH;
            }
            curX += tileW;
        }

        if (endY > 0.0f) {
            float curV2_adj = v2 - (endY / textureHeight);
            if (countX == 0 && alignLeft == 0 && (align & 16) == 0) {
                float f0 = (u2 - u) * 0.5f * (1.0f - f16);
                float u2_adj = u2 + f0;
                float u_adj = u - f0;
                v1.gP(texture, f2, f27, f4, endY, u2_adj, v2, u_adj, curV2_adj);
                curX = f2 + f4;
            } else {
                curX = f2;
                for (int i4 = 0; i4 < countX; i4++) {
                    v1.gP(texture, curX, f27, regionWidth, endY, u, v2, u2, curV2_adj);
                    curX += regionWidth;
                }
            }
        }

        if (endX > 0.0f) {
            float curU2_adj = (endX / textureWidth) + u;
            if (startY > 0.0f) {
                float curV_adj = (startY / textureHeight) + v;
                v1.gP(texture, curX, f3, endX, startY, u, curV_adj, curU2_adj, v);
                f3 += startY;
            }
            float f2_adj;
            if (countY == 0 && alignTop == 0 && (align & 4) == 0) {
                float f2_tmp = (v2 - v) * 0.5f * (1.0f - f21);
                float v_adj = v - f2_tmp;
                float v2_adj = v2 + f2_tmp;
                v1.gP(texture, curX, f3, endX, f5, u, v_adj, curU2_adj, v2_adj);
                f2_adj = f3 + f5;
            } else {
                for (int i2 = 0; i2 < countY; i2++) {
                    v1.gP(texture, curX, f3, endX, regionHeight, u, v2, curU2_adj, v);
                    f3 += regionHeight;
                }
                f2_adj = f3;
            }
            if (endY > 0.0f) {
                float curV2_adj2 = v2 - (endY / textureHeight);
                v1.gP(texture, curX, f2_adj, endX, endY, u, v2, curU2_adj, curV2_adj2);
            }
        }

        Color.abgr8888ToColor(v1.oH, f6);
        v1.og = f6;
    }

    @Override
    public final void pRN(ui_1 v1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final YA tp(Color color) {
        GdxTextureRegionDrawable xg = new GdxTextureRegionDrawable(this);
        xg.UU.set(color);
        xg.GA0 = this.GA0;
        xg.f60 = this.f60;
        xg.dL0 = this.dL0;
        xg.bB = this.bB;
        return xg;
    }
}
