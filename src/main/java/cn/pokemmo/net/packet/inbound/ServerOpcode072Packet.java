package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class ServerOpcode072Packet extends GH {
    public av_1[] gl;
    public CH0 HU;
    public vk0_0 so0;
    public GV qi0;
    public int Pr0;

    public ServerOpcode072Packet(k20_0 k20_0, ByteBuffer byteBuffer) {
        super(k20_0, byteBuffer);
        this.qi0 = null;
    }

    @Override
    public final void Oj0() {
        byte b = this.Rj.get();
        if (b < 0) {
            this.gl = new av_1[0];
            this.HU = pE();
        } else {
            this.gl = new av_1[b];
            for (int i = 0; i < b; i++) {
                this.gl[i] = (av_1) av_1.rh.BM(this.Rj.get());
            }
        }
        this.Pr0 = this.Rj.getInt();
        this.so0 = (vk0_0) vk0_0.zr0.BM(this.Rj.get());
        if (this.so0 == vk0_0.Pu) {
            this.qi0 = GV.Zd(this.Rj.get());
        }
    }

    @Override
    public final void os0() {
        if (this.gl == null && !this.HU.Uz0()) {
            return;
        }
        if (this.so0 == null) {
            return;
        }
        BR br = (BR) sr0();
        av_1[] av_1Arr = this.gl;
        CH0 ch0 = this.HU;
        vk0_0 vk0_0 = this.so0;
        GV gv = this.qi0;
        int i = this.Pr0;
        br.getClass();
        vk0_0 dL0 = vk0_0.dL0;
        if (vk0_0 != dL0) {
            if (gv != null) {
                br.qK(sm0_0.Bx(vk0_0.r2, sm0_0.c0(gv.pN), Integer.toString(i)));
            } else {
                br.qK(sm0_0.wa0(vk0_0.r2, Integer.toString(i)));
            }
        }
        Yl yl = br.lZ.zK0.Vi0;
        if (yl != null) {
            yl.PH = false;
            if (vk0_0 == dL0) {
                if (!yl.j0) {
                    for (mx_1 mx_1 : yl.FR) {
                        if (!mx_1.RU.LB0.equals(ch0)) {
                            mx_1.Y2.Sk("");
                            mx_1.XR = false;
                            mx_1.Jq0();
                            mx_1.ub0.SU(sm0_0.c0(5515));
                        } else {
                            mx_1.Am.og.Ve = true;
                            mx_1.ub0.SU(sm0_0.c0(5504));
                            mx_1.XR = true;
                            mx_1.Jq0();
                        }
                    }
                    for (Object obj : yl.EY) {
                        P30 p30 = (P30) obj;
                        boolean b1 = Arrays.asList(av_1Arr).contains(p30.QL0);
                        p30.jg0.ER.lK0(b1);
                        boolean b2 = Arrays.asList(av_1Arr).contains(p30.B90);
                        p30.Ce0.ER.lK0(b2);
                    }
                    if (!yl.sE) {
                        if (av_1Arr.length < 1) {
                            yl.xz0.SU(sm0_0.c0(5507));
                        } else {
                            yl.xz0.SU(sm0_0.c0(5504));
                        }
                    }
                    if (yl.sE) {
                        yl.w20.tp0.Nk(new Wr[]{zr_2.MA0.He0()});
                    } else {
                        boolean hasK10 = false;
                        for (av_1 av : av_1Arr) {
                            if (av.k10) {
                                hasK10 = true;
                                break;
                            }
                        }
                        yl.w20.SU(sm0_0.c0(5501));
                        Br0 br0 = yl.w20.tp0;
                        Wr[] wrArr = new Wr[1];
                        if (hasK10) {
                            zr_2 zrInst = zr_2.MA0;
                            if (zrInst.Com9 == null) {
                                zrInst.Com9 = zr_2.am0((short) 5002);
                            }
                            wrArr[0] = zrInst.Com9;
                        } else {
                            zr_2 zrInst = zr_2.MA0;
                            if (zrInst.Con == null) {
                                zrInst.Con = zr_2.am0((short) 5003);
                            }
                            wrArr[0] = zrInst.Con;
                        }
                        br0.Nk(wrArr);
                    }
                    yl.w20.tp0.Ve = true;
                    yl.I60 = av_1Arr;
                    yl.fO = ch0;
                    yl.Cv.SU(sm0_0.c0(5504));
                    yl.oU.pw0(true);
                    yl.oU.Ll(true);
                    yl.zA();
                }
                for (Object obj : yl.EY) {
                    P30 p302 = (P30) obj;
                    p302.q70 = true;
                    p302.Xr0();
                }
            } else {
                tw0_0.RE0.Hq0((byte) 2, (short) 1367);
                yl.vi0();
                yl.tj();
                for (Object obj : yl.EY) {
                    P30 p303 = (P30) obj;
                    p303.q70 = false;
                    p303.Xr0();
                }
            }
        }
    }
}
