package cn.pokemmo.rom.nds.dppt;

import f.Ae;
import f.Ao0;
import f.S80;
import f.l50_0;
import f.tx_1;
import java.nio.ByteBuffer;

/**
 * 第4世代 (DPPt / HGSS) 地图头数据表
 * 解析 /fielddata/maptable/mapname.bin
 * 原混淆类: f.f1_0
 */
public class DpptMapHeaderTable extends S80 {
    public DpptMapHeaderTable(l50_0 rom, int extraCount) {
        ByteBuffer byteBuffer;
        Ae fileEntry;

        if (rom.Tz() == 3) {
            // Platinum / Sinnoh
            fileEntry = rom.nuL().COM7("/fielddata/maptable/mapname.bin");
            byteBuffer = rom.Gr();
            tx_1.qR(1573448, 1573449, byteBuffer);
        } else if (rom.Tz() == 4) {
            // HeartGold / SoulSilver
            fileEntry = rom.nuL().COM7("/fielddata/maptable/mapname.bin");
            byteBuffer = rom.Gr();
            tx_1.qR(33489410, 11076050, byteBuffer);
            byteBuffer.position(byteBuffer.position() + 8);
        } else {
            this.Sx0 = new Ao0[0];
            this.entries = this.Sx0;
            return;
        }

        int count = fileEntry.Vh0 / 16;
        Ao0[] mapEntries = new Ao0[count + extraCount];
        this.Sx0 = mapEntries;
        this.entries = mapEntries;

        for (int i = 0; i < count; i = (short) (i + 1)) {
            mapEntries[i] = new Ao0((short) i, rom, byteBuffer);
        }
    }
}
