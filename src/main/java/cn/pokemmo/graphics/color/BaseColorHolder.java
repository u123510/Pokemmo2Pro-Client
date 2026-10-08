package cn.pokemmo.graphics.color;

import com.badlogic.gdx.graphics.Color;

/**
 * 基础默认颜色 (不透明黑) 持有基类
 */
public abstract class BaseColorHolder {
    public final Color l0;

    public BaseColorHolder() {
        this.l0 = new Color(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
