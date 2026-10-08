package cn.pokemmo.rom.nds.bw;

import f.Ae;
import f.S80;
import f.ug_0;
import java.nio.ByteBuffer;

/**
 * 黑白 (Gen 5) 地图头数据表
 * 解析 /a/0/1/2 NARC 中的全量地图定义。
 * 原混淆类: f.tp_1
 */
public class BwMapHeaderTable extends S80 {
    public BwMapHeaderTable(BlackWhiteRom rom, Ae fileEntry) {
        ByteBuffer buf = fileEntry.j90();
        int count = fileEntry.Vh0 / 48;
        ug_0[] mapEntries = new ug_0[count + 9];
        this.Sx0 = mapEntries;
        this.entries = mapEntries;
        for (int i = 0; i < count; i = (short) (i + 1)) {
            mapEntries[i] = new ug_0((short) i, rom, buf);
        }
    }
}
