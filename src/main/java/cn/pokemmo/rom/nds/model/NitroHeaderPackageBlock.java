package cn.pokemmo.rom.nds.model;

import java.nio.ByteBuffer;

public class NitroHeaderPackageBlock {
    public final byte DL0;
    public final int Fq;
    public final int FP;
    public final int L2;
    public final int jm;
    public final int strictfp$;
    public final int ll0;

    public NitroHeaderPackageBlock(byte i1, ByteBuffer v2) {
        this.DL0 = i1;
        v2.position();
        this.Fq = v2.getInt();
        this.FP = v2.getInt();
        this.L2 = v2.getInt();
        this.jm = v2.getInt();
        this.strictfp$ = v2.getInt();
        this.ll0 = v2.getInt();
        byte[] arr = new byte[48];
        v2.get(arr);
        new String(arr);
    }
}
