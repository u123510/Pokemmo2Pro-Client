package cn.pokemmo.net.packet;

import f.TX;
import f.lpt4__2;
import java.nio.ByteBuffer;

public class NoOpPacketHandler extends lpt4__2 {
    public NoOpPacketHandler() {
        super(0);
    }

    @Override
    public void pH0(TX tX, ByteBuffer byteBuffer) {
    }
}
