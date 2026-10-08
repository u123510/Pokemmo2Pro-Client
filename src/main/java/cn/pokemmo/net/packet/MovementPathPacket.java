package cn.pokemmo.net.packet;

import f.bH0;
import java.nio.ByteBuffer;

public class MovementPathPacket extends bH0 {
    public MovementPathPacket(byte b, short s, short s2, ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.r1 = byteBuffer.getShort();
        this.l80 = byteBuffer.getShort();
        this.xX = byteBuffer.getShort();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.getShort();
        byteBuffer.getShort();
    }
}
