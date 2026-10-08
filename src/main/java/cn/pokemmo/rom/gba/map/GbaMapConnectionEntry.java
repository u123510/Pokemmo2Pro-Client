package cn.pokemmo.rom.gba.map;

import f.rh_1;
import f.rz_0;
import java.nio.ByteBuffer;

/**
 * GBA 地图连接/跳转数据记录 (GBA Map Connection Entry)
 * <p>
 * 原始混淆类: {@code f.tj_2}
 */
public class GbaMapConnectionEntry {
    public final short[] Fs0 = new short[4];

    public GbaMapConnectionEntry(short s, ByteBuffer byteBuffer) {
        byteBuffer.getShort();
        for (int i = 0; i < 4; i++) {
            this.Fs0[i] = byteBuffer.getShort();
        }
        ByteBuffer byteBuffer2 = byteBuffer;
        rh_1.vY.t9(byteBuffer.get());
        byteBuffer2.get();
        rz_0.x2(byteBuffer2.get());
        byteBuffer2.position(byteBuffer2.position() + 3);
    }
}
