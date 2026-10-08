package cn.pokemmo.net.packet.system;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.time.YearMonth;

public class SessionDisconnectPacket extends yq0_0 {
    public SessionDisconnectPacket(ByteBuffer byteBuffer) {
        super(byteBuffer, 0);
    }

    public final boolean LI(ByteBuffer byteBuffer) {
        short count = byteBuffer.getShort();
        TE te = new TE();
        RB rb = new RB();
        for (int i = 0; i < count; ++i) {
            short id = byteBuffer.getShort();
            int mask = byteBuffer.getInt();
            gu0 gu02 = gu0.l2;
            mc0_1 species = gu02.lPT6(id);
            if ((mask & 1) != 0) {
                int td = byteBuffer.getInt();
                int d2 = byteBuffer.getInt();
                if (species.TD != td || species.gQ() != d2) {
                    species.TD = td;
                    species.d2 = d2;
                }
            }
            if ((mask & 2) != 0) {
                species.eG = byteBuffer.get() == 1;
                species.M80 = byteBuffer.get() == 1;
            }
            if ((mask & 4) != 0) {
                l5_0 l5 = l5_0.Hv0(byteBuffer.get());
                if (l5 != null) {
                    species.Yt0 = l5;
                    species.Yw = l5.EF;
                }
            }
            if ((mask & 8) != 0) {
                species.Yw = byteBuffer.getShort();
            }
            if ((mask & 16) != 0) {
                byte b1 = byteBuffer.get();
                species.lQ = JU.IT.dg(b1) ? (JU) JU.IT.BM(b1) : JU.O4;
                byte b2 = byteBuffer.get();
                species.qy = JU.IT.dg(b2) ? (JU) JU.IT.BM(b2) : JU.O4;
            }
            if ((mask & 32) != 0) {
                short s10 = byteBuffer.getShort();
                gu02.Cb0.put(Short.valueOf(id), gu02.lPT6(s10));
                gu02.Pd0.remove(Short.valueOf(id));
                gu02.my0.Dc0(id, s10);
            }
            if ((mask & 64) != 0) {
                short s10 = byteBuffer.getShort();
                te.Dc0(id, s10);
                rb.JF0(mask, id);
            }
            if ((mask & 128) != 0) {
                species.tX = byteBuffer.getShort();
                species.CJ0 = byteBuffer.get() == 1;
                species.ia0 = byteBuffer.get();
                species.Zp = byteBuffer.get();
            }
            if ((mask & 256) != 0) {
                species.QJ = byteBuffer.getShort();
            }
            if ((mask & 512) != 0) {
                species.wb0 = byteBuffer.getShort();
            }
            if ((mask & 1024) != 0) {
                species.dp0 = (gc_2) gc_2.z80.BM(byteBuffer.get());
                species.nn = byteBuffer.getShort();
            }
            if ((mask & 2048) != 0) {
                species.pW = byteBuffer.getShort();
                species.transient$ = byteBuffer.get() == 1;
            }
            if ((mask & 4096) != 0) {
                QL ql = QL.Q8(byteBuffer.get());
                species.Nl = ql.D7 + 11000;
                species.Fv = ql.D7 + 11400;
                species.g0 = ql;
            }
            if ((mask & 8192) != 0) {
                species.kr0 = true;
            }
            if ((mask & 16384) != 0) {
                species.uK0 = true;
            }
            if ((mask & 32768) != 0) {
                species.n4 = false;
            }
            if ((mask & 65536) != 0) {
                species.wa = i40_0.MG0(byteBuffer.get());
                species.PP = byteBuffer.get();
            }
            if ((mask & 131072) != 0) {
                byte b6 = byteBuffer.get();
                NA0 na0 = (NA0) t_0.BI0(NA0.v6.BM(b6), NA0.class, b6);
                switch (mt_0.UC[na0.g20]) {
                    case 1:
                    case 2:
                    case 3:
                        species.vJ0 = tu_0.BE0(byteBuffer.get());
                        species.Ui0 = YearMonth.of((int) byteBuffer.getShort(), (int) byteBuffer.get());
                        break;
                    case 4:
                        species.vJ0 = tu_0.BE0(byteBuffer.get());
                        species.Ui0 = YearMonth.of((int) byteBuffer.getShort(), (int) byteBuffer.get());
                        species.Zl0 = (Us0) Us0.TJ0.BM(byteBuffer.get());
                        break;
                    case 5:
                        species.Ui0 = YearMonth.of((int) byteBuffer.getShort(), (int) byteBuffer.get());
                        break;
                }
                species.wX = na0;
                byte count2 = byteBuffer.get();
                od0_1[] od0Arr = new od0_1[count2];
                for (int i10 = 0; i10 < count2; ++i10) {
                    int i11 = byteBuffer.getInt();
                    byte count3 = byteBuffer.get();
                    iz0_0[] iz0Arr = new iz0_0[count3];
                    for (int i14 = 0; i14 < count3; ++i14) {
                        iz0Arr[i14] = this.vG();
                    }
                    od0Arr[i10] = new od0_1(i11, iz0Arr);
                }
                if (count2 > 0) {
                    species.Wj0 = od0Arr;
                }
            }
            if ((mask & 262144) != 0) {
                species.rg = true;
            }
            if ((mask & 524288) != 0) {
                species.Yk0 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                species.sE0 = (NL) t_0.BI0(NL.rE0.BM(b8), NL.class, b8);
            }
            if ((mask & 1048576) != 0) {
                species.Yl = byteBuffer.get();
            }
            if ((mask & 2097152) != 0) {
                short s6 = byteBuffer.getShort();
                cq_0[] cqArr = new cq_0[s6];
                for (int i10 = 0; i10 < s6; ++i10) {
                    short moveId = byteBuffer.getShort();
                    cqArr[i10] = (cq_0) mp_1.vf0().k2.get(Short.valueOf(moveId));
                }
                species.xC = cqArr;
            }
            if ((mask & 4194304) != 0) {
                species.Ye0 = byteBuffer.getInt();
            }
            if ((mask & 8388608) != 0) {
                species.ii0 = false;
            }
            if ((mask & 16777216) != 0) {
                species.jq0 = tu_0.BE0(byteBuffer.get());
            }
            if ((mask & 33554432) != 0) {
                species.lx = byteBuffer.get();
            }
            if ((mask & 67108864) != 0) {
                species.zK = byteBuffer.getShort();
            }
        }

        int size = te.Rv;
        short[] keys = new short[size];
        short[] allKeys = te.zp0;
        byte[] states = te.Ut;
        int len = states.length;
        int count4 = 0;
        while (len-- > 0) {
            if (states[len] == 1) {
                keys[count4++] = allKeys[len];
            }
        }

        for (int i2 = 0; i2 < size; ++i2) {
            short key = keys[i2];
            gu0 gu03 = gu0.l2;
            mc0_1 target = gu03.lPT6(key);
            mc0_1 source = gu03.lPT6(te.f5(key));
            mc0_1 newSpecies = source.dm(key);
            gu03.on0(newSpecies);
            int flags = rb.mk(key);
            if ((flags & 2) != 0) {
                newSpecies.eG = target.TL();
                newSpecies.M80 = target.M80;
            }
            if ((flags & 1) != 0) {
                newSpecies.TD = target.TD;
                newSpecies.d2 = target.gQ();
            }
            if ((flags & 4) != 0) {
                newSpecies.Yt0 = target.Yt0;
                newSpecies.Yw = target.Yt0.EF;
            }
            if ((flags & 8) != 0) {
                newSpecies.Yw = (short) target.pe();
            }
        }
        return true;
    }

    @Override
    public final void run() {
    }

    @Override
    public final void Oj0() {
    }

    @Override
    public final void os0() {
    }
}
