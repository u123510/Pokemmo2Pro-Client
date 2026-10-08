/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.ML0;
import f.e1;
import f.k20_0;
import f.tw0_0;
import java.nio.ByteBuffer;

public class ServerOpcode050Packet
extends GH {
    public byte k00;
    public boolean zh;

    public ServerOpcode050Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        byte by = this.Rj.get();
        this.k00 = (byte)(by & 0x7F);
        boolean bl = (by & 0x80) != 0;
        this.zh = bl;
    }

    @Override
    public final void os0() {
        if (tw0_0.PK0 != null) {
            e1 e12;
            if (!this.zh) {
                ML0 mL0 = tw0_0.LD0.he0.N10;
                mL0.l60(null);
                mL0.zG();
                mL0.Be.Ll(false);
                mL0.TH0.Ll(false);
                mL0.Wq0.Ll(false);
                mL0.kX.Ll(false);
                mL0.ri0.Ll(false);
                mL0.v80.Ll(false);
                mL0.ke();
                mL0.Ck0(false);
            }
            ServerOpcode050Packet n20 = this;
            byte by = n20.k00;
            e1 e13 = new e1(by, n20.zh);
            tw0_0.PK0.Tk0.add(e13);
        }
    }
}

