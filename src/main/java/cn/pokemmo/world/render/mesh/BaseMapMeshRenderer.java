package cn.pokemmo.world.render.mesh;

import f.XF0;
import f.gr_2;

/**
 * 3D 地形与建筑网格动态渲染器基类
 * 对应混淆基类: f.gr_2
 * 负责 3D 地图地形网格批处理渲染、水面透明着色、动态阴影及场景机关动画。
 */
public abstract class BaseMapMeshRenderer extends gr_2 {

    public BaseMapMeshRenderer(XF0 world) {
        super(world);
    }

    @SuppressWarnings("unchecked")
    public final <T extends gr_2> T asBridge() {
        return (T) (Object) this;
    }
}
