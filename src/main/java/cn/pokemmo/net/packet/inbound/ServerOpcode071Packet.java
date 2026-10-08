package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode071Packet extends GH {
    public boolean Cy;
    public boolean HE0;
    public zp0_0[] rk0;
    public HZ[] hT;
    public pz_2[] hr;
    public int Jm0;

    public ServerOpcode071Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
        this.rk0 = null;
    }

    @Override
    public final void Oj0() {
        this.Cy = (this.Rj.get() & 0xFF) == 1;
        if (this.Cy) {
            this.HE0 = (this.Rj.get() & 0xFF) == 1;
            if (this.HE0) {
                int length = this.Rj.get() & 0xFF;
                this.rk0 = new zp0_0[length];
                for (int i = 0; i < this.rk0.length; i++) {
                    this.rk0[i] = Pl0();
                }
            } else {
                this.Jm0 = this.Rj.getInt();
                byte b = this.Rj.get();
                for (int i = 0; i < b; i++) {
                    byte b2 = this.Rj.get();
                    boolean bl = (this.Rj.get() & 0xFF) == 1;
                    long l = this.Rj.getLong();
                    this.Rj.getLong();
                    av_1 av_12 = (av_1) av_1.rh.BM(b2);
                    if (av_12 != null) {
                        av_12.vn = l;
                        av_12.BB = bl;
                    }
                }
                int n = this.Rj.get();
                this.hr = new pz_2[n];
                for (int i = 0; i < this.hr.length; i++) {
                    short s = this.Rj.getShort();
                    short s2 = this.Rj.getShort();
                    av_1 av_13 = (av_1) av_1.rh.BM(this.Rj.get());
                    byte b3 = this.Rj.get();
                    ag_0[] ag_0Array = new ag_0[b3];
                    for (int j = 0; j < b3; j++) {
                        ag_0Array[j] = B10();
                    }
                    byte b4 = this.Rj.get();
                    ag_0[] ag_0Array2 = new ag_0[b4];
                    for (int j = 0; j < b4; j++) {
                        ag_0Array2[j] = B10();
                    }
                    this.hr[i] = new pz_2(av_13, ag_0Array, ag_0Array2, s, s2);
                }
            }
            this.hT = Q10();
        }
    }

    @Override
    public final void os0() {
        boolean bl = this.Cy;
        boolean bl2 = this.HE0;
        zp0_0[] zp0_0Array = this.rk0;
        HZ[] hZArray = this.hT;
        pz_2[] pz_2Array = this.hr;
        int n = this.Jm0;
        BU bU = ((BR) sr0()).lZ.zK0;
        if (bU == null) {
            return;
        }
        if (bl) {
            Yl yl = bU.Vi0;
            if (yl != null) {
                yl.Yi0(false, true);
                return;
            }
            if (yl != null) {
                yl.xe0();
                bU.Vi0 = null;
            }
            bU.Vi0 = new Yl(bU, bl2, zp0_0Array, hZArray, pz_2Array, n);
            bU.SL(bU.Vi0);
            bU.Vi0.lt0();
            bU.Vi0.E40(tw0_0.LD0.ew0() / 2 - bU.Vi0.Mx / 2, tw0_0.LD0.Hv0() / 2 - bU.Vi0.OB / 2);
        } else if (bU.Vi0 != null) {
            bU.Vi0.xe0();
            bU.Vi0 = null;
        }
    }

    public final ag_0 B10() {
        byte b = this.Rj.get();
        if (b == 0) {
            short s = this.Rj.getShort();
            short s2 = this.Rj.getShort();
            short s3 = this.Rj.getShort();
            return new ag_0(s, s2, s3, b);
        }
        if (b == 1) {
            short s = this.Rj.getShort();
            this.Rj.get();
            byte b2 = this.Rj.get();
            byte b3 = this.Rj.get();
            boolean bl = this.Rj.get() == 1;
            boolean bl2 = this.Rj.get() == 1;
            short s4 = this.Rj.getShort();
            return new ag_0(b, s, b2, b3, bl, bl2, s4);
        }
        short s = this.Rj.getShort();
        short s5 = this.Rj.getShort();
        return new ag_0(b, s, s5);
    }
}
