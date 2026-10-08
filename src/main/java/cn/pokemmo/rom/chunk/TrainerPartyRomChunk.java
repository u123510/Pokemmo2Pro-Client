package cn.pokemmo.rom.chunk;

import f.*;

import java.nio.ByteBuffer;

public class TrainerPartyRomChunk extends BaseRomResourceChunk {
    public ByteBuffer Yv0;
    public short Fm;
    public byte EL0;
    public short kK0;
    public short bR;
    public ol0_0 bh0;
    public byte Eq;

    public TrainerPartyRomChunk() { }

    public final void pH(ByteBuffer input, int... offset) {
        this.Yv0 = input;
        this.a00 = input.getShort() * 8;
        this.Fm = input.getShort();
        input.get();
        this.EL0 = input.get();
        input.get();
        input.get();
        this.Eq = (byte) ((this.Fm >>> 13) & 1);
        int format = (this.Fm >>> 10) & 7;
        this.bh0 = switch (format) {
            case 1 -> new ol0_0(0, (byte) 1, (byte) 8, 64);
            case 2 -> ol0_0.Wd0;
            case 3 -> ol0_0.Jk0;
            case 4 -> new ol0_0(3, (byte) 4, (byte) 8, 512);
            case 5 -> ol0_0.wi;
            case 6 -> new ol0_0(5, (byte) 6, (byte) 8, 16);
            default -> ol0_0.lA0;
        };
        this.bR = (short) Math.abs(8 << ((this.Fm >> 7) & 7));
        this.kK0 = (short) Math.abs(8 << ((this.Fm >> 4) & 7));
        if (this.kK0 == 0) this.kK0 = (this.EL0 & 3) == 2 ? (short) 512 : (short) 256;
        if (this.bR == 0) this.bR = ((this.EL0 >>> 4) & 3) == 2 ? (short) 512 : (short) 256;
        this.a00 += this.bh0 == ol0_0.wi ? offset[1] : offset[0];
    }

    public final byte[] break$() {
        this.Yv0.position(this.a00);
        int length = this.kK0 * this.bR * this.bh0.p8 / 8;
        byte[] data = new byte[length];
        this.Yv0.get(data);
        if (this.bh0 == ol0_0.Jk0) {
            return Ws0.Go(data);
        }
        if (this.bh0 == ol0_0.Wd0) {
            byte[] unpacked = new byte[length * 4];
            int dest = 0;
            for (int i = 0; i < length; i++) {
                byte b = data[i];
                unpacked[dest] = (byte) (b & 3);
                unpacked[dest + 1] = (byte) ((b >> 2) & 3);
                unpacked[dest + 2] = (byte) ((b >> 4) & 3);
                unpacked[dest + 3] = (byte) ((b >> 6) & 3);
                dest += 4;
            }
            return unpacked;
        }
        return data;
    }
}
