package cn.pokemmo.rom.nds.fs;

import f.*;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/**
 * ROM 3D 模型与动画内存映射高速缓存构建器 (ROM Model Cache Builder)
 * 
 * 职责:
 * 创建本地内存映射文件 (MappedByteBuffer)，将 ROM 中解包的 3D 模型、动画和贴图流式压制进高速缓存。
 * 
 * 原混淆类: f.pe_1
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

public class RomModelCacheBuilder {
    public static final dl_1 Eh;
    public final RandomAccessFile Y0;
    public MappedByteBuffer Yl0;
    public final z5 NR;
    public final Z50[] Wr0;
    public int kK;
    public int NX;
    public int QJ;
    public int Yg;
    public int X1;
    public FJ rV;
    public boolean pO;
    public boolean xq0;
    public final byte cT;

    static {
        Eh = Cq0.E1(pe_1.class);
    }

    public RomModelCacheBuilder(byte b, VE ve, int i) {
        this.NR = new z5();
        this.kK = 0;
        this.NX = 0;
        this.QJ = 0;
        this.Yg = -1;
        this.X1 = -1;
        this.rV = null;
        this.pO = false;
        this.xq0 = false;
        this.cT = b;
        ve.Br().A20();
        try {
            RandomAccessFile raf = new RandomAccessFile(ve.l00(), "rw");
            this.Y0 = raf;
            long len = (long) i;
            raf.setLength(len);
            MappedByteBuffer map = raf.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, len);
            this.Yl0 = map;
            map.order(ByteOrder.nativeOrder());
            this.Yl0.putInt(-1);
            this.Yl0.putInt(0);
            this.Wr0 = tw0_0.Ll0.AB(b).G80().nF();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean Pg() {
        if (this.Yl0 == null) {
            return true;
        }
        if (!this.pO) {
            byte region = this.cT;
            if (region == 2) {
                int limit = this.NX + 10;
                while (this.NX < limit && this.NX < this.Wr0.length) {
                    Z50 z50 = this.Wr0[this.NX];
                    short modelId = z50.IJ != null ? z50.IJ.eJ : z50.T70;
                    MG0 mg0 = z50.Ap() ? MG0.Wk0 : MG0.rm;
                    wl0_1 wl0 = tw0_0.Ll0.Qz0.fx.jy(modelId);
                    wa0_2 wa0 = tw0_0.Ll0.Qz0.V10(z50.Va0);
                    for (int r = 0; r < wa0.It0; r++) {
                        for (int c = 0; c < wa0.WH; c++) {
                            short s = (short) wa0.M70[r][c];
                            if (wa0.l1 != null) {
                                short l1 = (short) wa0.l1[r][c];
                                if (l1 != -1 && l1 != this.NX) {
                                    continue;
                                }
                            }
                            if (s >= 0) {
                                w6 w6Var = (w6) tw0_0.Ll0.Qz0.FA(s);
                                if (!this.NR.q8(s)) {
                                    this.NR.o40(s);
                                    if (CX(wl0, mg0, w6Var)) {
                                        this.kK++;
                                    }
                                }
                            }
                        }
                    }
                    int nx = this.NX;
                    if (nx == 16) {
                        int extra = 104;
                        if (!this.NR.q8(extra)) {
                            this.NR.o40(extra);
                            w6 w6Var = (w6) tw0_0.Ll0.Qz0.FA(extra);
                            if (CX(wl0, mg0, w6Var)) {
                                this.kK++;
                            }
                        }
                    } else if (nx == 96) {
                        int extra = 204;
                        if (!this.NR.q8(extra)) {
                            this.NR.o40(extra);
                            w6 w6Var = (w6) tw0_0.Ll0.Qz0.FA(extra);
                            if (CX(wl0, mg0, w6Var)) {
                                this.kK++;
                            }
                        }
                        int extra2 = 106;
                        if (!this.NR.q8(extra2)) {
                            this.NR.o40(extra2);
                            w6 w6Var = (w6) tw0_0.Ll0.Qz0.FA(extra2);
                            if (CX(wl0, mg0, w6Var)) {
                                this.kK++;
                            }
                        }
                    } else if (nx == 120) {
                        for (short s = 200; s <= 204; s++) {
                            if (!this.NR.q8(s)) {
                                this.NR.o40(s);
                                w6 w6Var = (w6) tw0_0.Ll0.Qz0.FA(s);
                                if (CX(wl0, mg0, w6Var)) {
                                    this.kK++;
                                }
                            }
                        }
                        int extra3 = 253;
                        if (!this.NR.q8(extra3)) {
                            this.NR.o40(extra3);
                            w6 w6Var = (w6) tw0_0.Ll0.Qz0.FA(extra3);
                            if (CX(wl0, mg0, w6Var)) {
                                this.kK++;
                            }
                        }
                    }
                    tw0_0.Ll0.Qz0.fx.ri0();
                    this.NX++;
                }
                if (this.NX >= this.Wr0.length) {
                    this.pO = true;
                    this.Yl0.putInt(4, this.kK);
                }
            } else if (region == 3) {
                int limit = this.NX + 10;
                while (this.NX < limit && this.NX < this.Wr0.length) {
                    Z50 z50 = this.Wr0[this.NX];
                    short modelId = z50.IJ != null ? z50.IJ.eJ : z50.T70;
                    MG0 mg0 = z50.Ap() ? MG0.Wk0 : MG0.rm;
                    wl0_1 wl0 = tw0_0.Ll0.nC0.fx.jy(modelId);
                    wa0_2[] du0 = tw0_0.Ll0.nC0.du0;
                    con__3 con = z50.Va0 < du0.length ? (con__3) du0[z50.Va0] : null;
                    if (con != null) {
                        for (int r = 0; r < con.It0; r++) {
                            for (int c = 0; c < con.WH; c++) {
                                short s = (short) con.M70[r][c];
                                if (con.l1 != null) {
                                    short l1 = (short) con.l1[r][c];
                                    if (l1 != -1 && l1 != this.NX) {
                                        continue;
                                    }
                                }
                                if (s >= 0) {
                                    qj0_1 qj0 = (qj0_1) tw0_0.Ll0.nC0.FA(s);
                                    if (!this.NR.q8(s)) {
                                        this.NR.o40(s);
                                        wl0_1 finalWl0 = wl0;
                                        if (s >= 173 && s < 180) {
                                            int overrideId;
                                            if (s == 177 || s == 178) {
                                                overrideId = 14;
                                            } else if (s == 173) {
                                                overrideId = 6;
                                            } else if (s == 174) {
                                                overrideId = 15;
                                            } else if (s == 175) {
                                                overrideId = 7;
                                            } else if (s == 176) {
                                                overrideId = 12;
                                            } else if (s == 179) {
                                                overrideId = 19;
                                            } else {
                                                overrideId = 14;
                                            }
                                            finalWl0 = tw0_0.Ll0.nC0.fx.jy(overrideId);
                                        }
                                        if (CX(finalWl0, mg0, qj0)) {
                                            this.kK++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    tw0_0.Ll0.nC0.fx.ri0();
                    this.NX++;
                }
                if (this.NX >= this.Wr0.length) {
                    this.pO = true;
                    this.Yl0.putInt(4, this.kK);
                }
            } else if (region == 4) {
                int limit = this.NX + 10;
                while (this.NX < limit && this.NX < this.Wr0.length) {
                    Z50 z50 = this.Wr0[this.NX];
                    short modelId = z50.IJ != null ? z50.IJ.eJ : z50.T70;
                    MG0 mg0 = z50.Ap() ? MG0.Wk0 : MG0.rm;
                    wl0_1 wl0 = tw0_0.Ll0.t1.fx.jy(modelId);
                    wa0_2[] du0 = tw0_0.Ll0.t1.du0;
                    con__3 con = z50.Va0 < du0.length ? (con__3) du0[z50.Va0] : null;
                    if (con != null) {
                        for (int r = 0; r < con.It0; r++) {
                            for (int c = 0; c < con.WH; c++) {
                                short s = (short) con.M70[r][c];
                                if (con.l1 != null) {
                                    short l1 = (short) con.l1[r][c];
                                    if (l1 != -1 && l1 != this.NX) {
                                        continue;
                                    }
                                }
                                if (s >= 0) {
                                    qj0_1 qj0 = (qj0_1) tw0_0.Ll0.t1.FA(s);
                                    if (!this.NR.q8(s)) {
                                        this.NR.o40(s);
                                        if (CX(wl0, mg0, qj0)) {
                                            this.kK++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    tw0_0.Ll0.t1.fx.ri0();
                    this.NX++;
                }
                if (this.NX >= this.Wr0.length) {
                    this.pO = true;
                    this.Yl0.putInt(4, this.kK);
                }
            }
            return false;
        }

        if (!this.xq0) {
            byte region = this.cT;
            if (region == 2) {
                if (this.QJ == 0) {
                    Ar0(MG0.rm);
                    return false;
                } else if (this.QJ == 1) {
                    Ar0(MG0.Wk0);
                    return false;
                }
            } else if (region == 3) {
                vl0(true);
            } else if (region == 4) {
                if (this.QJ == 0) {
                    vl0(false);
                    return false;
                } else if (this.QJ == 1) {
                    vl0(true);
                    return false;
                }
            }
            return false;
        }

        if (tw0_0.Ll0.Qz0 != null) {
            tw0_0.Ll0.Qz0.fx.ri0();
        }
        if (tw0_0.Ll0.nC0 != null) {
            tw0_0.Ll0.nC0.fx.ri0();
        }
        if (tw0_0.Ll0.t1 != null) {
            tw0_0.Ll0.t1.fx.ri0();
        }

        int version = -1;
        if (this.cT == 2) {
            version = 3;
        } else if (this.cT == 3) {
            version = 8;
        } else if (this.cT == 4) {
            version = 9;
        }

        Eh.info("Starting cache save for region {}", Byte.valueOf(this.cT));
        try {
            this.Yl0.flip();
            this.Yl0.putInt(version);
            int limit = this.Yl0.limit();
            MappedByteBuffer buffer = this.Yl0;
            this.Yl0 = null;
            buffer.force();
            try {
                if (m00_0.SX(buffer)) {
                    Eh.info("Released buffer");
                } else {
                    Eh.info("Attempting forced GC");
                    System.gc();
                }
                this.Y0.setLength((long) limit);
            } catch (Throwable t) {
                Eh.warn("", t);
            }
            this.Y0.close();
            Eh.info("Finished cache save for region {}", Byte.valueOf(this.cT));
            return true;
        } catch (Exception e) {
            Eh.error("Could not save cache ", e);
            return false;
        }
    }

    public final boolean CX(wl0_1 wl0_1Var, MG0 mg0Var, ab0_2 ab0_2Var) {
        int pos = this.Yl0.position();
        try {
            ku_0 ku0 = ku_0.zn(ab0_2Var.GE());
            if (ab0_2Var.H50.Tz() == 4 && ab0_2Var.M2 == 225) {
                eu0.xo(ku0.KV[0]);
            }
            v80_0 v80 = v80_0.Cb0();
            vt_0 vt = ku0.KV[0];
            boolean b = (mg0Var == MG0.Wk0);
            Ou0 ou0 = v80_0.o7(vt, wl0_1Var, b);
            this.Yl0.putInt(ab0_2Var.M2);
            int p = this.Yl0.position();
            this.Yl0.putInt(-1);
            new wh0_2(this.Yl0, ou0);
            int p2 = this.Yl0.position();
            this.Yl0.putInt(p, p2 - p - 4);
            ou0.O4();
            return true;
        } catch (Exception e) {
            Eh.error("could not write map cache model {}", Short.valueOf(ab0_2Var.M2), e);
            this.Yl0.position(pos);
            return false;
        }
    }

    public final void vl0(boolean z) {
        if (this.Yg == -1) {
            if (this.cT == 3) {
                this.rV = new FJ((Ae) tw0_0.Ll0.nC0.fd0.dg.get("/fielddata/build_model/build_model.narc"));
            } else if (this.cT == 4) {
                this.rV = new FJ((Ae) tw0_0.Ll0.t1.fd0.dg.get(z ? "/a/0/4/0" : "/a/1/4/8"));
            }
            this.Yl0.putInt(this.rV.AC.F10);
            this.Yg = 0;
            this.X1 = this.rV.AC.F10;
        }
        int limit = this.Yg + 10;
        while (this.Yg < limit && this.Yg < this.X1) {
            ku_0 ku0 = null;
            iy_0 iy0 = null;
            if (this.cT == 3) {
                ku0 = tw0_0.Ll0.nC0.be.Vk0(this.Yg);
                iy0 = tw0_0.Ll0.nC0.be.YW(this.Yg);
            } else if (this.cT == 4) {
                kx_1 kx = z ? tw0_0.Ll0.t1.BJ0 : tw0_0.Ll0.t1.ny;
                ku0 = kx.Vk0(this.Yg);
                iy0 = kx.YW(this.Yg);
            }
            boolean b1 = false;
            boolean b2 = !z;
            if (this.cT == 4) {
                if (!z) {
                    int yg = this.Yg;
                    if (yg == 146 || yg == 147 || yg == 173 || yg == 174) {
                        b1 = true;
                    }
                }
                if (z) {
                    int yg = this.Yg;
                    if (yg == 117 || yg == 169 || yg == 186 || (yg >= 64 && yg <= 70)) {
                        b2 = true;
                    }
                }
            }
            v80_0 v80 = v80_0.Cb0();
            vt_0 vt = ku0.KV[0];
            Ou0 ou0 = v80_0.Kg0(vt, ku0.QB, iy0.Pv, vt.Iu0, b2, false, b1);
            int pos = this.Yl0.position();
            this.Yl0.putInt(-1);
            new wh0_2(this.Yl0, ou0);
            int endPos = this.Yl0.position();
            this.Yl0.putInt(pos, endPos - pos - 4);
            ou0.O4();
            this.Yg++;
        }
        if (this.Yg >= this.X1) {
            this.QJ++;
            this.Yg = -1;
            if (z) {
                this.xq0 = true;
            }
        }
    }

    public final void Ar0(MG0 mg0) {
        if (this.Yg == -1) {
            Ae ae = null;
            int sw = Ly0.jP[mg0.hX];
            if (sw == 1) {
                ae = (Ae) tw0_0.Ll0.Qz0.fd0.dg.get("/a/2/2/9");
            } else if (sw == 2) {
                ae = (Ae) tw0_0.Ll0.Qz0.fd0.dg.get("/a/2/3/0");
            }
            this.rV = new FJ(ae);
            this.Yl0.putInt(this.rV.AC.F10);
            this.Yg = 0;
            this.X1 = this.rV.AC.F10;
        }
        int processedCount = 0;
        while (this.Yg < this.rV.AC.F10) {
            an_0 an0 = an_0.Y3(this.rV.GJ(this.Yg).MH(false));
            am_2 am2 = tw0_0.Ll0.Qz0.EL0(mg0, this.Yg);
            ArrayList list = an0.sG;
            int size = list.size();
            this.Yl0.putInt(size);
            for (int i = 0; i < size; i++) {
                JC0 jc0 = (JC0) list.get(i);
                jc0.ZJ();
                vt_0 vt = jc0.iK0.KV[0];
                Ou0 ou0 = v80_0.Kg0(vt, am2, jc0.JA, vt.Iu0, mg0 == MG0.Wk0, false, false);
                int pos = this.Yl0.position();
                this.Yl0.putInt(-1);
                new wh0_2(this.Yl0, ou0);
                int endPos = this.Yl0.position();
                this.Yl0.putInt(pos, endPos - pos - 4);
                jc0.iK0 = null;
                jc0.JA.clear();
                jc0.Di0 = false;
                ou0.O4();
            }
            processedCount++;
            this.Yg++;
            if (processedCount > 5) {
                return;
            }
        }
        this.QJ++;
        this.Yg = -1;
        if (this.QJ == 2) {
            this.xq0 = true;
        }
    }
}
