package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode110Packet extends GH {
    public short[] sp0;
    public boolean[] Ar0;

    public ServerOpcode110Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        byte len = this.Rj.get();
        this.sp0 = new short[len];
        this.Ar0 = new boolean[len];
        for (int i = 0; i < this.sp0.length; i++) {
            this.sp0[i] = this.Rj.getShort();
            this.Ar0[i] = this.Rj.get() == 1;
        }
    }

    public final void os0() {
        BR rl = tw0_0.rl;
        if (rl != null) {
            rl.Pa = this.sp0;
            rl.Hf0 = this.Ar0;
        }
    }
}
