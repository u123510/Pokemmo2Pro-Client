package cn.pokemmo.ui.window.misc;

import f.*;

import java.util.ArrayList;

/**
 * 边距辅助容器窗口
 *
 * 原混淆类: f.ur_2
 */
public class BasePaddingWindow extends R90 implements tr_1  {
    public final ur_2 asBridge() {
        return (ur_2) (Object) this;
    }

    public final BU D60;
    public final fy_2 cOM8;
    public final S70 Qt0;
    public final S70 Zh0;
    public final S70[] Bk;
    public final S70[] O60;
    public byte os0;
    public short fu0;
    public final S70[][] Zz;
    public final int[] lpT3;
    public final boolean[] Vh;
    public long oD;
    public byte[] ab0;
    public byte Cs;

    public BasePaddingWindow(BU v1) {
        this.os0 = 0;
        this.fu0 = 0;
        this.Zz = new S70[3][];
        this.lpT3 = new int[]{-750, -750, -750};
        this.Vh = new boolean[]{true, true, true};
        this.ab0 = null;
        this.Cs = 0;
        this.D60 = v1;
        Pb0(new LL(asBridge(), v1));
        LPT8(new N1(asBridge(), new gn_0((byte) -1, (byte) -1, (byte) -1, (byte) -1)));
        uf("base-frame");
        Hy(sm0_0.c0(1935));
        this.cOM8 = new fy_2();
        for (int i = 0; i < this.Zz.length; i++) {
            this.Zz[i] = new S70[GK.oM[i].length];
            for (int j = 0; j < GK.oM[i].length; j++) {
                this.Zz[i][j] = new S70(64, 64);
                this.Zz[i][j].JH().o60(new AG0[]{c20_0.eE0().e8(GK.oM[i][j])});
                this.Zz[i][j].JH().nq0(64, 64);
                this.cOM8.SL(this.Zz[i][j]);
            }
        }
        this.os0 = 0;
        this.Qt0 = new S70(425, 300);
        this.Qt0.JH().Nk(new Wr[]{c20_0.eE0().Cd0(this.os0)});
        this.Qt0.JH().Gy0(-52, -52);
        this.Qt0.JH().nq0(512, 512);
        this.cOM8.SL(this.Qt0);

        this.Zh0 = new S70(425, 300);
        this.Zh0.JH().Nk(new Wr[]{c20_0.eE0().Td(false, false, false, false, false)});
        this.Zh0.JH().Gy0(-52, -52);
        this.Zh0.JH().nq0(512, 512);
        this.Zh0.Ll(false);
        this.cOM8.SL(this.Zh0);

        this.Bk = new S70[4];
        for (int i = 0; i < this.Bk.length; i++) {
            this.Bk[i] = new S70(48, 48);
            this.Bk[i].JH().nq0(16, 32);
            this.cOM8.SL(this.Bk[i]);
        }

        this.O60 = new S70[4];
        for (int i = 0; i < this.O60.length; i++) {
            this.O60[i] = new S70(48, 48);
            this.O60[i].JH().o60(new AG0[]{c20_0.eE0().Mj0()});
            this.O60[i].JH().nq0(16, 32);
            this.cOM8.SL(this.O60[i]);
        }
        F80();
        SL(this.cOM8);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (!tw0_0.LD0.Rg0) {
            return super.nd0(v1);
        }
        if (E00.ZU(v1.zu) && v1.iT()) {
            int key = v1.finally$;
            if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(key)) {
                if (this.Cs == 0 && this.os0 <= 2) {
                    short coins = tw0_0.rl.k0.Lpt5;
                    if (this.os0 + 1 <= coins) {
                        this.os0++;
                        tw0_0.rl.k0.Lpt5--;
                        tw0_0.RE0.Hq0((byte) 0, (short) 88);
                        if (this.os0 > 3) {
                            this.os0 = 3;
                            if (this.Cs == 0) {
                                this.Cs = 1;
                                this.ab0 = null;
                                for (int i = 0; i < this.Zz.length; i++) {
                                    this.Vh[i] = false;
                                }
                                tw0_0.rl.Kv0(GI0.lN, this.os0);
                            }
                        }
                        F80();
                    }
                }
                if (this.Cs != 0) {
                    return true;
                }
                this.Qt0.og.Nk(new Wr[]{c20_0.eE0().Cd0(this.os0)});
                return true;
            }
            if (rp_0.nK0 != null && rp_0.nK0.Ov(key)) {
                if (this.os0 == 0 && this.Cs == 0) {
                    this.D60.U0(false);
                    tw0_0.rl.Kv0(GI0.lN, (byte) -1);
                }
            } else if (rp_0.sJ0 != null && rp_0.sJ0.Ov(key)) {
                byte cs = this.Cs;
                if (cs == 0 && this.os0 > 0) {
                    this.Cs = 1;
                    this.ab0 = null;
                    for (int i = 0; i < this.Zz.length; i++) {
                        this.Vh[i] = false;
                    }
                    tw0_0.rl.Kv0(GI0.lN, this.os0);
                    return true;
                }
                if (this.ab0 != null && cs == 1) {
                    for (int i = 0; i < this.Zz.length; i++) {
                        if (!this.Vh[i]) {
                            synchronized (this.lpT3) {
                                this.lpT3[i] = 24 - 48 * (this.ab0[i] + 1);
                            }
                            this.Vh[i] = true;
                            tw0_0.RE0.Hq0((byte) 0, (short) 24);
                            if (i == this.Zz.length - 1) {
                                ArrayList<Byte> winLines = new ArrayList<>();
                                byte bet = this.os0;
                                byte[] target = this.ab0;
                                byte[][] matrix = new byte[3][3];
                                for (int col = 0; col < 3; col++) {
                                    byte sym = target[col];
                                    if (sym == 0) {
                                        matrix[col][0] = GK.oM[col][GK.oM[col].length - 1];
                                    } else {
                                        matrix[col][0] = GK.oM[col][sym - 1];
                                    }
                                    matrix[col][1] = GK.oM[col][sym];
                                    if (sym == GK.oM[col].length - 1) {
                                        matrix[col][2] = GK.oM[col][0];
                                    } else {
                                        matrix[col][2] = GK.oM[col][sym + 1];
                                    }
                                }
                                short totalPayout = 0;
                                if (bet > 0) {
                                    short payout = GK.lPt3(matrix[0][1], matrix[1][1], matrix[2][1]);
                                    if (payout > 0) {
                                        totalPayout = payout;
                                        winLines.add((byte) 0);
                                    }
                                }
                                if (bet > 1) {
                                    short payoutTop = GK.lPt3(matrix[0][0], matrix[1][0], matrix[2][0]);
                                    if (payoutTop > 0) {
                                        totalPayout += payoutTop;
                                        winLines.add((byte) 1);
                                    }
                                    short payoutBottom = GK.lPt3(matrix[0][2], matrix[1][2], matrix[2][2]);
                                    if (payoutBottom > 0) {
                                        totalPayout += payoutBottom;
                                        winLines.add((byte) 2);
                                    }
                                }
                                if (bet > 2) {
                                    short payoutDiag1 = GK.lPt3(matrix[0][0], matrix[1][1], matrix[2][2]);
                                    if (payoutDiag1 > 0) {
                                        totalPayout += payoutDiag1;
                                        winLines.add((byte) 3);
                                    }
                                    short payoutDiag2 = GK.lPt3(matrix[0][2], matrix[1][1], matrix[2][0]);
                                    if (payoutDiag2 > 0) {
                                        totalPayout += payoutDiag2;
                                        winLines.add((byte) 4);
                                    }
                                }
                                if (totalPayout > 0) {
                                    this.Cs = 2;
                                    tw0_0.RE0.SA0((byte) 0, (short) 269);
                                    this.fu0 = totalPayout;
                                    Ao();
                                    this.os0 = 0;
                                    this.Qt0.og.Nk(new Wr[]{c20_0.eE0().Cd0(this.os0)});
                                    boolean l0 = winLines.contains((byte) 0);
                                    boolean l1 = winLines.contains((byte) 1);
                                    boolean l2 = winLines.contains((byte) 2);
                                    boolean l3 = winLines.contains((byte) 3);
                                    boolean l4 = winLines.contains((byte) 4);
                                    this.Zh0.og.Nk(new Wr[]{c20_0.eE0().Td(l0, l1, l2, l3, l4)});
                                    this.Zh0.Ll(true);
                                    _finally.HG().dH0(new ym0_0(asBridge()), 2.5f);
                                } else {
                                    MR();
                                }
                            }
                            for (int j = 0; j < this.Zz[i].length; j++) {
                                int offset;
                                if (j == 20 && this.ab0[i] == 0) {
                                    offset = -1;
                                } else if (j == 0 && this.ab0[i] == 20) {
                                    offset = 21;
                                } else {
                                    offset = j;
                                }
                                int x = si0_0.Fz(this.A20 + 140, 80, i, -10);
                                int y = si0_0.Fz(this.SB0 + 188 + this.lpT3[i], 48, offset, -7);
                                this.Zz[i][j].E40(x, y);
                                int diff = this.Zz[i][j].SB0 - this.SB0;
                                if (diff >= 50 && diff <= 240) {
                                    this.Zz[i][j].Ll(true);
                                } else {
                                    this.Zz[i][j].Ll(false);
                                }
                            }
                            return true;
                        }
                    }
                    return true;
                }
                return true;
            } else if (key == 66 && this.os0 == 3) {
                this.os0 = -1;
            }
        }
        return false;
    }

    public final void MR() {
        if (this.fu0 > 0) {
            this.Cs = 3;
            this.Zh0.Ll(true);
            e30_0 k0 = tw0_0.rl.k0;
            short nextCoins = (short) (k0.Lpt5 + 1);
            k0.Lpt5 = nextCoins;
            if (nextCoins > 9999) {
                k0.Lpt5 = 9999;
            }
            this.fu0--;
            F80();
            Ao();
            _finally.HG().dH0(new MT(asBridge()), 0.02f);
        } else {
            this.Cs = 0;
            this.os0 = 0;
            if (this.Zh0.eE) {
                this.Zh0.Ll(false);
            }
            if (!this.Qt0.eE) {
                this.Qt0.Ll(true);
            }
            this.Qt0.og.Nk(new Wr[]{c20_0.eE0().Cd0(this.os0)});
        }
    }

    @Override
    public final void HP(zk0_1 v1) {
        if (this.Cs == 2 && System.currentTimeMillis() - this.oD > 250L && this.Zh0 != null) {
            this.Zh0.Ll(!this.Zh0.eE);
            this.Qt0.Ll(!this.Zh0.eE);
            this.oD = System.currentTimeMillis();
        }
        synchronized (this.lpT3) {
            for (int i = 0; i < this.Zz.length; i++) {
                if (!this.Vh[i]) {
                    int next = this.lpT3[i] + 16;
                    this.lpT3[i] = next;
                    if (next > 0) {
                        this.lpT3[i] = -980;
                    }
                    sf0(i);
                }
            }
        }
        super.HP(v1);
    }

    @Override
    public final void K8() {
        oY(483, 327);
        this.cOM8.lt0();
        if (this.Qt0 != null) {
            this.Qt0.E40(this.A20 + 54, this.SB0 + 57);
        }
        if (this.Zh0 != null) {
            this.Zh0.E40(this.A20 + 54, this.SB0 + 57);
        }
        for (int i = 0; i < 4; i++) {
            this.Bk[i].E40(i * 14 + (this.A20 + 174) - 10, this.SB0 + 49);
        }
        for (int i = 0; i < 4; i++) {
            this.O60[i].E40(i * 14 + (this.A20 + 270) - 10, this.SB0 + 49);
        }
        sf0(0);
        sf0(1);
        sf0(2);
        super.K8();
    }

    public final void sf0(int i1) {
        for (int i2 = 0; i2 < this.Zz[i1].length; i2++) {
            int x = si0_0.Fz(this.A20 + 140, 80, i1, -10);
            int y = si0_0.Fz(this.SB0 + 188 + this.lpT3[i1], 48, i2, -7);
            this.Zz[i1][i2].E40(x, y);
            int diff = this.Zz[i1][i2].SB0 - this.SB0;
            if (diff >= 50 && diff <= 240) {
                this.Zz[i1][i2].Ll(true);
            } else {
                this.Zz[i1][i2].Ll(false);
            }
        }
    }

    public final void F80() {
        short coins = tw0_0.rl.k0.Lpt5;
        if (coins > 9999) {
            coins = 9999;
        }
        int d1000 = coins / 1000;
        int rem1000 = coins - d1000 * 1000;
        int d100 = rem1000 / 100;
        int rem100 = rem1000 - d100 * 100;
        int d10 = rem100 / 10;
        int d1 = rem100 - d10 * 10;
        this.Bk[0].og.o60(new AG0[]{c20_0.eE0().v50[d1000]});
        this.Bk[1].og.o60(new AG0[]{c20_0.eE0().v50[d100]});
        this.Bk[2].og.o60(new AG0[]{c20_0.eE0().v50[d10]});
        this.Bk[3].og.o60(new AG0[]{c20_0.eE0().v50[d1]});
    }

    public final void Ao() {
        int val = this.fu0;
        int d1000 = val / 1000;
        int rem1000 = val - d1000 * 1000;
        int d100 = rem1000 / 100;
        int rem100 = rem1000 - d100 * 100;
        int d10 = rem100 / 10;
        int d1 = rem100 - d10 * 10;
        this.O60[0].og.o60(new AG0[]{c20_0.eE0().v50[d1000]});
        this.O60[1].og.o60(new AG0[]{c20_0.eE0().v50[d100]});
        this.O60[2].og.o60(new AG0[]{c20_0.eE0().v50[d10]});
        this.O60[3].og.o60(new AG0[]{c20_0.eE0().v50[d1]});
    }
}
