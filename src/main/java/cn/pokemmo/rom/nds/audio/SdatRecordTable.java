package cn.pokemmo.rom.nds.audio;

import f.*;
import java.nio.ByteBuffer;

/**
 * SDAT 记录条目映射表 (SDAT Record Table)
 * 
 * 职责:
 * 解析 SDAT 二进制表中的记录偏移与条目序列。
 * 
 * 原混淆类: f.uu0
 */

import java.nio.ByteBuffer;

public class SdatRecordTable {
    public final int Tl;
    public final int[] LE0;
    public final yb_0[] mR;

    public SdatRecordTable(ByteBuffer v1, xd_1 v2) {
        int count = v1.getInt();
        this.Tl = count;
        this.LE0 = new int[count];
        this.mR = new yb_0[count];
        for (int i = 0; i < this.Tl; i++) {
            this.LE0[i] = v1.getInt();
        }
        for (int i = 0; i < this.Tl; i++) {
            this.mR[i] = v2.get();
            if (this.LE0[i] == 0 && this.mR[i].getClass() == kx_0.class) {
                continue;
            }
            v1.position(this.LE0[i]);
            this.mR[i].N00(v1);
        }
    }
}
