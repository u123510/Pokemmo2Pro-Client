package cn.pokemmo.graphics.camera;

import f.*;

import com.badlogic.gdx.math.Matrix4;

public class OrthographicCamera extends Tv0 {
    public float LH;
    public final C8 aj0;

    public OrthographicCamera() {
        super();
        this.LH = 1.0F;
        this.aj0 = new C8();
        this.Wu0 = 0.0F;
    }

    public OrthographicCamera(float width, float height) {
        super();
        this.LH = 1.0F;
        this.aj0 = new C8();
        this.Ui = width;
        this.yG = height;
        this.Wu0 = 0.0F;
        this.lP();
    }

    public final void lP() {
        this.R1(true);
    }

    public final void R1(boolean update) {
        float scale = this.LH;
        float left = -this.Ui * scale / 2.0F;
        float right = this.Ui * scale / 2.0F;
        float bottom = -this.yG * scale / 2.0F;
        float top = this.yG * scale / 2.0F;
        this.ep.QA(left, right, bottom, top, this.Wu0, this.Qy);
        C8 position = this.v40;
        C8 transformed = this.aj0.np(position).na(this.jd0.x, this.jd0.y, this.jd0.z);
        this.bq.co(position, transformed, this.St0);
        this.iJ.Dd0(this.ep.EW);
        Matrix4.md0(this.iJ.EW, this.bq.EW);
        this.WT.Dd0(this.iJ.EW);
        Matrix4.Hl(this.WT.EW);
        this.cON.la(this.WT);
    }

    public final void Ka0(float width, float height, boolean up) {
        if (up) {
            this.St0.x = 0.0F;
            this.St0.y = -1.0F;
            this.St0.z = 0.0F;
            this.jd0.x = 0.0F;
            this.jd0.y = 0.0F;
            this.jd0.z = 1.0F;
        } else {
            this.St0.x = 0.0F;
            this.St0.y = 1.0F;
            this.St0.z = 0.0F;
            this.jd0.x = 0.0F;
            this.jd0.y = 0.0F;
            this.jd0.z = -1.0F;
        }
        this.v40.x = width * this.LH / 2.0F;
        this.v40.y = height * this.LH / 2.0F;
        this.v40.z = 0.0F;
        this.Ui = width;
        this.yG = height;
        this.R1(true);
    }
}
