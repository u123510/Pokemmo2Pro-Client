/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.k20_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.p5
 */
public class ServerOpcode247Packet
extends GH {
    public byte z7;
    public String eA;
    public String Pm0;
    public int tQ;

    public ServerOpcode247Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.z7 = this.Rj.get();
        if (this.z7 == 0) {
            ServerOpcode247Packet p5_02 = this;
            p5_02.eA = p5_02.q60();
            p5_02.Pm0 = p5_02.q60();
            p5_02.tQ = p5_02.Rj.getInt();
        }
    }

    @Override
    public final void os0() {
        this.sr0().FC0(this);
    }
}

