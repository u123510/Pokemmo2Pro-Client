package cn.pokemmo.graphics.camera.viewport;

import f.*;

public class ExtendViewport extends jy_1 {
    public final float Pd0;
    public final float zk;
    public final float qa;
    public final float Vn0;
    public final xh0_1 VX;

    public ExtendViewport(float width, float height) {
        this(width, height, 0.0F, 0.0F, new PC0());
    }

    public ExtendViewport(float width, float height, Tv0 camera) {
        this(width, height, 0.0F, 0.0F, camera);
    }

    public ExtendViewport(float width, float height, float minWidth, float minHeight) {
        this(width, height, minWidth, minHeight, new PC0());
    }

    public ExtendViewport(float width, float height, float minWidth, float minHeight, Tv0 camera) {
        super();
        this.VX = P9.Pi0;
        this.Pd0 = width;
        this.zk = height;
        this.qa = minWidth;
        this.Vn0 = minHeight;
        this.b50(camera);
    }

    @Override
    public void Yw0(int width, int height) {
        boolean center = true;
        float worldWidth = this.Pd0;
        float worldHeight = this.zk;
        Bp0 projected = this.VX.ZA(worldWidth, worldHeight, (float) width, (float) height);
        int projectedWidth = Math.round(projected.x);
        int projectedHeight = Math.round(projected.y);
        if (projectedWidth < width) {
            float heightRatio = (float) projectedHeight / worldHeight;
            float widthRatio = worldHeight / (float) projectedHeight;
            float delta = (float) (width - projectedWidth) * widthRatio;
            if (this.qa > 0.0F) {
                delta = Math.min(delta, this.qa - this.Pd0);
            }
            worldWidth += delta;
            projectedWidth = Math.round(delta * heightRatio) + projectedWidth;
        }
        if (projectedHeight < height) {
            float widthRatio = (float) projectedWidth / worldWidth;
            float heightRatio = worldWidth / (float) projectedWidth;
            float delta = (float) (height - projectedHeight) * heightRatio;
            if (this.Vn0 > 0.0F) {
                delta = Math.min(delta, this.Vn0 - this.zk);
            }
            worldHeight += delta;
            projectedHeight = Math.round(delta * widthRatio) + projectedHeight;
        }
        this.Ty = projectedWidth;
        this.Ja = projectedHeight;
        this.df = (width - projectedWidth) / 2;
        this.gS = (height - projectedHeight) / 2;
        this.qj = worldWidth;
        this.eY = worldHeight;
        this.kF(center);
    }
}
