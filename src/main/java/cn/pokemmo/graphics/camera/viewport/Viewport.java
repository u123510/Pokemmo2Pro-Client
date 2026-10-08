package cn.pokemmo.graphics.camera.viewport;

import f.*;

import com.badlogic.gdx.math.Matrix4;

public abstract class Viewport {
    public Tv0 v3;
    public float qj;
    public float eY;
    public int df;
    public int gS;
    public int Ty;
    public int Ja;
    public final C8 BZ;

    public Viewport() {
        this.BZ = new C8();
    }

    public void kF(boolean center) {
        CI0.r40(this.df, this.gS, this.Ty, this.Ja);
        Tv0 camera = this.v3;
        camera.Ui = this.qj;
        camera.yG = this.eY;
        if (center) {
            camera.v40.x = this.qj / 2.0F;
            camera.v40.y = this.eY / 2.0F;
            camera.v40.z = 0.0F;
        }
        camera.lP();
    }

    public final void vE0(Matrix4 matrix, ql_0 viewport, ql_0 result) {
        PH.Y0(this.v3, this.df, this.gS, this.Ty, this.Ja, matrix, viewport, result);
    }

    public final void b50(Tv0 camera) {
        this.v3 = camera;
    }

    public final void Nn0(float width, float height) {
        this.qj = width;
        this.eY = height;
    }

    public void Yw0(int ignoredWidth, int ignoredHeight) {
        this.kF(true);
    }

    public final void lPt8(Bp0 point) {
        this.BZ.x = point.x;
        this.BZ.y = point.y;
        this.BZ.z = 1.0F;
        this.v3.Lpt4(this.BZ, this.df, this.gS, this.Ty, this.Ja);
        point.x = this.BZ.x;
        point.y = this.BZ.y;
    }
}
