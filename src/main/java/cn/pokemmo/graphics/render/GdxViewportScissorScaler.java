package cn.pokemmo.graphics.render;

import f.F70;
import f.lg_0;

/**
 * LibGDX 视口与高 DPI 屏幕裁剪适配器 (Gdx Viewport Scissor Scaler)
 * <p>
 * 当窗口在 HiDPI 或视口缩放模式下运行时，根据后台缓冲区与逻辑窗口分辨率比例，动态缩放 glViewport 与 glScissor 矩形区域。
 * <p>
 * 原始混淆类: {@code f.CI0}
 */
public class GdxViewportScissorScaler {

    public static final F70 OP = F70.Ap;

    public GdxViewportScissorScaler() {
    }

    /**
     * 缩放并设置 GL 裁剪矩形
     */
    public static void Ry(int n, int n2, int n3, int n4) {
        glScissor(n, n2, n3, n4);
    }

    public static void glScissor(int x, int y, int width, int height) {
        if (OP == F70.Ap && (lg_0.S4.Kr0() != lg_0.S4.cJ || lg_0.S4.sD0() != lg_0.S4.eP)) {
            int sx = JH0(x);
            int sy = vr(y);
            int sw = JH0(width);
            int sh = vr(height);
            lg_0.OH0.glScissor(sx, sy, sw, sh);
        } else {
            lg_0.OH0.glScissor(x, y, width, height);
        }
    }

    /**
     * 缩放并设置 GL 视口
     */
    public static void r40(int n, int n2, int n3, int n4) {
        glViewport(n, n2, n3, n4);
    }

    public static void glViewport(int x, int y, int width, int height) {
        if (OP == F70.Ap && (lg_0.S4.Kr0() != lg_0.S4.cJ || lg_0.S4.sD0() != lg_0.S4.eP)) {
            int sx = JH0(x);
            int sy = vr(y);
            int sw = JH0(width);
            int sh = vr(height);
            lg_0.OH0.glViewport(sx, sy, sw, sh);
        } else {
            lg_0.OH0.glViewport(x, y, width, height);
        }
    }

    /**
     * X 轴坐标缩放
     */
    public static int JH0(int n) {
        return scaleX(n);
    }

    public static int scaleX(int n) {
        return (int) (((float) (n * lg_0.S4.cJ)) / (float) lg_0.S4.Kr0());
    }

    /**
     * Y 轴坐标缩放
     */
    public static int vr(int n) {
        return scaleY(n);
    }

    public static int scaleY(int n) {
        return (int) (((float) (n * lg_0.S4.eP)) / (float) lg_0.S4.sD0());
    }
}
