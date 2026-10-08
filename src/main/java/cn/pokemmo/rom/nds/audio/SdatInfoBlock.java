package cn.pokemmo.rom.nds.audio;

import f.*;
import java.nio.ByteBuffer;

/**
 * SDAT 信息表 (INFO) 块解析器 (SDAT Info Block)
 * 
 * 职责:
 * 解析 SDAT 中的音频属性、声道映射与块头配置。
 * 
 * 原混淆类: f.M2
 */

import java.nio.ByteBuffer;

public class SdatInfoBlock {
    public final int lPT1;
    public final qe0_0[] ca0;

    public SdatInfoBlock(hx_2 source) {
        ByteBuffer data = source.OX();
        data.position(source.ze0);
        data.get(new byte[4]);
        data.getInt();
        this.lPT1 = data.getInt();
        this.ca0 = new qe0_0[this.lPT1];

        for (int index = 0; index < this.lPT1; index++) {
            int first = data.getInt();
            this.ca0[index] = new qe0_0(source, first, data.getInt());
            data.position(data.position() + 8);
        }
    }
}
