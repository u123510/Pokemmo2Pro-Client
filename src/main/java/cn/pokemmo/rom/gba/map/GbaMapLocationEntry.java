package cn.pokemmo.rom.gba.map;

import f.*;

import java.nio.ByteBuffer;

public class GbaMapLocationEntry extends gn_2 {
    public final byte nr;
    public final byte La;
    public final byte fN;
    public final byte s3;
    public final hw_1[] h60;

    public GbaMapLocationEntry(byte type, ByteBuffer buffer, short index) {
        super(type, index);
        this.nr = buffer.get();
        this.La = buffer.get();
        buffer.get();
        this.fN = buffer.get();
        byte[] nameBytes = new byte[12];
        buffer.get(nameBytes);
        String name = mz_1.Y(nameBytes);
        if (!name.trim().isEmpty()) {
            sm0_0.Tm0(this.COM7(), name);
        }
        buffer.getShort();
        buffer.getShort();
        buffer.getShort();
        buffer.getShort();
        buffer.getInt();
        buffer.getInt();
        byte count = buffer.get();
        this.s3 = count;
        buffer.get();
        buffer.get();
        buffer.get();
        int offset = G90.GF0(buffer.getInt());
        int position = buffer.position();
        buffer.position(offset);
        this.h60 = new hw_1[count];
        for (int i = 0; i < this.s3; i++) {
            this.h60[i] = new hw_1(this.nr, buffer);
        }
        buffer.position(position);
    }

    @Override
    public final byte VK0() { return this.La; }

    @Override
    public final short A5() { return (short) this.fN; }

    @Override
    public final String gK0() { return sm0_0.c0(this.COM7()); }

    public final int COM7() {
        return this.PH * 1000 + 195000 + this.vn;
    }
}
