/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

/*
 * Renamed from f.go
 */
public class ServerOpcode042Packet
extends GH {
    public byte NU;
    public short bA;
    public short vk;

    public ServerOpcode042Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode042Packet go_12 = this;
        go_12.NU = go_12.Rj.get();
        go_12.bA = go_12.Rj.getShort();
        go_12.vk = go_12.Rj.getShort();
    }

    @Override
    public final void os0() {
        block12: {
            if (this.sr0() == null) break block12;
            if (this.NU == -128) {
                ServerOpcode042Packet go_12 = this;
                cq0_0 cq0_02 = go_12.sr0().oY;
                short by = go_12.bA;
                short s = this.vk;
                cq0_02.getClass();
                cq0_0.w0(by);
                cq0_02.lY.lpt5(by, s);
            } else {
                ServerOpcode042Packet go_13 = this;
                bk0_1 bk0_12 = go_13.sr0().yh0;
                byte ng_12 = go_13.NU;
                ServerOpcode042Packet go_14 = this;
                short s = go_14.bA;
                short s2 = go_14.vk;
                if (!md_1.Bm(ng_12, s)) {
                    bk0_12.getClass();
                    throw new RuntimeException("Attempt to set non-client aware flag.");
                }
                if (s2 == 0) {
                    bk0_12.lPT7[ng_12].wK(s);
                    bk0_12.CN(ng_12);
                } else {
                    bk0_12.lPT7[ng_12].lpt5(s, s2);
                }
                bk0_12.CN(ng_12);
            }
            le0_2 le0_22 = BU.T50;
            if (le0_22 != null) {
                bs0_0 bs0_02;
                short s = this.bA;
                ng_1 ng_12 = ((BU)le0_22).sC0;
                if (ng_12 != null) {
                    ng_12.AK0(tw0_0.e60.Com4);
                }
                if (s == 1010) {
                    ng_1 ng_13 = ((BU)le0_22).sC0;
                    if (ng_13 != null && (le0_22 = ((BU)le0_22).Iy) != null) {
                        ((bs0_0)le0_22).X30(ng_13.SX.Mx);
                    }
                } else if ((s == 1044 || S.J9(s, jt_0.Qy0)) && (bs0_02 = ((BU)le0_22).Iy) != null) {
                    bs0_02.X30(0);
                }
            }
        }
    }
}

