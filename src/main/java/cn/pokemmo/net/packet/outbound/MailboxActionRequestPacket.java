package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MailboxActionRequestPacket extends RE {
    public final b30_0 La;
    public final kt_2 hI0;
    public final short wW;
    public final CH0 py0;
    public final byte HH;
    public final K5 tJ;

    public MailboxActionRequestPacket(b30_0 format, K5 key, CH0 id, byte flags) {
        super(50);
        this.La = format;
        this.hI0 = kt_2.IL0;
        this.wW = key.pm();
        this.py0 = id;
        this.HH = flags;
        this.tJ = key;
    }

    public MailboxActionRequestPacket(b30_0 format) {
        super(50);
        this.La = format;
        this.hI0 = kt_2.IL0;
        this.wW = 1287;
        this.py0 = CH0.j1;
        this.HH = 0;
        this.tJ = null;
    }

    public MailboxActionRequestPacket(b30_0 format, kt_2 type, short value) {
        super(50);
        this.La = format;
        this.hI0 = type;
        this.wW = value;
        this.py0 = CH0.j1;
        this.HH = 0;
        this.tJ = null;
    }

    public MailboxActionRequestPacket(b30_0 format, short value, byte flags) {
        super(50);
        this.La = format;
        this.hI0 = kt_2.ue;
        this.wW = value;
        this.py0 = CH0.j1;
        this.HH = flags;
        this.tJ = null;
    }

    public MailboxActionRequestPacket(b30_0 format, kt_2 type) {
        super(50);
        this.La = format;
        this.hI0 = type;
        this.wW = 0;
        this.py0 = CH0.j1;
        this.HH = 0;
        this.tJ = null;
    }

    @Override
    public final void ig0(k20_0 connection, ByteBuffer out) {
        out.put(this.La == null ? (byte) 0 : this.La.bG());
        out.put(this.hI0.Dg0);
        int mapped = OZ.Nt[this.hI0.iy];
        switch (mapped) {
            case 1, 2, 3 -> out.putShort(this.wW);
            case 4 -> { out.putShort(this.wW); out.putLong(this.py0.Sa); out.put(this.HH); }
            default -> { }
        }
    }
}
