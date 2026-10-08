/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.di0_0;
import f.k20_0;
import f.tw0_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.t3
 */
public class ServerOpcode038Packet
extends GH {
    public byte TX;
    public short Fr0;
    public byte eI0;
    public byte QM;

    public ServerOpcode038Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        byte by;
        ServerOpcode038Packet t3_02 = this;
        t3_02.TX = t3_02.Rj.get();
        t3_02.Fr0 = t3_02.Rj.getShort();
        this.eI0 = by = t3_02.Rj.get();
        if (by == 2 || by == 3) {
            this.QM = this.Rj.get();
        }
    }

    @Override
    public final void os0() {
        short s = this.Fr0;
        if (s < 0) {
            tw0_0.RE0.qq();
            return;
        }
        switch (this.eI0) {
            default: {
                break;
            }
            case 3: {
                di0_0.Hv0(s, this.QM, 0.6f, 0.0f, true);
                break;
            }
            case 2: {
                di0_0.Hv0(s, this.QM, 1.0f, 0.0f, false);
                break;
            }
            case 1: {
                tw0_0.RE0.SA0(this.TX, s);
                break;
            }
            case 0: {
                tw0_0.RE0.Hq0(this.TX, s);
            }
        }
    }
}

