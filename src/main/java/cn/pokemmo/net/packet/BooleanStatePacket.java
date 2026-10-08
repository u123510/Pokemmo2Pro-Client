package cn.pokemmo.net.packet;

import f.SH0;

public class BooleanStatePacket extends SH0 {
    public boolean XD;

    public BooleanStatePacket() {
    }

    public BooleanStatePacket(boolean bl) {
        this.XD = bl;
    }
}
