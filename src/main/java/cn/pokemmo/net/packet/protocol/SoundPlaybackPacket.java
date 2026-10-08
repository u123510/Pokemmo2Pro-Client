package cn.pokemmo.net.packet.protocol;

import f.*;

import java.nio.ByteBuffer;

public class SoundPlaybackPacket extends BaseSystemProtocolPacket {
    public final wx_2 MW;

    public SoundPlaybackPacket(wx_2 v1) {
        super((byte) 0);
        this.MW = v1;
    }

    public final void hG(ByteBuffer v1) {
        v1.put(this.mG);
        v1.putShort((short) this.MW.Rv);
        short[] arr = this.MW.Eo();
        for (short s : arr) {
            v1.putShort(s);
        }
    }

    public final boolean L6() {
        return this.MW.isEmpty();
    }
}
