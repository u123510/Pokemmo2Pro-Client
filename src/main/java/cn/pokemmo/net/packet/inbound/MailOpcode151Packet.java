package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MailOpcode151Packet extends GH {
    public short r6;
    public boolean FL;
    public St0[] I5;

    public MailOpcode151Packet(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        this.r6 = this.Rj.getShort();
        this.FL = (this.Rj.get() & 0xFF) == 1;
        this.I5 = new St0[this.Rj.getShort()];
        for (int i = 0; i < this.I5.length; ++i) {
            this.I5[i] = this.m5(this.FL, false);
        }
    }

    @Override
    public final void os0() {
        BR br = (BR) this.sr0();
        BU bu = br.lZ.zK0;
        if (bu != null) {
            qu_2 mailbox = bu.de0;
            if (mailbox == null || !mailbox.D7) {
                bu.RG0(null, true, true);
                mailbox = bu.de0;
            }
            if (mailbox != null && this.I5 != null) {
                if (this.FL) {
                    Qm0 mailView = mailbox.j4;
                    if (this.r6 == mailView.GM) {
                        mailView.re0 = this.I5;
                        mailView.um();
                    }
                } else {
                    Qm0 mailView = mailbox.Dw;
                    if (this.r6 == mailView.GM) {
                        mailView.re0 = this.I5;
                        mailView.um();
                    }
                }
            }
        }
    }
}
