/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.nds.model;

import f.*;
import java.nio.ByteBuffer;

/**
 * NDS 大世界单体建筑摆放实例与动画绑定器 (NDS Building Placement Entry)
 * 
 * 职责:
 * 存储大世界中单个建筑的模型、空间坐标、旋转朝向以及关联的 3D 骨骼/场景动画。
 * 
 * 原混淆类: f.JC0
 */

import f.C8;
import f.I2;
import f.aux__0;
import f.es_1;
import f.ku_0;
import java.nio.ByteBuffer;

public class NdsBuildingPlacementEntry {
    public int im;
    public short eI;
    public short n4;
    public byte o;
    public short Sm;
    public C8 rt0;
    public ku_0 iK0;
    public final es_1 JA;
    public final es_1 O8;
    public ByteBuffer SZ;
    public int KJ;
    public boolean Di0;

    public NdsBuildingPlacementEntry() {
        this.JA = new es_1(4);
        this.O8 = new es_1(4);
        this.Di0 = false;
    }

    public final void ZJ() {
        if (this.Di0) {
            return;
        }
        this.SZ.position(this.KJ);
        this.iK0 = ku_0.zn(this.SZ);
        I2 i2 = this.O8.ZD();
        while (i2.hasNext()) {
            int n = (Integer)i2.next();
            this.SZ.position(n);
            aux__0 aux__02 = aux__0.ey0(this.SZ);
            if (aux__02 == null) continue;
            this.JA.Ue0((Object)aux__02);
        }
        this.Di0 = true;
    }
}
