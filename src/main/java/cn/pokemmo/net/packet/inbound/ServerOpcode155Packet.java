package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode155Packet extends GH {
    public byte sh;
    public qd_0 A2;
    public short rP;
    public int gF0;
    public K90[] cx;
    public RB Wm0;

    public ServerOpcode155Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.sh = this.Rj.get();
        int n = this.Rj.get() & 0xFF;
        this.A2 = n == 0 ? qd_0.Vx0 : (n == 1 ? qd_0.H4 : (n == 2 ? qd_0.Ws0 : null));
        this.rP = this.Rj.getShort();
        this.gF0 = this.Rj.getInt();
        this.cx = new K90[this.Rj.get() & 0xFF];
        for (int i = 0; i < this.cx.length; ++i) {
            boolean s = this.A2 == qd_0.Ws0;
            CH0 owner = this.pE();
            qd_0 qd2;
            int n3 = this.Rj.get() & 0xFF;
            if (n3 == 0) {
                qd2 = qd_0.Vx0;
            } else if (n3 == 1) {
                qd2 = qd_0.H4;
            } else if (n3 == 2) {
                qd2 = qd_0.Ws0;
            } else {
                qd2 = null;
            }
            K90 k = new K90(owner, qd2);
            k.mx0 = this.Rj.getInt();
            k.ql0 = this.Rj.getInt();
            k.Kq0 = this.Rj.getInt();
            k.si0 = this.Rj.getShort();
            if (s) {
                k.q8 = this.Rj.get();
                k.hf = this.Rj.getShort();
            }
            if (s || qd2 == qd_0.H4) {
                k.CF = this.Rj.getShort();
                k.i90 = this.Rj.get();
            }
            if (qd2 == qd_0.Vx0 && (this.Rj.get() & 0xFF) == 1) {
                k.Hl0 = this.Lr0();
                for (int j = 0; j < 6; ++j) {
                    k.yZ[j] = this.Rj.getShort();
                }
            }
            this.cx[i] = k;
        }
        if (this.A2 == qd_0.H4) {
            int cnt = this.Rj.get() & 0xFF;
            this.Wm0 = new RB();
            for (int j = 0; j < cnt; ++j) {
                short value = this.Rj.getShort();
                int key = this.Rj.getInt();
                this.Wm0.JF0(key, value);
            }
        }
    }

    @Override
    public final void os0() {
        BR br = (BR) this.sr0();
        BU bu = br.lZ.zK0;
        if (bu != null) {
            lr_0 lr = bu.Xf0;
            if (lr == null) {
                bu.U1(null, true, true);
                lr = bu.Xf0;
            }
            if (lr != null) {
                lr.M8(this.sh, this.A2, this.rP, this.gF0, this.cx, this.Wm0);
            }
        }
    }
}
