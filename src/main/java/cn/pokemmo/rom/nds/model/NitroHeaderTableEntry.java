package cn.pokemmo.rom.nds.model;

import f.G90;
import f.mz_1;
import f.sm0_0;
import f.yj_1;
import java.nio.ByteBuffer;

public class NitroHeaderTableEntry {
    public final byte rd0;
    public final short[][] Dc0;

    public NitroHeaderTableEntry(byte flags, byte group, short message, ByteBuffer header, ByteBuffer data) {
        this.Dc0 = new short[3][6];
        this.rd0 = flags;
        header.get();
        header.position(header.position() + 3);
        byte[] name = new byte[8];
        header.get(name);
        sm0_0.Tm0(group * 1000 + 280000 + message, mz_1.Y(name));
        for (int row = 0; row < this.Dc0.length; row++) {
            for (int column = 0; column < 6; column++) {
                this.Dc0[row][column] = header.getShort();
            }
        }
        data.position(G90.GF0(header.getInt()));
        yj_1 values = new yj_1();
        while (true) {
            short value = data.getShort();
            if (value < 0) {
                values.qE();
                return;
            }
            values.uo0(value);
        }
    }
}
