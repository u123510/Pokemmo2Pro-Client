package cn.pokemmo.world.camera;

import f.*;

import java.util.LinkedList;

/**
 * 大世界地图镜头平滑跟随与视口追踪器 (World Map Camera Follower)
 *
 * 原始混淆类: f.com6__1
 */
public class WorldMapCameraFollower {
    
    public LinkedList k2 = new LinkedList();
    public short Q9 = 0;
    public short a6 = 0;
    public short Hf0 = 0;
    public short pr0 = 0;
    public long CJ = 0L;
    public long i9 = 0L;
    public long hL = 0L;
    public long fi = 0L;
    public int kr0 = 0;
    public int NA0 = 0;

    public WorldMapCameraFollower() {
    }

    public void Qf(nk_0... nk_0Array) {
        synchronized (this.k2) {
            for (nk_0 nk_02 : nk_0Array) {
                if (nk_02 != null) {
                    this.k2.add(nk_02);
                }
            }
        }
    }

    public void Ih() {
        long l;
        if (this.fi > (l = hk0_1.KG)) {
            return;
        }
        if (l - this.CJ <= (long) this.kr0) {
            return;
        }
        if (l - this.i9 <= 100L) {
            return;
        }
        synchronized (this.k2) {
            nk_0 nk_02 = (nk_0) this.k2.poll();
            if (nk_02 != null) {
                K50(nk_02);
            }
        }
    }

    public void cI0(short s, short s2) {
        this.Q9 = s;
        this.a6 = s2;
        this.Hf0 = s;
        this.pr0 = s2;
        this.NA0 = 0;
        this.CJ = 0L;
        this.i9 = 0L;
        this.hL = 0L;
        this.fi = 0L;
        this.kr0 = 0;
    }

    public int T50() {
        int n;
        short s;
        short s2;
        if ((n = this.NA0) > 0 && (s = this.Hf0) != (s2 = this.Q9)) {
            long l = hk0_1.KG - this.hL;
            int n2 = this.kr0 / n;
            if (l < (long) (Math.abs(s - s2) * n2)) {
                if (this.Hf0 > this.Q9) {
                    return this.Hf0 * 16 - (int) (l * 16L / (long) n2);
                }
                return this.Hf0 * 16 - (int) (l * 16L / (long) n2) * -1;
            }
        }
        short s3 = this.Q9;
        this.Hf0 = s3;
        return s3 * 16;
    }

    public int fO() {
        int n;
        short s;
        short s2;
        if ((n = this.NA0) > 0 && (s = this.pr0) != (s2 = this.a6)) {
            long l = hk0_1.KG - this.hL;
            int n2 = this.kr0 / n;
            if (l < (long) (Math.abs(s - s2) * n2)) {
                if (this.pr0 < this.a6) {
                    return this.pr0 * 16 + (int) (l * 16L / (long) n2);
                }
                return (int) (l * 16L / (long) n2) * -1 + this.pr0 * 16;
            }
        }
        short s3 = this.a6;
        this.pr0 = s3;
        return s3 * 16;
    }

    public float xf() {
        int n;
        short s;
        short s2;
        if ((n = this.NA0) > 0 && (s = this.Hf0) != (s2 = this.Q9)) {
            float f = (float) this.kr0 / (float) n;
            float f2 = (float) (hk0_1.KG - this.hL);
            if (f2 < (float) Math.abs(s - s2) * f) {
                if (this.Hf0 > this.Q9) {
                    return (float) this.Hf0 * 0.25f - f2 * 0.25f / f;
                }
                return (float) this.Hf0 * 0.25f - f2 * 0.25f / f * -1.0f;
            }
        }
        short s3 = this.Q9;
        this.Hf0 = s3;
        return (float) s3 * 0.25f;
    }

    public float Um0() {
        int n;
        short s;
        short s2;
        if ((n = this.NA0) > 0 && (s = this.pr0) != (s2 = this.a6)) {
            float f = (float) this.kr0 / (float) n;
            float f2 = (float) (hk0_1.KG - this.hL);
            if (f2 < (float) Math.abs(s - s2) * f) {
                if (this.pr0 < this.a6) {
                    return (float) this.pr0 * 0.25f + f2 * 0.25f / f;
                }
                return (float) this.pr0 * 0.25f + f2 * 0.25f / f * -1.0f;
            }
        }
        short s3 = this.a6;
        this.pr0 = s3;
        return (float) s3 * 0.25f;
    }

    public void K50(nk_0 nk_02) {
        short s = this.Q9;
        short s2 = this.a6;
        short s3;
        short s4;
        switch (nk_02.ml0) {
            case 0: {
                s3 = s;
                s4 = (short) (s2 + nk_02.Cb0);
                break;
            }
            case 1: {
                s3 = s;
                s4 = (short) (s2 - nk_02.Cb0);
                break;
            }
            case 2: {
                s3 = (short) (s - nk_02.Cb0);
                s4 = s2;
                break;
            }
            case 3: {
                s3 = (short) (s + nk_02.Cb0);
                s4 = s2;
                break;
            }
            default: {
                s3 = s;
                s4 = s2;
                break;
            }
        }
        switch (fc0_1.sL[nk_02.Xy0]) {
            case 1: {
                s3 = (short) (s - 1);
                s4 = (short) (s2 + 1);
                break;
            }
            case 2: {
                s3 = (short) (s + 1);
                s4 = (short) (s2 - 1);
                break;
            }
            case 3: {
                cI0((short) 0, (short) 0);
                return;
            }
        }
        this.Q9 = s3;
        this.a6 = s4;
        this.Hf0 = s;
        this.pr0 = s2;
        int n = nk_02.Cb0;
        this.NA0 = n;
        if (n > 0 || nk_02.tu0) {
            this.CJ = hk0_1.KG;
        } else {
            this.i9 = hk0_1.KG;
        }
        if (n > 0 || nk_02.tu0) {
            this.hL = hk0_1.KG;
        }
        int n2 = nk_02.h3;
        this.kr0 = n2;
        this.fi = (long) n2 + hk0_1.KG;
    }

    public static WorldMapCameraFollower getInstance() {
        return f.com6__1.WI0;
    }

    public int getPixelX() {
        return T50();
    }

    public int getPixelY() {
        return fO();
    }

    public float getWorldX() {
        return xf();
    }

    public float getWorldY() {
        return Um0();
    }

    public void resetCoordinates(short x, short y) {
        cI0(x, y);
    }

    public void update() {
        Ih();
    }

}
