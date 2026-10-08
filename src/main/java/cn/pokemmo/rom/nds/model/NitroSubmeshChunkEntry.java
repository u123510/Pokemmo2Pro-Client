package cn.pokemmo.rom.nds.model;

import f.kk0_0;
import java.nio.ByteBuffer;

public class NitroSubmeshChunkEntry extends kk0_0 {
    public NitroSubmeshChunkEntry(byte b, ByteBuffer byteBuffer, short s) {
        super(byteBuffer);
        byteBuffer.getShort();
        this.EY = byteBuffer.getShort();
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
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
    }
}
