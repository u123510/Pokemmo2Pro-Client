package cn.pokemmo.world.camera;

import f.*;

/**
 * 3D/2D 摄像机控制器与多区域视口管理器 (Camera Controller)
 * 管理各世代地图区域 (Kanto, Johto, Hoenn, Sinnoh, Unova) 摄像机层与多层视口追踪。
 *
 * 原混淆类: f.ru0_0
 */
public class CameraController {
    public final gf0_0[] bG0;
    public final es_1 yG0;

    public CameraController() {
        gf0_0[] gf0_0Array = new gf0_0[5];
        this.bG0 = gf0_0Array;
        this.yG0 = new es_1();
        if (tw0_0.Ll0.Qz0 != null) {
            gf0_0Array[2] = new UK();
        }
        if (tw0_0.Ll0.nC0 != null) {
            gf0_0Array[3] = new HA();
        }
        if (tw0_0.Ll0.t1 != null) {
            gf0_0Array[4] = new lpt7__0();
        }
        if (dw_2.oN) {
            dw_2.oN = false;
            dw_2.CY();
        }
        if (!dw_2.bn) {
            return;
        }
        for (gf0_0 gf0_03 : gf0_0Array) {
            if (gf0_03 == null || gf0_03.eT()) continue;
            this.yG0.Ue0(gf0_03);
        }
    }

    public final gf0_0 jg0(byte by) {
        return this.bG0[by];
    }
}
