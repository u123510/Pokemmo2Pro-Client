package cn.pokemmo.rom.nds.audio;

import java.nio.ByteBuffer;

/**
 * SDAT 符号字符串表 (SDAT Symbol String Table)
 * <p>
 * 原始混淆类: {@code f.OL}
 */
public class SdatSymbolStringTable {
    public String[] KB;

    public SdatSymbolStringTable() {
        this.KB = new String[0];
    }

    public SdatSymbolStringTable(ByteBuffer byteBuffer) {
        int count = byteBuffer.getInt();
        int[] offsets = new int[count];
        this.KB = new String[count];
        for (int i = 0; i < count; ++i) {
            offsets[i] = byteBuffer.getInt();
        }
        for (int i = 0; i < count; ++i) {
            if (offsets[i] == 0) {
                this.KB[i] = "";
                continue;
            }
            StringBuilder sb = new StringBuilder();
            byteBuffer.position(offsets[i]);
            while (true) {
                char c = (char) byteBuffer.get();
                if (c == '\u0000') {
                    this.KB[i] = sb.toString().trim();
                    break;
                }
                sb.append(c);
            }
        }
    }
}
