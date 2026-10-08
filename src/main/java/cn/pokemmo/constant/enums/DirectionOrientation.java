package cn.pokemmo.constant.enums;

/**
 * 方向与朝向基类定义
 */
public class DirectionOrientation {
    public final int K8;

    public DirectionOrientation(int n) {
        this.K8 = n;
    }

    public int getId() {
        return this.K8;
    }

    public final int ad() {
        return getId();
    }
}
