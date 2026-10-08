package cn.pokemmo.net.packet;

import f.KO;
import java.nio.ByteBuffer;

public class DecaShortPacketParserA extends KO {
    public DecaShortPacketParserA(byte b, short s, short s2, ByteBuffer byteBuffer) {
        super(byteBuffer);
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
    }
}
