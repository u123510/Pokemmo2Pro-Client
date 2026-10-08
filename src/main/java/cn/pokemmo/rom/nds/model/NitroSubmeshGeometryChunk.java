package cn.pokemmo.rom.nds.model;

import f.kk0_0;
import java.nio.ByteBuffer;

public class NitroSubmeshGeometryChunk extends kk0_0 {
    public NitroSubmeshGeometryChunk(byte b, ByteBuffer byteBuffer, short s) {
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
        this.r20 = (byteBuffer.getShort() == 1);
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
        byteBuffer.getShort();
    }
}
