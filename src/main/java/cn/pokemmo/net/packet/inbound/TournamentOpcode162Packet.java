package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class TournamentOpcode162Packet extends GH {
    public hb_2 PU;
    public String qw0;
    public String vD;
    public int PP;
    public CH0 Zz0;
    public byte iq0;
    public short l8;
    public short YR;
    public short tC0;
    public byte ev;
    public boolean ad0;
    public boolean zi;
    public int u80;
    public byte DG0;
    public byte pB;
    public byte hc0;
    public byte[] fp;
    public byte[] nc;
    public op0_0[] FI0;

    public TournamentOpcode162Packet(k20_0 k20_0, ByteBuffer byteBuffer) {
        super(k20_0, byteBuffer);
        this.Zz0 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        byte b = this.Rj.get();
        hb_2 match = hb_2.hd0;
        for (hb_2 candidate : (hb_2[]) hb_2.uG0.clone()) {
            if (candidate.uj0 == b) {
                match = candidate;
                break;
            }
        }
        this.PU = match;

        switch (if0_1.hp0[this.PU.AI0]) {
            case 2:
                this.vD = this.q60();
                // fall through
            case 3:
                this.Zz0 = this.pE();
                this.qw0 = this.q60();
                this.vD = this.q60();
                this.PP = this.Rj.getInt();
                break;
            case 4:
                this.Zz0 = this.pE();
                break;
            case 5:
                this.iq0 = this.Rj.get();
                this.l8 = this.Rj.getShort();
                this.YR = this.Rj.getShort();
                this.tC0 = this.Rj.getShort();
                this.ev = this.Rj.get();
                this.Rj.get();
                this.u80 = this.Rj.getInt();
                this.zi = (this.Rj.get() & 0xFF) == 1;
                this.ad0 = (this.Rj.get() & 0xFF) == 1;
                this.DG0 = this.Rj.get();
                this.pB = this.Rj.get();
                this.hc0 = this.Rj.get();
                byte len = this.Rj.get();
                this.fp = new byte[len];
                this.nc = new byte[len];
                for (int i = 0; i < len; i++) {
                    this.fp[i] = this.Rj.get();
                    this.nc[i] = this.Rj.get();
                }
                break;
            case 6:
                this.l8 = this.Rj.getShort();
                this.YR = this.Rj.getShort();
                this.tC0 = this.Rj.getShort();
                this.ev = this.Rj.get();
                this.Rj.get();
                this.u80 = this.Rj.getInt();
                this.DG0 = this.Rj.get();
                this.pB = this.Rj.get();
                this.hc0 = this.Rj.get();
                break;
            case 7:
                int count = this.Rj.get() & 0xFF;
                this.FI0 = new op0_0[count];
                for (int i = 0; i < count; i++) {
                    String str = this.q60();
                    int subCount = this.Rj.get() & 0xFF;
                    String[] strArr = new String[subCount];
                    C70[] c70Arr = new C70[subCount];
                    for (int j = 0; j < subCount; j++) {
                        strArr[j] = this.q60();
                        c70Arr[j] = ((C70[]) C70.Kd0.clone())[this.Rj.get() & 0xFF];
                    }
                    this.FI0[i] = new op0_0(str, strArr, c70Arr);
                }
                break;
        }
    }

    @Override
    public final void os0() {
        this.sr0().FC0(this);
    }
}
