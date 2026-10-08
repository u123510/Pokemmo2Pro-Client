package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ScriptDialogResponsePacket extends RE {
    public final byte COM3;
    public final byte N1;
    public final String q2;
    public final byte[] jf0;

    public ScriptDialogResponsePacket(byte[] v1) {
        super(28);
        this.COM3 = 2;
        this.jf0 = v1;
        this.N1 = -1;
        this.q2 = "";
    }

    public ScriptDialogResponsePacket(byte i1, String v2) {
        super(28);
        this.COM3 = 1;
        this.jf0 = new byte[0];
        this.N1 = i1;
        this.q2 = v2;
    }

    public final void ig0(k20_0 v1, ByteBuffer v2) {
        v2.put(this.COM3);
        if ((this.COM3 & 1) != 0) {
            v2.put(this.N1);
            bo_1.cK(this.q2, v2);
        }
        if ((this.COM3 & 2) != 0) {
            v2.put((byte) this.jf0.length);
            for (int i = 0; i < this.jf0.length; i++) {
                v2.put(this.jf0[i]);
            }
        }
    }
}
