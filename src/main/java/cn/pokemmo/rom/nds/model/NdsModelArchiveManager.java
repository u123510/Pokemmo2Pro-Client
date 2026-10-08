package cn.pokemmo.rom.nds.model;

import f.*;
public class NdsModelArchiveManager {
    public static ra0_0 Kr;
    public static FJ Do;
    public static FJ AI0;
    public static FJ Mn;
    public static FJ ME0;
    public static FJ GU;
    public static FJ kJ;
    public static FJ xF0;
    public static FJ Uk0;
    public static FJ nv0;

    public NdsModelArchiveManager() {
    }

    public static ra0_0 Ao0() {
        return Kr;
    }

    public static Ou0 UT(int i0) {
        int i = i0 * 2;
        return v80_0.Cb0().CW(Do, i + 9, new int[]{i + 10, -1, -1, -1});
    }

    public static Ou0 R1(int i0) {
        int i = i0 * 3;
        return v80_0.Cb0().CW(Do, i, new int[]{i + 1, i + 2, -1, -1});
    }

    public static Ou0 kh() {
        return v80_0.Cb0().CW(AI0, 0, new int[]{1, -1, -1, -1});
    }

    public static Ou0 S6(boolean z) {
        if (z) {
            return v80_0.Cb0().CW(Mn, 1, new int[]{8, 9, -1, -1});
        }
        return v80_0.Cb0().CW(Mn, 0, new int[]{6, 7, -1, -1});
    }

    public static Ou0 CoM4() {
        return v80_0.Cb0().CW(Mn, 3, new int[]{-1, 13, -1});
    }

    public static Ou0 MB() {
        return v80_0.Cb0().PC0(Mn, 4, true, false, false, new int[]{18, 19, 20, -1});
    }

    public static Ou0 zu0() {
        return v80_0.Cb0().PC0(Mn, 27, true, true, false, new int[]{-1, -1, -1, -1});
    }

    public static Ou0 eG0(int i0) {
        int i = i0 * 2;
        return v80_0.Cb0().CW(ME0, 0, new int[]{i + 11, i + 12, 1});
    }

    public static Ou0 M50(int i0) {
        Ou0 CW = v80_0.Cb0().CW(ME0, 2, new int[0]);
        for (int i = 0; i < 2; i++) {
            XR[] Rv = XR.Rv(1, new float[]{0.0f}, new float[]{((float) ((i0 * 2) + i)) * 0.125f}, new float[]{1.0f}, new float[]{1.0f});
            CW.Ru0(yr_1.pG("custom_", i), "geh", 0.05f, Rv, false);
        }
        return CW;
    }

    public static Ou0 ad(int i0) {
        int i = i0 * 2;
        return v80_0.Cb0().CW(ME0, i0 + 19, new int[]{i + 23, i + 24});
    }

    public static Ou0 bE0(boolean z) {
        int i = z ? 1 : 0;
        int i2 = i * 2;
        return v80_0.Cb0().CW(GU, i, new int[]{i2 + 3, i2 + 4});
    }

    public static Ou0 Xi() {
        return v80_0.Cb0().CW(GU, 2, new int[]{7, -1, -1, -1});
    }

    public static Ou0 y50() {
        return v80_0.Cb0().CW(kJ, 0, new int[]{1, 3, 5, 7, 2, 4, 6, 8});
    }

    public static Ou0 WD0() {
        return v80_0.Cb0().CW(xF0, 0, new int[]{3, 4});
    }

    public static Ou0 rH() {
        return v80_0.Cb0().CW(xF0, 1, new int[]{5, 6});
    }

    public static Ou0 EH0() {
        return v80_0.Cb0().CW(xF0, 2, new int[]{7, 8});
    }

    public static Ou0 Yi0() {
        return v80_0.Cb0().PC0(Uk0, 0, true, true, false, new int[]{4, 5, 6, 7, 8, 9, 10, 11});
    }

    public static Ou0 yu(boolean z) {
        int i = z ? 0 : 2;
        int i2 = z ? 2 : 1;
        return v80_0.Cb0().PC0(Uk0, i2, true, true, false, new int[]{i + 12, i + 13});
    }

    public static Ou0 kc() {
        return v80_0.Cb0().CW(Uk0, 16, new int[]{17});
    }

    public static Ou0 MO() {
        return v80_0.Cb0().CW(Uk0, 3, new int[]{18});
    }

    public static Ou0 JO() {
        return v80_0.Cb0().PC0(nv0, 0, false, false, false, new int[]{9, 11});
    }

    public static Ou0 GH0() {
        return v80_0.Cb0().PC0(nv0, 1, false, false, false, new int[]{8, 11, 12});
    }

    public static Ou0 Md() {
        return v80_0.Cb0().CW(nv0, 3, new int[]{23});
    }

    public static Ou0 Df() {
        return v80_0.Cb0().CW(nv0, 4, new int[]{9, 15, 19});
    }
}
