package cn.pokemmo.graphics;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Of0
 */
public class Modern_Gdx_Of0 extends z2_0 {

    public final in_2 Fh0;

    public Modern_Gdx_Of0(hu0 owner) {
        super(owner);
        this.Fh0 = new in_2(2000);
    }

    public final boolean N30(hl0_1 input, int index, boolean pressed) {
        return true;
    }

    public final boolean jq0(BJ0 bJ0, ER eR, U5 u5, int i4, boolean i5) {
        hu0 owner = (hu0) this.Ii0;
        if (owner.Z4 < 1) {
            return true;
        }
        if (!this.Fh0.fy()) {
            return true;
        }
        this.Fh0.iA = rg0_2.j40(1500, 2000);
        vo_2 current = tw0_0.LD0.Sc;
        if (!(current instanceof ov_0)) {
            return true;
        }
        ov_0 scene = (ov_0) current;
        zv_2 position = owner.ba0;
        int x = position.Lq0;
        int z = position.B5;
        int effect = rg0_2.r4(3);
        C8 origin = scene.Hq;
        origin.x = z;
        origin.y = 0.0f;
        origin.z = x;
        origin.Fg0(0.25f);

        I2 outer = scene.qf.ZD();
        while (outer.hasNext()) {
            nv0_0 group = (nv0_0) outer.next();
            I2 inner = group.yf0.ZD();
            while (inner.hasNext()) {
                Ou0 object = (Ou0) inner.next();
                if (!object.yI0.contains("tree")) {
                    continue;
                }
                ly0_0 transform = object.Mp0;
                scene.VJ0.np(transform.Xm0);
                C8 treePosition = transform.Xm0;
                if (scene.Hq.Ir(treePosition.x, 0.0f, treePosition.z) < 1.25f) {
                    object.sC0(effect, false, null);
                }
            }
        }
        return true;
    }

    public final bi0_1 U20() {
        return (hu0) this.Ii0;
    }
}

