/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import f.k5_0;
import f.lpt5__5;
import f.tb0_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.nS
 */
public class ServerOpcode166Packet
extends GH {
    public k5_0 Ve;

    public ServerOpcode166Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        int n = this.Rj.getShort() & 0xFFFF;
        ServerOpcode166Packet ns_12 = this;
        int n2 = ns_12.Rj.getShort() & 0xFFFF;
        byte[] byArray = new byte[ns_12.Rj.getShort() & 0xFFFF];
        this.Rj.get(byArray);
        this.Ve = new k5_0(n, n2, k5_0.Tc(byArray));
    }

    @Override
    public final void os0() {
        tb0_2 tb0_23 = new tb0_2((ns_1) this);
        lpt5__5.hL.Com4.execute(tb0_23);
    }
}

