package cn.pokemmo.item;

import f.*;

public class ItemInventoryStackManager {
    public final byte GV;
    public final Ou0 L;
    public final Bp0 iY;
    public final Bp0 CO;
    public Bp0 gj;
    public int PC;
    public float d6;
    public float fh0;
    public final Bp0 jz;
    public final Bp0 jX;
    public E90 Iw0;
    public KF Ka;
    public final C8 nP;
    public float Qo;
    public final /* synthetic */ bj0_1 Sq;

    public ItemInventoryStackManager(bj0_1 parent, byte gv) {
        this.Sq = parent;
        this.iY = new Bp0();
        this.CO = new Bp0();
        this.gj = null;
        this.jz = new Bp0();
        this.jX = new Bp0();
        this.Iw0 = null;
        this.Ka = null;
        this.nP = new C8();
        this.Qo = 0.0f;
        this.GV = gv;
        v80_0 cb = v80_0.Cb0();
        byte v7 = (gv == 1) ? (byte) 121 : (byte) 120;
        this.L = v80_0.sb(v7, 4, false);
        this.L.sY = false;
        parent.yS(this.L);
        if (gv == 1) {
            this.iY.FF(9.0f, 58.0f);
            this.PC = 1;
            this.fh0 = -90.0f;
            this.d6 = -90.0f;
        } else if (gv == 2) {
            this.iY.FF(13.0f, 75.0f);
        } else {
            this.iY.FF(14.0f, 32.0f);
        }
        this.CO.nA0(this.iY);
        Ih();
    }

    public final void O1(E90 v1, short i2, short i3) {
        if (this.iY.Ht((float) i2, (float) i3)) {
            if (KU(this.PC, this.iY) && KU(this.PC + 1, this.iY)) {
                v1.il0.Cp(() -> Ph0(v1));
            } else {
                tw0_0.RE0.d00(true, (byte) 4, (short) 1628, 0.0f);
            }
        }
        if (this.jz.Ht((float) i2, (float) i3)) {
            v1.il0.Cp(() -> r60(v1, i2, i3));
        }
        if (this.jX.Ht((float) i2, (float) i3)) {
            v1.il0.Cp(() -> oH(v1, i2, i3));
        }
    }

    public final void Ih() {
        Bp0 target = (this.gj != null) ? this.gj : this.iY;
        if (!this.CO.SE0(target)) {
            float speed = 10.0f;
            if (this.CO.y < target.y) {
                float ny = this.CO.y + lg_0.S4.uL * speed;
                this.CO.y = ny;
                if (ny >= target.y) {
                    this.CO.y = target.y;
                }
            } else if (this.CO.y > target.y) {
                float ny = this.CO.y - lg_0.S4.uL * speed;
                this.CO.y = ny;
                if (ny <= target.y) {
                    this.CO.y = target.y;
                }
            } else if (this.CO.x < target.x) {
                float nx = this.CO.x + lg_0.S4.uL * speed;
                this.CO.x = nx;
                if (nx >= target.x) {
                    this.CO.x = target.x;
                }
            } else if (this.CO.x > target.x) {
                float nx = this.CO.x - lg_0.S4.uL * speed;
                this.CO.x = nx;
                if (nx <= target.x) {
                    this.CO.x = target.x;
                }
            }
        }
        if (this.CO.SE0(target)) {
            if (this.gj != null) {
                this.gj = null;
            } else if (this.Iw0 != null) {
                this.Iw0.il0.f60(null, false, C8.Zero);
                this.Iw0.rd.il0.f60(null, false, C8.Zero);
                this.Iw0 = null;
                tw0_0.RE0.wp0((byte) 4, (short) 1627);
                tw0_0.RE0.d00(true, (byte) 4, (short) 1628, 0.0f);
            }
        }
        if (!LW.LH0(this.d6, this.fh0)) {
            if (this.d6 < this.fh0) {
                float nd = this.d6 + lg_0.S4.uL * 180.0f;
                this.d6 = nd;
                if (nd >= this.fh0) {
                    this.d6 = this.fh0;
                }
            } else {
                float nd = this.d6 - lg_0.S4.uL * 180.0f;
                this.d6 = nd;
                if (nd <= this.fh0) {
                    this.d6 = this.fh0;
                }
            }
            C8 v1 = new C8();
            this.L.ho.V1(v1);
            v1.Fg0(4.0f);
            this.nP.Vy(this.nP.x, this.nP.z, this.nP.y).Fg0(-0.25f);
            C8 v2 = new C8(0.0f, 0.0f, 1.0f);
            float tmp = v2.y;
            v2.y = v2.z;
            v2.z = tmp;
            v2.YO(v2, -(this.d6 - this.Qo));
            this.Ka.il0.f60(this.L, false, v1);
        }
        if (LW.LH0(this.d6, this.fh0) && this.Ka != null) {
            C8 rz = this.Ka.il0.rZ;
            byte dir = 0;
            switch (this.Ka.ba0.Y30) {
                case 0:
                    dir = 2;
                    break;
                case 1:
                    dir = 3;
                    break;
                case 2:
                    dir = 1;
                    break;
                case 3:
                    dir = 0;
                    break;
            }
            short sx = (short) Math.round(this.CO.x + rz.x * 4.0f);
            short sy = (short) Math.round(this.CO.y + rz.y * 4.0f);
            this.Ka.ba0.PX(false, sx, sy, (byte) 0, dir);
            this.Ka.il0.f60(null, false, C8.Zero);
            this.Ka = null;
            tw0_0.RE0.wp0((byte) 4, (short) 1627);
            tw0_0.RE0.d00(true, (byte) 4, (short) 1628, 0.0f);
        }
        this.jz.x = this.iY.x - 1.0f;
        this.jz.y = this.iY.y + 0.0f;
        this.jz.ub0(this.iY, (float) (this.PC * 90));

        this.jX.x = this.iY.x + 1.0f;
        this.jX.y = this.iY.y + 0.0f;
        this.jX.ub0(this.iY, (float) (this.PC * 90));

        this.L.ho.CN(C8.Y, this.d6);
        this.L.ho.m80((this.CO.x + 0.5f) * 0.25f, 0.75f, (this.CO.y + 0.5f) * 0.25f);
    }

    public final boolean KU(int i1, Bp0 v2) {
        if (i1 > 3) {
            i1 = 0;
        }
        Bp0 v3 = new Bp0();
        short[][] v4 = (this.GV == 1) ? bj0_1.iH0 : bj0_1.vn0;
        for (int i6 = 0; i6 < v4.length; i6++) {
            short[] v7 = v4[i6];
            v3.x = v2.x + (float) v7[0];
            v3.y = v2.y + (float) v7[1];
            if (i1 != 0) {
                v3.ub0(v2, (float) (i1 * 90));
            }
            Ll0 block = this.Sq.WK.rc0((byte) 0, (short) Math.round(v3.x), (short) Math.round(v3.y));
            if (block == null || block.re() != 44) {
                return false;
            }
        }
        return true;
    }

    public final void L7() {
        tw0_0.rl.xm = this::fv0;
    }

    public final void Am(E90 v1, short i2, short i3, boolean i4) {
        int max = (this.GV == 1) ? 4 : 5;
        int i6 = 0;
        Bp0 v7 = new Bp0();
        for (; i6 < max; i6++) {
            int step = i6 + 1;
            Bp0 v9 = new Bp0();
            float offset = i4 ? (float) (-step) : (float) step;
            v9.x = offset;
            v9.y = 0.0f;
            double rad = (double) ((float) (this.PC * 90) * 0.0174532924f);
            float cos = (float) Math.cos(rad);
            float sin = (float) Math.sin(rad);
            float nx = v9.x * cos - v9.y * sin;
            float ny = v9.x * sin + v9.y * cos;
            v9.x = (float) Math.round(nx);
            v9.y = (float) Math.round(ny);
            Bp0 v11 = new Bp0(this.iY);
            v11.x += v9.x;
            v11.y += v9.y;
            int rot = (this.PC > 3) ? 0 : this.PC;
            Bp0 v12 = new Bp0();
            short[] minBound = (this.GV == 1) ? bj0_1.Ue[0] : bj0_1.lPt5[0];
            short[] maxBound = (this.GV == 1) ? bj0_1.Ue[1] : bj0_1.lPt5[1];
            boolean canMove = true;
            for (short i15 = minBound[0]; i15 <= maxBound[0]; i15++) {
                for (short i16 = minBound[1]; i16 <= maxBound[1]; i16++) {
                    v12.x = v11.x + (float) i15;
                    v12.y = v11.y + (float) i16;
                    if (rot != 0) {
                        v12.ub0(v11, (float) (rot * 90));
                    }
                    Ll0 block = this.Sq.WK.rc0((byte) 0, (short) Math.round(v12.x), (short) Math.round(v12.y));
                    if (block == null || block.re() != 44) {
                        canMove = false;
                        break;
                    }
                }
                if (!canMove) {
                    break;
                }
            }
            if (!canMove) {
                break;
            }
            v7 = v9;
        }
        if (i6 < 1) {
            return;
        }
        Bp0 v5 = new Bp0(this.iY);
        v5.x += v7.x;
        v5.y += v7.y;
        boolean isAtLimit = (i6 == max);
        C8 v3 = new C8((float) i2 - this.iY.x, (float) i3 - this.iY.y, 0.0f).Fg0(0.25f);
        C8 v4 = new C8(v1.rd.il0.t60);
        C8 v8 = new C8();
        this.L.ho.V1(v8);
        v8.Fg0(4.0f);
        v8.Vy(v8.x, v8.z, v8.y).Fg0(-0.25f);
        v4.x = v8.x;
        v4.y = v8.z;
        v4.z = v8.y;
        this.Iw0 = v1;
        v1.il0.f60(this.L, false, v3);
        v1.rd.il0.f60(this.L, false, v4);
        if (isAtLimit) {
            this.iY.x = v5.x;
            this.iY.y = v5.y;
            v1.ba0.PX(false, (short) ((int) ((float) i2 + v7.x)), (short) ((int) ((float) i3 + v7.y)), (byte) 0, this.Iw0.ba0.Y30);
            v1.rd.ba0.PX(false, (short) Math.round(this.iY.x + v4.x * 4.0f), (short) Math.round(this.iY.y + v4.y * 4.0f), (byte) 0, v1.rd.ba0.Y30);
        } else {
            this.gj = v5;
        }
        tw0_0.RE0.Hq0((byte) 4, (short) 1627);
        L7();
    }

    public final boolean fv0(boolean i1, int i2) {
        if (tw0_0.e60 != null && tw0_0.e60.N60() != null) {
            _else n60 = tw0_0.e60.N60();
            if (J4.p5(n60.Bm0, n60.case$) == this.Sq.gq0()) {
                if (!LW.LH0(this.d6, this.fh0) || !this.CO.SE0(this.iY) || this.gj != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final /* synthetic */ void oH(E90 v1, short i2, short i3) {
        Am(v1, i2, i3, false);
    }

    public final /* synthetic */ void r60(E90 v1, short i2, short i3) {
        Am(v1, i2, i3, true);
    }

    public final void Ph0(E90 v1) {
        this.PC++;
        if (this.PC > 3) {
            this.PC = 0;
        }
        this.fh0 -= 90.0f;
        this.Ka = v1.rd;
        this.nP.np(v1.rd.il0.t60);
        this.Qo = this.d6;
        tw0_0.RE0.Hq0((byte) 4, (short) 1627);
        L7();
    }
}
