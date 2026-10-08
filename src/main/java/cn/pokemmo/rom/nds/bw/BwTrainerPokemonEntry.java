package cn.pokemmo.rom.nds.bw;

import f.U20;
import java.nio.ByteBuffer;

/**
 * 黑白版训练家宝可梦出战数据 (BW Trainer Pokemon Entry)
 * <p>
 * 原始混淆类: {@code f.Ge}
 */
public class BwTrainerPokemonEntry {
    public final short[] iw0;

    public BwTrainerPokemonEntry(U20 u20, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        this.iw0 = new short[4];
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.get();
        byteBuffer2.getShort();
        byteBuffer2.getShort();
        if (u20.uR()) {
            for (int n = 0; n < this.iw0.length; ++n) {
                this.iw0[n] = byteBuffer.getShort();
            }
        }
        if (u20.Vn()) {
            byteBuffer.getShort();
        }
    }
}
