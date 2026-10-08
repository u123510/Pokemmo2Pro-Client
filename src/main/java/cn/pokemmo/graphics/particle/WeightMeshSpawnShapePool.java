package cn.pokemmo.graphics.particle;

import f.es_1;
import f.gs_1;

/**
 * 3D 粒子权重网格生成形状对象池
 */
public class WeightMeshSpawnShapePool {
    public final es_1 k;

    public WeightMeshSpawnShapePool() {
        this.k = new es_1(false, 10, gs_1.class);
    }
}
