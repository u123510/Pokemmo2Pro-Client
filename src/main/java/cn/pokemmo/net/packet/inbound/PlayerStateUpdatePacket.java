package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class PlayerStateUpdatePacket extends GH {
    public byte wr0;
    public int bc0;
    public short cu;
    public byte Af;
    public short ko;
    public byte Ee;
    public byte pn;
    public byte gj0;
    public short r9;
    public short Tz0;
    public int yc;
    public j30_0 ap0;
    public short O1;
    public short CoM6;
    public QL[] JI0;

    public PlayerStateUpdatePacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
        this.JI0 = QL.rn0;
    }

    @Override
    public final void Oj0() {
        this.wr0 = this.Rj.get();
        if ((this.wr0 & 1) != 0) {
            this.bc0 = this.Rj.getInt();
        }
        if ((this.wr0 & 2) != 0) {
            this.cu = this.Rj.getShort();
            this.Af = this.Rj.get();
        }
        if ((this.wr0 & 4) != 0) {
            this.ko = this.Rj.getShort();
        }
        if ((this.wr0 & 8) != 0) {
            this.Ee = this.Rj.get();
            this.pn = this.Rj.get();
            this.gj0 = this.Rj.get();
        }
        if ((this.wr0 & 16) != 0) {
            this.r9 = this.Rj.getShort();
            this.Tz0 = this.Rj.getShort();
        }
        if ((this.wr0 & 32) != 0) {
            this.yc = this.Rj.getInt();
        }
        if ((this.wr0 & 64) != 0) {
            byte b = this.Rj.get();
            this.ap0 = (j30_0) t_0.BI0(j30_0.v7.BM(b), j30_0.class, b);
            if (this.ap0 != j30_0.Hi) {
                this.O1 = this.Rj.getShort();
                this.CoM6 = this.Rj.getShort();
            }
        }
        if ((this.wr0 & -128) != 0) {
            int n = this.Rj.get();
            this.JI0 = new QL[n];
            for (int i = 0; i < n; i++) {
                this.JI0[i] = QL.Q8(this.Rj.get());
            }
        }
    }

    @Override
    public final void os0() {
        e30_0 e30_02 = sr0().k0;
        if (e30_02 == null) {
            return;
        }
        boolean bl = false;
        if ((this.wr0 & 1) != 0) {
            e30_02.il = this.bc0;
            bl = true;
        }
        if ((this.wr0 & 2) != 0) {
            e30_02.Sq0 = this.cu;
            e30_02.hh0 = this.Af;
            if (tw0_0.LD0.he0 != null && tw0_0.LD0.he0.N10 != null) {
                tw0_0.LD0.he0.N10.NM();
            }
        }
        if ((this.wr0 & 4) != 0) {
            short s = this.ko;
            if (s > 9999) {
                s = 9999;
            }
            e30_02.Lpt5 = s;
            bl = true;
        }
        if ((this.wr0 & 8) != 0) {
            e30_02.Ta = this.Ee;
            e30_02.hL0 = this.pn;
            e30_02.Kk0 = this.gj0;
            BR br = (BR) sr0();
            if (br.lZ.zK0 != null && br.lZ.zK0.OJ != null) {
                br.lZ.zK0.Nc0(false);
                br.lZ.zK0.Nc0(true);
            }
        }
        if ((this.wr0 & 16) != 0) {
            e30_02.Kx = this.r9;
            e30_02.yL0 = this.Tz0;
        }
        if ((this.wr0 & 32) != 0) {
            e30_02.HI = this.yc;
            bl = true;
        }
        if ((this.wr0 & 64) != 0) {
            e30_02.Uj = this.ap0;
            e30_02.ey = this.O1;
            e30_02.a = this.CoM6;
        }
        if (bl) {
            sr0().VI();
        }
        if ((this.wr0 & -128) != 0) {
            synchronized (e30_02.x30) {
                e30_02.Bx = this.JI0;
            }
        }
    }
}
