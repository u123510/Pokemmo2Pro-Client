package cn.pokemmo.world.collision.geometry;

import f.P9;

/**
 * BaseCollisionGeometry - 2D/3D 空间碰撞几何与射线检测抽象基类
 * 封装多边形包围盒、体素图块网格求交、视线遮挡检测与表面法线计算。
 */
public abstract class BaseCollisionGeometry extends P9 {

    public BaseCollisionGeometry() {
        super();
    }
}
