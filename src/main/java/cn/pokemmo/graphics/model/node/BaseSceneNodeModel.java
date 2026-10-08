package cn.pokemmo.graphics.model.node;

import f.Ou0;
import f.u4_0;
import f.ut_0;

/**
 * BaseSceneNodeModel - 3D 场景图模型节点网格渲染抽象基类
 * 扩展底层 3D 场景图节点 (Ou0)，管理网格渲染实例、几何矩阵变换与局部坐标系。
 */
public abstract class BaseSceneNodeModel extends Ou0 {

    public BaseSceneNodeModel(ut_0 resources, String name, float opacity, u4_0 controller) {
        super(resources, name, opacity, controller);
    }

    public BaseSceneNodeModel(Ou0 other) {
        super(other);
    }
}
