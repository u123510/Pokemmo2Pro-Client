package cn.pokemmo.net.session;

import f.*;

import java.util.ArrayList;

public class GameSessionHeartbeatHandler {
    public static final boolean PA;
    public final PJ0 Mc;
    public final ArrayList Z7;
    public final ArrayList VY;
    public final ArrayList kj0;
    public final StringBuilder S6;
    public final int sj0;
    public final int y50;
    public final int iI;
    public final int wa0;
    public final boolean Dk0;
    public int Wq0;
    public int Bf;
    public int BE;
    public int EF0;
    public int wm;
    public int Hn;
    public int zI0;
    public int FA;
    public int Xh;
    public int Za;
    public int OE0;
    public int vY;
    public int kh0;
    public int cF0;
    public int gv;
    public int ng;
    public boolean NL;
    public boolean x1;
    public boolean js;
    public ac0_2 Ij;
    public String oa;
    public D90 FA0;
    public final qw0_0 Mq0;

    static {
        PA = !qw0_0.class.desiredAssertionStatus();
    }

    public GameSessionHeartbeatHandler(qw0_0 qw0, PJ0 pj0, int i3, int i4, int i5, boolean i6) {
        this.Mq0 = qw0;
        this.VY = new ArrayList();
        this.kj0 = new ArrayList();
        this.S6 = new StringBuilder();
        this.Mc = pj0;
        this.Z7 = pj0.wJ0;
        this.sj0 = i3;
        int i2 = Math.max(0, pj0.Ug0 - i3 - i4);
        this.y50 = i2;
        this.iI = i5;
        this.wa0 = i3;
        this.Dk0 = i6;
        this.Bf = i3;
        this.Wq0 = i3;
        this.Za = i3;
        this.OE0 = i2;
        this.ng = i2;
        this.Ij = ac0_2.LpT3;
        if (!PA && !this.Z7.isEmpty()) {
            throw new AssertionError();
        }
    }

    public final void xQ() {
        int i1 = this.aH(this.Hn);
        this.Za = i1;
        this.OE0 = Math.max(0, this.XD(this.zI0) - i1);
        if (this.Sq0()) {
            this.Bf = this.Za;
        }
        this.ng = Math.min(this.ng, this.Zc0());
    }

    public final int aH(int i1) {
        int i2 = this.sj0 + Math.max(0, i1 - this.iI);
        for (int i3 = 0; i3 < this.VY.size(); i3++) {
            xt0_0 v2 = (xt0_0) this.VY.get(i3);
            i2 = Math.max(i2, v2.bW + v2.Ug0 + Math.max((int) v2.Oe0, i1));
        }
        return i2;
    }

    public final int XD(int i1) {
        int i2 = this.sj0 + this.y50 - Math.max(0, i1 - this.wa0);
        for (int i3 = 0; i3 < this.kj0.size(); i3++) {
            xt0_0 v2 = (xt0_0) this.kj0.get(i3);
            i2 = Math.min(i2, v2.bW - Math.max((int) v2.o6, i1));
        }
        return i2;
    }

    public final int Zc0() {
        return Math.max(0, this.OE0 - this.Bf + this.Za);
    }

    public final boolean Sq0() {
        return this.BE == this.Z7.size();
    }

    public final void zc0(xv_1 v1) {
        if (v1 == xv_1.lP) {
            return;
        }
        int i2 = -1;
        if (v1 == xv_1.oI || v1 == xv_1.tG0) {
            for (int i3 = 0; i3 < this.VY.size(); i3++) {
                xt0_0 v5 = (xt0_0) this.VY.get(i3);
                int i6 = v5.L70;
                if (i6 != 32767) {
                    i2 = Math.max(i2, v5.PS + i6);
                }
            }
        }
        if (v1 == xv_1.yq || v1 == xv_1.tG0) {
            for (int i1 = 0; i1 < this.kj0.size(); i1++) {
                xt0_0 v2 = (xt0_0) this.kj0.get(i1);
                i2 = Math.max(i2, v2.PS + v2.L70);
            }
        }
        if (i2 < 0) {
            return;
        }
        this.bN(false);
        if (i2 > this.Wq0) {
            this.Wq0 = i2;
            ArrayList v1_vy = this.VY;
            int i2_vy = v1_vy.size();
            while (--i2_vy > 0) {
                if (((xt0_0) v1_vy.get(i2_vy)).Pe0() <= this.Wq0) {
                    v1_vy.remove(i2_vy);
                }
            }
            ArrayList v1_kj = this.kj0;
            int i2_kj = v1_kj.size();
            while (--i2_kj > 0) {
                if (((xt0_0) v1_kj.get(i2_kj)).Pe0() <= this.Wq0) {
                    v1_kj.remove(i2_kj);
                }
            }
            this.xQ();
        }
    }

    public final void cM(int i1, int i2, int i3) {
        if (Math.max(0, this.XD(i3) - this.aH(i2)) >= i1) {
            return;
        }
        this.bN(false);
        while (true) {
            int i4 = Integer.MAX_VALUE;
            if (!this.VY.isEmpty()) {
                xt0_0 v5 = (xt0_0) this.VY.get(this.VY.size() - 1);
                if (v5.L70 != 32767) {
                    i4 = Math.min(i4, v5.Pe0());
                }
            }
            if (!this.kj0.isEmpty()) {
                xt0_0 v5 = (xt0_0) this.kj0.get(this.kj0.size() - 1);
                i4 = Math.min(i4, v5.Pe0());
            }
            if (i4 == Integer.MAX_VALUE || i4 < this.Wq0) {
                return;
            }
            this.Wq0 = i4;
            ArrayList v4_vy = this.VY;
            int i5_vy = v4_vy.size();
            while (--i5_vy > 0) {
                if (((xt0_0) v4_vy.get(i5_vy)).Pe0() <= this.Wq0) {
                    v4_vy.remove(i5_vy);
                }
            }
            ArrayList v4_kj = this.kj0;
            int i5_kj = v4_kj.size();
            while (--i5_kj > 0) {
                if (((xt0_0) v4_kj.get(i5_kj)).Pe0() <= this.Wq0) {
                    v4_kj.remove(i5_kj);
                }
            }
            this.xQ();
            if (Math.max(0, this.XD(i3) - this.aH(i2)) >= i1) {
                return;
            }
        }
    }

    public final boolean bN(boolean i1) {
        if (this.Sq0()) {
            if (this.x1 || !i1) {
                this.x1 = !i1;
                return false;
            }
        }
        this.ng = Math.min(this.ng, this.Zc0());
        int i2 = this.Wq0;
        int i3 = this.kh0;
        if (this.Sq0()) {
            i3 = Math.max(i3, this.vY);
        } else {
            for (int i4 = this.BE; i4 < this.Z7.size(); i4++) {
                i3 = Math.max(i3, ((xt0_0) this.Z7.get(i4)).L70);
            }
            xt0_0 v4 = (xt0_0) this.Z7.get(this.Z7.size() - 1);
            int i4_offset = (this.Za + this.OE0) - (v4.bW + v4.Ug0);
            int align = this.Ij.ordinal();
            if (align == 1) {
                for (int i5 = this.BE; i5 < this.Z7.size(); i5++) {
                    ((xt0_0) this.Z7.get(i5)).bW += i4_offset;
                }
            } else if (align == 2) {
                i4_offset /= 2;
                for (int i5 = this.BE; i5 < this.Z7.size(); i5++) {
                    ((xt0_0) this.Z7.get(i5)).bW += i4_offset;
                }
            } else if (align == 3) {
                if (i4_offset < this.OE0 / 4) {
                    int count = this.Z7.size() - this.BE;
                    for (int i6 = 1; i6 < count; i6++) {
                        ((xt0_0) this.Z7.get(this.BE + i6)).bW += (i4_offset * i6) / (count - 1);
                    }
                }
            }
            for (int i4 = this.BE; i4 < this.Z7.size(); i4++) {
                xt0_0 v5 = (xt0_0) this.Z7.get(i4);
                D90 ph = v5.oJ.Ph;
                this.Mq0.getClass();
                qi_2 va = (qi_2) ph.x90(I0.VERTICAL_ALIGNMENT).Kj0(I0.VERTICAL_ALIGNMENT);
                switch (va.ordinal()) {
                    case 0:
                        v5.PS = 0;
                        break;
                    case 1:
                        v5.PS = (i3 - v5.L70) / 2;
                        break;
                    case 2:
                        v5.PS = i3 - v5.L70;
                        break;
                    case 3:
                        v5.PS = 0;
                        v5.L70 = i3;
                        break;
                    default:
                        break;
                }
                i2 = Math.max(i2, Math.max(this.FA, this.Wq0 + (v5.dd - v5.PS)));
                this.Xh = Math.max(this.Xh, v5.Pe0() - i3);
            }
            for (int i4 = this.BE; i4 < this.Z7.size(); i4++) {
                ((xt0_0) this.Z7.get(i4)).PS += i2;
            }
        }
        this.Og(i2, i3);
        this.kh0 = 0;
        this.BE = this.Z7.size();
        this.x1 = !i1;
        int i1_new = i2 + i3;
        this.Wq0 = i1_new;
        this.FA = Math.max(this.FA, i1_new + this.Xh);
        this.Xh = 0;
        this.wm = 0;

        ArrayList v1_vy = this.VY;
        int i2_vy = v1_vy.size();
        while (--i2_vy > 0) {
            if (((xt0_0) v1_vy.get(i2_vy)).Pe0() <= this.Wq0) {
                v1_vy.remove(i2_vy);
            }
        }
        ArrayList v1_kj = this.kj0;
        int i2_kj = v1_kj.size();
        while (--i2_kj > 0) {
            if (((xt0_0) v1_kj.get(i2_kj)).Pe0() <= this.Wq0) {
                v1_kj.remove(i2_kj);
            }
        }
        this.xQ();
        return true;
    }

    public final void oq0() {
        this.bN(false);
        this.zc0(xv_1.tG0);
        this.Og(this.Wq0, 0);
        int length = this.S6.length();
        char[] chars = new char[length];
        this.Mc.me = chars;
        this.S6.getChars(0, length, chars, 0);
    }

    public final void ok0(D90 v1, Y30 v2, boolean i3) {
        if (v2 != null) {
            this.vY = ((zb0_2) v2).getLineHeight();
        } else {
            this.vY = 0;
        }
        if (i3) {
            this.bN(false);
            this.NL = true;
        }
        if (i3 || (!this.NL && this.Sq0())) {
            this.Hn = Math.max(0, this.Mq0.gA(v1, I0.MARGIN_LEFT, this.y50, 0));
            this.zI0 = Math.max(0, this.Mq0.gA(v1, I0.MARGIN_RIGHT, this.y50, 0));
            this.Mq0.getClass();
            this.Ij = (ac0_2) v1.x90(I0.HORIZONTAL_ALIGNMENT).Kj0(I0.HORIZONTAL_ALIGNMENT);
            this.xQ();
            this.Bf = Math.max(0, this.Za + this.Mq0.gA(v1, I0.TEXT_INDENT, this.y50, 0));
        }
        this.wm = Math.max(0, this.Mq0.gA(v1, I0.MARGIN_TOP, this.y50, 0));
    }

    public final xt0_0 X50(ay_0 v1) {
        xt0_0 v2 = new xt0_0(v1);
        v2.PS = this.Wq0;
        v2.bW = this.sj0;
        v2.Ug0 = this.y50;
        this.Mc.ct.add(v2);
        return v2;
    }

    public final void Og(int i1, int i2) {
        while (this.EF0 < this.Mc.ct.size()) {
            xt0_0 v3 = (xt0_0) this.Mc.ct.get(this.EF0++);
            if (v3.L70 == 0) {
                v3.PS = i1;
                v3.L70 = i2;
            }
        }
        if (this.BE > this.cF0) {
            this.S6.append((char) 0);
            this.S6.append((char) (this.BE - this.cF0));
        }
        if (i1 > this.gv) {
            this.S6.append((char) i1);
            this.S6.append((char) 0);
        }
        int i1_new = i1 + i2;
        this.gv = i1_new;
        this.S6.append((char) i1_new);
        this.S6.append((char) (this.Z7.size() - this.BE));
        this.cF0 = this.Z7.size();
    }
}
