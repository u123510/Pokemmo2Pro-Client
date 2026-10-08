package cn.pokemmo.graphics.camera;

import f.*;

import com.badlogic.gdx.math.Matrix4;

public class PerspectiveCamera extends Tv0 {
    public float zo0;
    public final C8 tA;

    public PerspectiveCamera() {
        this.zo0 = 67.0f;
        this.tA = new C8();
    }

    public PerspectiveCamera(float fieldOfView, float width, float height) {
        this.zo0 = 67.0f;
        this.tA = new C8();
        this.zo0 = fieldOfView;
        this.Ui = width;
        this.yG = height;
        this.lP();
    }

    public final void lP() {
        this.ye(true);
    }

    public final void ye(boolean updateFrustum) {
        float aspect = this.Ui / this.yG;
        Matrix4 projection = this.ep;
        float far = Math.abs(this.Wu0);
        float near = Math.abs(this.Qy);
        projection.F();
        float cotangent = (float) (1.0 / Math.tan(this.zo0 * (Math.PI / 180.0) / 2.0));
        float range = far - near;
        float depthScale = (near + far) / range;
        float depthOffset = near * 2.0f * far / range;
        float[] values = projection.EW;
        values[0] = cotangent / aspect;
        values[1] = 0.0f;
        values[2] = 0.0f;
        values[3] = 0.0f;
        values[4] = 0.0f;
        values[5] = cotangent;
        values[6] = 0.0f;
        values[7] = 0.0f;
        values[8] = 0.0f;
        values[9] = 0.0f;
        values[10] = depthScale;
        values[11] = -1.0f;
        values[12] = 0.0f;
        values[13] = 0.0f;
        values[14] = depthOffset;
        values[15] = 0.0f;

        C8 position = this.v40;
        C8 target = this.tA.np(position).na(this.jd0.x, this.jd0.y, this.jd0.z);
        this.bq.co(position, target, this.St0);
        this.iJ.Dd0(this.ep.EW);
        Matrix4.md0(this.iJ.EW, this.bq.EW);
        if (updateFrustum) {
            this.WT.Dd0(this.iJ.EW);
            Matrix4.Hl(this.WT.EW);
            this.cON.la(this.WT);
        }
    }
}
