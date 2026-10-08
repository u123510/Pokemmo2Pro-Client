package cn.pokemmo.rom.nds.model;

import f.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * NDS 地图建筑大世界布局表 (NDS Field Layout Table)
 * 
 * 职责:
 * 解析 NDS ROM 二进制布局头 (Magic 0x4241), 提取地图中全部建筑的生成坐标与模型索引。
 * 
 * 原混淆类: f.an_0
 */

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

public class NdsFieldLayoutTable {
    public final ArrayList sG;
    public final HashMap i8;

    public NdsFieldLayoutTable() {
        this.sG = new ArrayList();
        this.i8 = new HashMap();
    }

    public static NdsFieldLayoutTable load(ByteBuffer data) {
        return Y3(data);
    }

    public static NdsFieldLayoutTable Y3(ByteBuffer data) {
        NdsFieldLayoutTable result = new an_0();
        short header = data.getShort();
        if (header != 16961) {
            throw new RuntimeException(yr_1.pG("Header magic mismatch = ", header));
        }

        int count = (data.getShort() & 65535) / 2;
        int[] entryOffsets = new int[count];
        int[] payloadOffsets = new int[count];
        for (int index = 0; index < count; index++) {
            entryOffsets[index] = data.getInt();
        }
        for (int index = 0; index < count; index++) {
            payloadOffsets[index] = data.getInt();
        }
        data.getInt();

        for (int index = 0; index < count; index++) {
            data.position(entryOffsets[index]);
            JC0 entry = new JC0();
            entry.im = index;
            entry.Sm = data.getShort();
            data.getShort();
            entry.eI = data.getShort();
            if (entry.eI >= 0) {
                entry.rt0 = new C8(data.getShort(), data.getShort(), data.getShort());
            } else {
                data.getShort();
                data.getShort();
                data.getShort();
            }

            data.getShort();
            data.getShort();
            int referenceBase = data.position();
            entry.n4 = data.getShort();
            entry.o = data.get();
            data.get();
            int[] references = new int[4];
            for (int reference = 0; reference < 4; reference++) {
                references[reference] = data.getInt();
            }

            data.position(payloadOffsets[index] + 8);
            int payloadLength = data.getInt();
            data.position(payloadOffsets[index] + payloadLength);
            entry.KJ = payloadOffsets[index];
            entry.SZ = data;
            for (int reference : references) {
                if (data.limit() > reference && reference >= 1) {
                    entry.O8.Ue0(Integer.valueOf(referenceBase + reference));
                }
            }
            result.sG.add(entry);
            result.i8.put(Short.valueOf(entry.Sm), entry);
        }
        return result;
    }
}
