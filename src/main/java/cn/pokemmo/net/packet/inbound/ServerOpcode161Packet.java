/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.GH;
import f.e30_0;
import f.k20_0;
import f.om_1;
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Renamed from f.Ao
 */
public class ServerOpcode161Packet
extends GH {
    public boolean Nn0;
    public e30_0 EK0;
    public byte wk;
    public byte ki;
    public byte xF;
    public byte wt0 = 0;
    public String i10 = "0.0.0.0";
    public long I60;
    public int VJ0;
    public String hT = "";
    public String Ti = "";
    public String Lq = "";
    public String coM6;
    public om_1[] Ae;

    public ServerOpcode161Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        boolean bl = (this.Rj.get() & 0xFF) == 1;
        this.Nn0 = bl;
        if (!bl) {
            return;
        }
        this.EK0 = this.CW(false);
        this.wk = this.Rj.get();
        if (this.wk > 0) {
            long l;
            this.ki = this.Rj.get();
            this.xF = this.Rj.get();
            this.wt0 = this.Rj.get();
            this.i10 = this.q60();
            this.I60 = l = this.Rj.getLong();
            this.VJ0 = this.Rj.getInt();
            this.hT = this.q60();
            this.Ti = this.q60();
            this.Lq = this.q60();
        }
        if ((this.Rj.get() & 0xFF) == 1) {
            this.Rj.getInt();
            this.coM6 = this.q60();
        }
        int n = this.Rj.getShort() & 0xFFFF;
        this.Ae = new om_1[n];
        for (int j = 0; j < n; ++j) {
            CH0 cH0 = this.pE();
            int n2 = this.Rj.getInt();
            String string = this.q60();
            String string2 = this.q60();
            this.Ae[j] = new om_1(cH0, string2, n2);
            this.Ae[j].i60 = string;
        }
    }

    @Override
    public final void os0() {
        ServerOpcode161Packet ao_02 = this;
        Arrays.sort(ao_02.Ae, om_1.bb);
        ao_02.sr0().FC0(this);
    }
}
