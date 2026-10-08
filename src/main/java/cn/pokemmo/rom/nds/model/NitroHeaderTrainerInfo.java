package cn.pokemmo.rom.nds.model;

import f.mz_1;
import f.sm0_0;
import java.nio.ByteBuffer;

public class NitroHeaderTrainerInfo {
    public final String zX;
    public final String JA0;
    public final short[] Js0;
    public final short[] UC0;

    public NitroHeaderTrainerInfo(byte i1, ByteBuffer v2) {
        this.Js0 = new short[4];
        this.UC0 = new short[6];
        v2.getShort();
        byte[] v1_bytes = new byte[11];
        v2.get(v1_bytes);
        byte[] v3_bytes = new byte[8];
        v2.get(v3_bytes);
        this.zX = mz_1.Y(v1_bytes);
        String ja0 = mz_1.Y(v3_bytes);
        this.JA0 = ja0;
        sm0_0.Tm0(315000 + i1, ja0);
        v2.get();
        v2.getShort();
        v2.get();
        v2.get();
        v2.get();
        v2.get();
        v2.getShort();
        for (int i = 0; i < 4; i++) {
            this.Js0[i] = v2.getShort();
        }
        for (int i = 0; i < 6; i++) {
            this.UC0[i] = (short) (v2.get() & 0xff);
        }
        v2.position(v2.position() + 16);
        v2.getInt();
    }
}
