package cn.pokemmo.rom.nds.terrain;

import f.qa0_0;
import f.rf0_1;
import f.zj_1;
import java.nio.ByteBuffer;

/**
 * NDS 3D 地形坡度与高程面元记录 (NDS Terrain Slope Record)
 * <p>
 * 包含局部坐标边界、面法线/坡度参数及高程基准，用于计算 3D 地形网格中任意局部坐标的高程。
 * <p>
 * 原始混淆类: {@code f.sq_0}
 */
public class NdsTerrainSlopeRecord {
    public final qa0_0 synchronized$;
    public final qa0_0 rt0;
    public final zj_1 Jc;
    public final rf0_1 Ug;

    public NdsTerrainSlopeRecord(NdsTerrainElevationChunk v1, ByteBuffer v2) {
        short i0 = v2.getShort();
        short i1 = v2.getShort();
        short i2 = v2.getShort();
        short i3 = v2.getShort();
        this.synchronized$ = v1.bB0()[i0];
        this.rt0 = v1.bB0()[i1];
        this.Ug = v1.xD0()[i2];
        this.Jc = v1.Xt0()[i3];
    }

    public final float oi(float f1, float f2) {
        rf0_1 ug = this.Ug;
        int az = ug.Az0;
        float f_div = 65536.0f / (float) az;
        float f0 = (ug.S30 * f_div) / 65536.0f;
        float f3 = (ug.nN * f_div) / 65536.0f;
        float f4 = 4096.0f / (float) az;
        return this.Jc.xU * f4 - (f0 * f1 - f0 / 2.0f) - (f3 * f2 - f3 / 2.0f);
    }
}
