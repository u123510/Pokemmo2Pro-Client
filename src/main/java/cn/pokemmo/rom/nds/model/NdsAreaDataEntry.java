package cn.pokemmo.rom.nds.model;

import java.nio.ByteBuffer;

/**
 * NDS 区域数据条目模型 (NDS Area Data Entry)
 * 
 * 职责:
 * 存储特定区域 (Area) 的标志位、音乐、天气与坐标属性。
 * 
 * 原混淆类: f.km0
 */
public class NdsAreaDataEntry {
    public final byte gI;
    public final short Pp;
    public final short eJ;
    public byte A;
    public byte aw0;

    public NdsAreaDataEntry(byte regionType, ByteBuffer buffer) {
        buffer.position();
        this.gI = regionType;
        if (regionType != 2 && regionType != 5) {
            this.Pp = buffer.getShort();
            this.eJ = buffer.getShort();
            buffer.getShort();
            buffer.getShort();
        } else {
            this.Pp = buffer.getShort();
            this.eJ = buffer.getShort();
            buffer.get();
            buffer.get();
            this.A = buffer.get();
            this.aw0 = buffer.get();
            buffer.get();
            buffer.get();
        }
    }

    public final short nG0() {
        if (this.gI == 2) {
            short s = this.eJ;
            if (s < 210) {
                if (s < 2) {
                    return 0;
                }
                return (short) (s - 2 + (s - 2 >> 31) << 14 >> 16);
            }
            return (short) (s - 210);
        }
        return this.Pp;
    }

    public final short rV() {
        return this.eJ;
    }
}
