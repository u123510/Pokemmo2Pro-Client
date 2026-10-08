package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

public class ScriptDialogPacket extends GH {
    public static final int cOM2 = 0;
    public byte jg0;
    public jm_1 cg0;
    public int kP;
    public CH0 nf0;
    public int vb;
    public long Bf;
    public iz0_0[] CoM5;
    public CH0 bf;
    public String tI;
    public byte my0;
    public byte yW;
    public byte Qo0;
    public byte C4;
    public Cq fl0;
    public boolean e80;
    public boolean zl0;
    public boolean a;
    public byte Df0;
    public byte Jh0;
    public lq0[] Mz;
    public byte Ao0;
    public String yE0;
    public nl0_0 Fe;
    public short[] FA;
    public short[] yK0;
    public byte LPT2;
    public byte nE0;
    public byte iy;
    public short mR;
    public byte cv;
    public short Kz0;
    public byte Gw0;
    public final S0 Lpt8;
    public final String nD;

    public ScriptDialogPacket(String v1, jm_1 v2, CH0 v3, S0 v4) {
        super(null, null);
        this.nf0 = CH0.j1;
        this.Bf = 0L;
        this.C4 = -1;
        this.e80 = false;
        this.zl0 = false;
        this.a = false;
        this.Df0 = 0;
        this.Jh0 = 0;
        this.Mz = lq0.CoM4;
        this.Ao0 = 0;
        this.FA = new short[0];
        this.yK0 = new short[0];
        this.nD = v1;
        this.cg0 = v2;
        this.nf0 = v3;
        this.Lpt8 = v4;
    }

    public ScriptDialogPacket(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
        this.nf0 = CH0.j1;
        this.Bf = 0L;
        this.C4 = -1;
        this.e80 = false;
        this.zl0 = false;
        this.a = false;
        this.Df0 = 0;
        this.Jh0 = 0;
        this.Mz = lq0.CoM4;
        this.Ao0 = 0;
        this.FA = new short[0];
        this.yK0 = new short[0];
        this.Lpt8 = null;
        this.nD = null;
    }

    @Override
    public final void Oj0() {
        this.jg0 = this.Rj.get();
        this.cg0 = (jm_1) jm_1.LI0.BM(this.Rj.get());
        this.kP = this.Rj.getInt();
        this.nf0 = this.pE();
        this.vb = this.Rj.getInt();
        this.CoM5 = new iz0_0[this.Rj.get() & 0xFF];
        for (int i1 = 0; i1 < this.CoM5.length; i1++) {
            this.CoM5[i1] = this.vG();
        }

        switch (ud_0.SX[this.cg0.an]) {
            case 1:
                this.tI = this.q60();
                this.fl0 = Cq.Gl(this.Rj.get());
                this.Jh0 = this.Rj.get();
                this.my0 = this.Rj.get();
                byte b = this.Rj.get();
                this.Ao0 = b;
                this.e80 = (b & 1) != 0;
                this.zl0 = (b & 2) != 0;
                this.a = (b & 4) != 0;
                if ((b & 8) != 0) {
                    this.Df0 = this.Rj.get();
                }
                if ((this.Ao0 & 16) != 0) {
                    this.Mz = this.Nx0();
                }
                if ((this.Ao0 & 32) != 0) {
                    this.C4 = this.Rj.get();
                } else {
                    this.yW = this.Rj.get();
                    this.Qo0 = this.Rj.get();
                }
                break;
            case 2:
            case 3:
            case 4:
                this.tI = this.q60();
                break;
            case 5:
                this.tI = this.q60();
                this.yE0 = this.q60();
                break;
            case 7:
                this.iy = this.Rj.get();
                this.LPT2 = this.Rj.get();
                this.mR = this.Rj.getShort();
                break;
            case 8:
            case 9:
                this.FA = new short[this.Rj.get() & 0xFF];
                for (int i1 = 0; i1 < this.FA.length; i1++) {
                    this.FA[i1] = this.Rj.getShort();
                }
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                this.FA = new short[this.Rj.get() & 0xFF];
                for (int i1 = 0; i1 < this.FA.length; i1++) {
                    this.FA[i1] = this.Rj.getShort();
                }
                break;
            case 15:
                this.bf = this.pE();
                break;
            case 16:
                this.bf = this.pE();
                this.FA = new short[] { this.Rj.getShort() };
                break;
            case 17:
                this.bf = this.pE();
                this.Fe = (nl0_0) nl0_0.Fd.BM(this.Rj.get());
                this.FA = new short[this.Rj.get() & 0xFF];
                for (int i1 = 0; i1 < this.FA.length; i1++) {
                    this.FA[i1] = this.Rj.getShort();
                }
                break;
            case 18:
            case 19:
                this.FA = new short[this.Rj.get() & 0xFF];
                for (int i1 = 0; i1 < this.FA.length; i1++) {
                    this.FA[i1] = this.Rj.getShort();
                }
                this.yK0 = new short[this.Rj.get() & 0xFF];
                for (int i1 = 0; i1 < this.yK0.length; i1++) {
                    this.yK0[i1] = this.Rj.getShort();
                }
                break;
            case 20:
                this.LPT2 = this.Rj.get();
                this.nE0 = this.Rj.get();
                this.iy = this.Rj.get();
                break;
            case 21:
                this.FA = new short[this.Rj.get() & 0xFF];
                for (int i1 = 0; i1 < this.FA.length; i1++) {
                    this.FA[i1] = this.Rj.getShort();
                }
                break;
            case 23:
                this.cv = this.Rj.get();
                this.Kz0 = this.Rj.getShort();
                this.Gw0 = this.Rj.get();
                break;
        }
    }

    @Override
    public final void os0() {
        if (this.vb > 0) {
            this.Bf = System.currentTimeMillis() + (long) this.vb;
        }
        BR v1 = (BR) this.sr0();
        if (tw0_0.LD0.KJ0 != null || v1.lZ == null || v1.lZ.zK0 == null) {
            _finally.HG().dH0(new NP((kt_0) this), 0.1f);
            return;
        }
        if (this.cg0 == jm_1.HQ) {
            iw_1 iw = tw0_0.FL.Py0();
            if (iw != null) {
                iw.wQ();
            }
            return;
        }

        int sx = ud_0.SX[this.cg0.an];
        switch (sx) {
            case 1:
                BU zK0_1 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_1 != null) {
                    zK0_1.X10(this.jg0, this.tI, this.my0, this.yW, this.Qo0, this.C4, this.fl0, this.e80, this.zl0, this.a, this.Df0, this.Jh0, this.Mz);
                }
                break;
            case 2:
                BU zK0_2 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_2 != null) {
                    lg_0.k.lPT5(new bp_0(zK0_2, this.jg0, this.tI));
                }
                break;
            case 3:
                BU zK0_3 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_3 != null) {
                    lg_0.k.lPT5(new so_1(zK0_3, this.jg0, this.tI));
                }
                break;
            case 4:
                BU zK0_4 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_4 != null) {
                    lg_0.k.lPT5(new Vj0(zK0_4, this.jg0, this.tI));
                }
                break;
            case 5:
                BU zK0_5 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_5 != null) {
                    lg_0.k.lPT5(new pf_1(zK0_5, this.jg0, this.tI, this.yE0));
                }
                break;
            case 13:
                short s = this.FA[0];
                if (s == 495) {
                    tw0_0.LD0.S00(this.jg0, (byte) 2, false);
                } else if (s == 387) {
                    tw0_0.LD0.S00(this.jg0, (byte) 3, false);
                } else if (s == 1) {
                    tw0_0.LD0.S00(this.jg0, (byte) 2, true);
                } else if (s == 152) {
                    tw0_0.LD0.S00(this.jg0, (byte) 4, false);
                } else {
                    tw0_0.FL.iQ((kt_0) this);
                }
                break;
            case 17:
                VU vu = this.sr0().PC0.sF(this.bf);
                if (vu == null) {
                    this.sr0().ze0(this.jg0, (byte) 0);
                    return;
                }
                BU zK0_17 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_17 != null) {
                    zK0_17.MJ(this.FA, this.Fe, this.jg0, vu);
                }
                break;
            case 19:
                ArrayList list = new ArrayList();
                for (int i2 = 0; i2 < this.FA.length; i2++) {
                    short id = this.FA[i2];
                    cq_0 cq = (cq_0) mp_1.vf0().k2.get(Short.valueOf(id));
                    list.add(new lpt2__5(cq, cr_0.u90, this.yK0[i2], i2));
                }
                BR br19 = (BR) this.sr0();
                BU zK0_19 = br19.lZ.zK0;
                if (zK0_19 != null) {
                    if (zK0_19.Cs0 != null) {
                        zK0_19.Cs0.xe0();
                        zK0_19.Cs0 = null;
                    }
                    HX hx = new HX(zK0_19, this.jg0, list);
                    zK0_19.Cs0 = hx;
                    zK0_19.Ll(true);
                    zK0_19.Cs0.lt0();
                    int xOff = kq_0.lpT2(zK0_19.Cs0.Mx, 2, zK0_19.A20 + zK0_19.e80, zK0_19.a3());
                    int yOff = kq_0.lpT2(zK0_19.Cs0.OB, 2, zK0_19.SB0 + zK0_19.y9, zK0_19.k5());
                    zK0_19.Cs0.E40(xOff, yOff);
                    zK0_19.SL(zK0_19.Cs0);
                }
                break;
            case 21:
                pk0_0 pk = tw0_0.FL;
                String name = this.hH();
                short i3 = (short) this.jg0;
                short x = this.FA[0];
                short y = this.FA[1];
                og0_1 og = new og0_1(name, x, y);
                pk.F9(pk.fU(), og);
                pk.cOM9.j10(pk.cOM9.yw0(i3), og);
                og.E40((x - 1) * 4, (y - 1) * 4);
                og.lt0();
                og.pa0 = (x - 1) * 4;
                og.Zx0 = (y - 1) * 4;
                og.c20 = true;
                break;
            case 22:
                pk0_0 pk22 = tw0_0.FL;
                iw_1 iw22 = (iw_1) pk22.cOM9.V30((int) (short) this.jg0);
                if (iw22 != null) {
                    pk22.u3(iw22);
                }
                break;
            case 24:
                BU zK0_24 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_24 != null) {
                    if (zK0_24.vs0 != null) {
                        zK0_24.vs0.xe0();
                        zK0_24.vs0 = null;
                    }
                    di0_1 v1_di = new di0_1(this.jg0);
                    zK0_24.vs0 = v1_di;
                    zK0_24.SL(v1_di);
                }
                break;
            case 25:
                BU zK0_25 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_25 != null) {
                    zK0_25.SL(new j8_0(this.jg0));
                }
                break;
            case 26:
                BU zK0_26 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_26 != null) {
                    zK0_26.SL(new ef_0(this.jg0));
                }
                break;
            case 27:
                BU zK0_27 = ((BR) this.sr0()).lZ.zK0;
                if (zK0_27 != null) {
                    zK0_27.SL(new qf0_1(this.jg0));
                }
                break;
            default:
                tw0_0.FL.iQ((kt_0) this);
                break;
        }
    }

    public final String hH() {
        if (this.nD != null) {
            return this.nD;
        }
        int sx = ud_0.SX[this.cg0.an];
        if (sx == 23) {
            rh_1 v1 = rh_1.vY;
            uy_0 uy = (this.cv >= 0 && this.cv < v1.Yj.length) ? v1.Yj[this.cv] : null;
            if (uy == null) {
                return "ERROR";
            }
            e80_0 e80 = (e80_0) uy.lL0.get(Short.valueOf(this.Kz0));
            if (e80 == null) {
                return "ERROR";
            }
            if (this.Gw0 >= 0 && this.Gw0 < e80.Dc0.length) {
                return GJ.Ig0.Xw(e80.rd0, e80.Dc0[this.Gw0]);
            }
            return "";
        }
        if (sx == 28) {
            ByteBuffer buf = tw0_0.Ll0.YB0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
            int offset = this.kP;
            int pos = buf.position();
            if (offset < 0 || offset > buf.limit()) {
                return yr_1.pG("Invalid String Offset ", offset);
            }
            buf.position(offset);
            StringBuilder sb = new StringBuilder();
            while (true) {
                byte b = buf.get();
                if (b == -1) {
                    buf.position(pos);
                    return sb.toString();
                }
                char c = 10240;
                if ((b & 1) != 0) {
                    c = (char) 10241;
                }
                if ((b & 2) != 0) {
                    c = (char) (c | 8);
                }
                if ((b & 4) != 0) {
                    c = (char) (c | 2);
                }
                if ((b & 8) != 0) {
                    c = (char) (c | 16);
                }
                if ((b & 16) != 0) {
                    c = (char) (c | 4);
                }
                if ((b & 32) != 0) {
                    c = (char) (c | 32);
                }
                sb.append(c);
            }
        }
        if (this.kP == 0) {
            return "";
        }
        return g6_0.dG(this.kP, this.CoM5);
    }
}
