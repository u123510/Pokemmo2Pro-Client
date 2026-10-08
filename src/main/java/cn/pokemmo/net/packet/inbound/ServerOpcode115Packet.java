package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode115Packet extends GH {
    public CH0[] my;
    public boolean w5;
    public short Wl0;
    public byte Xr0;
    public short ec0;
    public kb_0[] li0;
    public rz_0[] YF0;
    public short[] mA;
    public byte[] wJ0;
    public byte Nv;
    public boolean PG0;
    public int vm0;
    public int Zf;

    public ServerOpcode115Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
        this.Wl0 = 0;
        this.Xr0 = 0;
        this.ec0 = 0;
        this.li0 = null;
        this.mA = null;
        this.wJ0 = null;
        this.Nv = 2;
    }

    @Override
    public final void Oj0() {
        this.my = new CH0[] { pE(), pE() };
        boolean z = (this.Rj.get() & 0xFF) == 1;
        this.w5 = z;
        if (z) {
            this.Wl0 = this.Rj.getShort();
            this.Xr0 = this.Rj.get();
            this.li0 = new kb_0[this.Rj.get() & 0xFF];
            for (int i = 0; i < this.li0.length; i++) {
                kb_0 kb_0Var = new kb_0();
                this.li0[i] = kb_0Var;
                kb_0Var.Dq = (this.Rj.get() & 0xFF) == 1;
                this.li0[i].Qm0 = this.Rj.getShort();
                int size = this.Rj.get() & 0xFF;
                for (int j = 0; j < size; j++) {
                    byte b = this.Rj.get();
                    float f = this.Rj.getFloat();
                    int i2 = this.Rj.getInt();
                    this.li0[i].UH.add(new a40_0(b, f, i2));
                }
            }
            this.YF0 = new rz_0[this.Rj.get() & 0xFF];
            for (int i = 0; i < this.YF0.length; i++) {
                this.YF0[i] = (rz_0) rz_0.RM.BM(this.Rj.get());
            }
            int len = this.Rj.get() & 0xFF;
            this.mA = new short[len];
            this.wJ0 = new byte[len];
            for (int i = 0; i < this.mA.length; i++) {
                this.mA[i] = this.Rj.getShort();
            }
            for (int i = 0; i < this.mA.length; i++) {
                this.wJ0[i] = this.Rj.get();
            }
            this.Nv = this.Rj.get();
            this.ec0 = this.Rj.getShort();
            this.PG0 = (this.Rj.get() & 0xFF) == 1;
            this.vm0 = this.Rj.getInt();
            this.Zf = this.Rj.getInt();
        }
    }

    @Override
    public final void os0() {
        CH0[] cH0Arr = this.my;
        boolean z = this.w5;
        short s = this.Wl0;
        byte b = this.Xr0;
        kb_0[] kb_0Arr = this.li0;
        rz_0[] rz_0Arr = this.YF0;
        short[] sArr = this.mA;
        byte[] bArr = this.wJ0;
        byte b2 = this.Nv;
        short s2 = this.ec0;
        boolean z2 = this.PG0;
        int i = this.vm0;
        int i2 = this.Zf;
        BU bu = ((BR) sr0()).lZ.zK0;
        if (bu != null) {
            di0_1 di0_1Var = bu.vs0;
            if (di0_1Var != null) {
                di0_1Var.xJ0(cH0Arr, z, s, b, kb_0Arr, rz_0Arr, sArr, bArr, b2, s2, z2, i, i2);
            }
        }
    }
}
