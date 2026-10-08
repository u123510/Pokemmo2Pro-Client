package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.R30
 */
public class Modern_Battle_R30 {

    public static final C8 VD0;

    protected Modern_Battle_R30() {
    }

    public static boolean cf(iq0_0 bounds, C8 min, C8 size) {
        C8 origin = bounds.Vq;
        float sx = 1.0f / origin.x;
        float sy = 1.0f / origin.y;
        float sz = 1.0f / origin.z;
        C8 offset = bounds.er0;

        float x0 = (min.x - size.x * 0.5f - offset.x) * sx;
        float x1 = (size.x * 0.5f + min.x - offset.x) * sx;
        if (x0 > x1) { float t = x0; x0 = x1; x1 = t; }
        float y0 = (min.y - size.y * 0.5f - offset.y) * sy;
        float y1 = (size.y * 0.5f + min.y - offset.y) * sy;
        if (y0 > y1) { float t = y0; y0 = y1; y1 = t; }
        float z0 = (min.z - size.z * 0.5f - offset.z) * sz;
        float z1 = (size.z * 0.5f + min.z - offset.z) * sz;
        if (z0 > z1) { float t = z0; z0 = z1; z1 = t; }

        float lower = Math.max(Math.max(x0, y0), z0);
        float upper = Math.min(Math.min(x1, y1), z1);
        return upper >= 0.0f && upper >= lower;
    }

    public static boolean pY(Bp0 a, Bp0 b, Bp0 c, Bp0 d, Bp0 result) {
        float x0 = a.x;
        float y0 = a.y;
        float x1 = b.x;
        float y1 = b.y;
        float x2 = c.x;
        float y2 = c.y;
        float x3 = d.x;
        float dy = d.y - y2;
        float dx = x1 - x0;
        float sideX = x3 - x2;
        float sideY = y1 - y0;
        float denominator = dy * dx - sideX * sideY;
        if (denominator == 0.0f) return false;
        float offsetY = y0 - y2;
        float u = (sideX * offsetY - dy * (x0 - x2)) / denominator;
        if (u < 0.0f || u > 1.0f) return false;
        float v = (dx * offsetY - sideY * (x0 - x2)) / denominator;
        if (v < 0.0f || v > 1.0f) return false;
        result.x = dx * u + x0;
        result.y = sideY * u + y0;
        return true;
    }

    static {
        VD0 = new C8();
    }
}

