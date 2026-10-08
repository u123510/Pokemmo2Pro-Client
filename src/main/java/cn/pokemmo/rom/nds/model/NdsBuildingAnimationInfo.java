package cn.pokemmo.rom.nds.model;

import f.es_1;
import f.l50_0;

/**
 * NDS 3D 建筑与地图动画元数据包装器
 * 
 * 职责:
 * 封装单座建筑实体的动画使能、类型、多套骨骼/材质动画列表 (Pv)。
 * 
 * 原混淆类: f.iy_0
 */
public class NdsBuildingAnimationInfo {
    public final l50_0 oD0;
    public boolean aM0;
    public byte YD0;
    public byte lPt2;
    public final es_1 Pv;

    public NdsBuildingAnimationInfo(l50_0 rom) {
        this.aM0 = false;
        this.YD0 = -1;
        this.lPt2 = -1;
        this.Pv = new es_1(4);
        this.oD0 = rom;
    }
}
