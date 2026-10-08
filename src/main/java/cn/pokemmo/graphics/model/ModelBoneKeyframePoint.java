package cn.pokemmo.graphics.model;

import f.*;

import java.util.ArrayList;

public class ModelBoneKeyframePoint {
    public final byte V5;
    public final Ou0 nJ;
    public C8[] H8;
    public boolean qk0;
    public int l5;
    public int zT;
    public float Ko0;
    public boolean Pi0;
    public E90 h3;
    public Runnable t5;
    public final zr0_0 mu0;

    public ModelBoneKeyframePoint(zr0_0 owner, byte mode, Ou0 model, C8[] points) {
        this.mu0 = owner;
        this.qk0 = false;
        this.l5 = 0;
        this.zT = 0;
        this.Ko0 = 0.0F;
        this.Pi0 = false;
        this.h3 = null;
        this.t5 = null;
        this.V5 = mode;
        this.nJ = model;
        this.H8 = points;
        model.sY = false;
        model.PE0 = 10000.0F;
        model.TU(0, false);
        owner.yS(model);
        model.ho.Y1(points[0]);
    }

    public static void LC0(zv_2 value) {
        tw0_0.rl.fk0.uQ(new bw0_0(value, false, false));
    }

    public final void tW(int index, E90 value) {
        this.h3 = value;
        boolean active = index >= 3 && index <= 5 || index >= 9;
        this.Pi0 = active;
        if (this.V5 != 3) {
            this.zT = index < 3 ? this.H8.length - 1 : 0;
        } else {
            C8 origin = new C8(0.875F, 0.0F, 2.25F);
            ArrayList points = new ArrayList();
            int[] position = zr0_0.hm0(index, -1, -1);
            int direction = position[0] <= 0 ? 1 : -1;
            points.add(origin.na(position[1] * 6.0F * 0.25F, 0.0F, position[0] * 0.25F));
            position[0] += direction;
            int previousType = -1;
            while (true) {
                int type = zr0_0.AF0[position[0]][position[1]];
                if (type == 20 && this.mu0.G60[0]) {
                    type = 0;
                }
                if (type == 21 && this.mu0.G60[1]) {
                    type = 0;
                }
                if (type == 0 || previousType == type) {
                    position[0] += direction;
                    previousType = type;
                    continue;
                }
                if (type >= 6 && type <= 11) {
                    points.add(origin.na(position[1] * 6.0F * 0.25F, 0.0F, position[0] * 0.25F));
                    this.H8 = (C8[]) points.toArray(new C8[0]);
                    this.l5 = 0;
                    this.zT = this.H8.length - 1;
                    break;
                }
                points.add(origin.na(position[1] * 6.0F * 0.25F, 0.0F, position[0] * 0.25F));
                int oldRow = position[0];
                int oldColumn = position[1];
                position = zr0_0.hm0(type, oldRow, oldColumn);
                points.add(origin.na(position[1] * 6.0F * 0.25F, 0.0F, position[0] * 0.25F));
                previousType = type;
            }
        }

        zv_2 map = this.h3.ba0.Xr();
        map.Y30 = (byte) (this.Pi0 ? 0 : 1);
        this.t5 = () -> LC0(map);
        if (this.Pi0) {
            this.h3.il0.LE(new nk_0[]{nk_0.Vb, nk_0.Vb, nk_0.Rz});
        } else {
            this.h3.il0.LE(new nk_0[]{nk_0.TN, nk_0.TN, nk_0.Rz});
        }
        this.h3.il0.Cp(this::j80);
    }

    public final void j80() {
        this.qk0 = true;
        this.nJ.PE0 = 1.0F;
        this.nJ.sC0(0, true, null);
        if (this.h3 == null) {
            return;
        }
        C8 point = this.H8[this.zT];
        tw0_0.RE0.Hq0((byte) 4, (short) 1623);

        C8 first = new C8(0.0F, (this.Pi0 ? 0.0F : -0.25F) - 0.1937407553F, 0.125F);
        C8 second = new C8(this.Pi0 ? -0.25F : 0.0F, (this.Pi0 ? -0.25F : 0.0F) - 0.1937407553F, 0.125F);
        this.h3.il0.f60(this.nJ, false, first);
        this.h3.rd.il0.f60(this.nJ, false, second);

        zv_2 map = this.h3.ba0;
        map.PX(false, (short) (point.x * 4.0F), (short) (point.z * 4.0F + (this.Pi0 ? 1.0F : 0.0F)), (byte) 0, map.Y30);
        map.PX(false, (short) (point.x * 4.0F), (short) (point.z * 4.0F + (this.Pi0 ? 0.0F : 1.0F)), (byte) 0, map.Y30);
        tw0_0.rl.xm = new l40_0((O7) this);
    }
}
