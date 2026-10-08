package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class GymPuzzleMeshRenderer extends BaseMapMeshRenderer {
    public static final C8 ZG;
    public static final me0_2 z0;
    public final Ou0 bh0;
    public final Ou0 jb0;
    public final Ou0[][] O60;
    public final boolean[] Os;
    public int qL;
    public int jz;
    public int lPt3;
    public int vh0;
    public boolean COm6;
    public long zs0;

    public GymPuzzleMeshRenderer(cb_0 value) {
        super(value);
        this.O60 = new Ou0[2][4];
        this.Os = new boolean[]{false, false};
        this.qL = 7;
        this.jz = 25;
        this.lPt3 = 7;
        this.vh0 = 25;
        this.COm6 = false;
        this.zs0 = 0L;

        v80_0.Cb0().getClass();
        this.jb0 = v80_0.VH(537);
        v80_0.Cb0().getClass();
        this.bh0 = v80_0.VH(536);

        float firstAngle = (float)((this.qL * 360) / 12);
        float secondAngle = (float)(((this.jz * 360) / 60) / 12) + firstAngle;
        this.bh0.ho.CN(C8.Y, -secondAngle + 90.0F);
        this.jb0.ho.CN(C8.Y, -firstAngle + 180.0F);
        this.bh0.ho.m80(2.875F, 0.0F, 3.375F);
        this.jb0.ho.m80(2.875F, 0.0F, 3.375F);

        Ou0 template = fi_0.xL().Sp();
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 4; column++) {
                Ou0 item = template.Ma0();
                float x = si0_0.Fz(row, 17, 1, column) * 0.25F + 0.125F;
                item.ho.m80(x, 0.0F, 4.875F);
                item.rF0();
                this.O60[row][column] = item;
                this.yS(item);
            }
        }

        this.jb0.sY = false;
        this.bh0.sY = false;
        this.yS(this.jb0);
        this.yS(this.bh0);
    }

    static {
        ZG = new C8();
        z0 = new me0_2();
    }

    public final void sn0(short[] values) {
        if (values.length < 1) {
            return;
        }

        int event = values[0];
        if (event != 4809 && event != 4810) {
            return;
        }

        int state = values[1];
        for (int row = 0; row < 2; row++) {
            int columnState = row < 3 ? 0 : 1;
            Ou0[] rowItems = this.O60[row];
            for (int column = 0; column < rowItems.length; column++) {
                Ou0 item = rowItems[column];
                String value = (String)item.Kv.get(columnState);
                item.fm0(value, columnState == 0);
            }
            this.Os[row] = ((byte)state) != 0;
        }

        switch (state) {
            case 0:
                this.lPt3 = 7;
                this.vh0 = 25;
                break;
            case 1:
                this.lPt3 = 6;
                this.vh0 = 15;
                break;
            case 2:
                this.lPt3 = 9;
                this.vh0 = 15;
                break;
            case 3:
                this.lPt3 = 0;
                this.vh0 = 45;
                break;
            case 4:
                this.lPt3 = 0;
                this.vh0 = 30;
                break;
            default:
                break;
        }

        if (event == 4809) {
            this.qL = this.lPt3;
            this.jz = this.vh0;
            this.COm6 = true;
            return;
        }

        this.zs0 = hk0_1.KG;
        tw0_0.rl.xm = new dr0_0((f.OH0)(Object)this);
    }

    public final void lpt1(float delta) {
        boolean delayed = hk0_1.KG - this.zs0 > 1000L;
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 4; column++) {
                com.badlogic.gdx.math.Matrix4 matrix = this.O60[row][column].ho;
                float x = si0_0.Fz(row, 17, 1, column) * 0.25F + 0.125F;
                float z = delayed && this.Os[row] ? -100.0F : 4.875F;
                matrix.m80(x, 0.0F, z);
                this.O60[row][column].rF0();
            }
        }

        int previousMinute = this.jz;
        if (this.vh0 != this.jz || this.lPt3 != this.qL || this.COm6) {
            if (!this.COm6) {
                this.jz = previousMinute + 1;
            }
            this.COm6 = false;
            if (this.jz >= 60) {
                this.qL++;
                this.jz = 0;
            }
            if (this.qL >= 12) {
                this.qL = 0;
            }
        }

        int hour = this.qL;
        float hourAngle = (float)((hour * 360) / 12);
        if (this.lPt3 != hour) {
            hourAngle += (float)(((this.jz * 360) / 60) / 12);
        }
        float minuteAngle = (float)((this.jz * 360) / 60);

        C8 position = this.bh0.ho.V1(ZG);
        me0_2 rotation = z0;
        rotation.Oa(C8.Y, -minuteAngle + 90.0F);
        this.bh0.ho.vh(
            position.x,
            position.y,
            position.z,
            rotation.m1,
            rotation.ao0,
            rotation.th,
            rotation.Au0
        );

        this.jb0.ho.V1(position);
        rotation.h50(
            C8.Y.x,
            C8.Y.y,
            C8.Y.z,
            (-hourAngle + 180.0F) * 0.0174532924F
        );
        this.jb0.ho.vh(
            position.x,
            position.y,
            position.z,
            rotation.m1,
            rotation.ao0,
            rotation.th,
            rotation.Au0
        );
        super.lpt1(delta);
    }
}
