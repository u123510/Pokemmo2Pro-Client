/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.F9;
import f.GH;
import f.UM;
import f.k20_0;
import java.nio.ByteBuffer;

public class ServerOpcode190Packet
extends GH {
    public byte tD0;
    public byte lPT2;
    public byte OP;
    public byte vD;
    public short kV;
    public byte lK0;
    public short Yb;
    public short X;

    public ServerOpcode190Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        ServerOpcode190Packet u50 = this;
        u50.tD0 = u50.Rj.get();
        this.vD = u50.Rj.get();
        if (this.vD != 0) {
            ServerOpcode190Packet u502 = this;
            u502.lPT2 = u502.Rj.get();
            u502.OP = u502.Rj.get();
            u502.kV = u502.Rj.getShort();
            u502.lK0 = u502.Rj.get();
            u502.Yb = u502.Rj.getShort();
            u502.X = u502.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        block5: {
            byte by;
            block4: {
                by = this.vD;
                if (by != 0) break block4;
                UM uM = UM.Kf0;
                byte by2 = this.tD0;
                synchronized (uM) {
                    F9 f9 = uM.Og;
                    f9.gE0(by2, null);
                    break block5;
                }
            }
            ServerOpcode190Packet u50 = this;
            UM uM = UM.Kf0;
            byte by3 = u50.tD0;
            byte by4 = u50.lPT2;
            byte by5 = u50.OP;
            short s = u50.kV;
            byte by6 = u50.lK0;
            boolean bl = by == 2;
            ServerOpcode190Packet u502 = this;
            short s2 = u502.Yb;
            short s3 = u502.X;
            uM.OA0(by3, by4, by5, s, by6, bl, s2, s3);
        }
    }
}

