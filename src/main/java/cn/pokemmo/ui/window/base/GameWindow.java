package cn.pokemmo.ui.window.base;

import f.cx_0;

/**
 * 游戏受管窗口基类 (Managed Game Window)
 * 封装并桥接底层的混淆窗口逻辑 (f.cx_0)，支持自动注册到全局 Qy0 窗口调度器。
 * 提供窗口标题、尺寸、坐标及开关控制等现代面向对象 API。
 *
 * 原混淆基类: f.cx_0
 */
public abstract class GameWindow extends cx_0 {

    public GameWindow(boolean enabled) {
        super(enabled);
    }

    public GameWindow(boolean enabled, boolean superEnabled) {
        super(enabled, superEnabled);
    }

    /**
     * 设置窗口标题
     */
    public void setTitle(String title) {
        this.Hy(title != null ? title : "");
    }

    /**
     * 设置窗口尺寸
     */
    public void setWindowSize(int width, int height) {
        this.oY(width, height);
    }

    /**
     * 设置窗口在屏幕上的绝对坐标
     */
    public void setWindowPosition(int x, int y) {
        this.E40(x, y);
    }

    /**
     * 设置是否允许拖拽标题栏移动窗口
     */
    public void setMovable(boolean movable) {
        this.bD(movable);
    }

    /**
     * 设置是否允许通过边框缩放窗口
     */
    public void setResizable(boolean resizable) {
        this.ff0(resizable ? 4 : 1);
    }

    /**
     * 关闭窗口
     */
    public void close() {
        if (this.Lr0 != null && this.Lr0.ER != null) {
            f.a7_0.bH(this.Lr0.ER.Fc0);
        } else {
            this.AD(false);
        }
    }
}
