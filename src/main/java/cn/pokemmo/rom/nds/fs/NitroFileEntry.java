package cn.pokemmo.rom.nds.fs;

import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import f.AT;
import f.tx_1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * NitroFS 虚拟文件条目句柄
 * 原混淆类: f.Ae
 */
public class NitroFileEntry {
    public final AbstractNdsRom rom;
    public final int startOffset;
    public final int length;
    public final String name;
    public final short fileId;
    public String fullPath;

    // 兼容混淆字段别名
    public final int bM0;
    public final int Vh0;
    public final String k9;
    public final short SL;
    public String kd;

    public NitroFileEntry(AbstractNdsRom rom, String name, int startOffset, int length, short fileId) {
        this.rom = rom;
        this.name = name;
        this.startOffset = startOffset;
        this.length = length;
        this.fileId = fileId;

        // 镜像别名
        this.k9 = name;
        this.bM0 = startOffset;
        this.Vh0 = length;
        this.SL = fileId;
    }

    public final ByteBuffer getSlice() {
        return this.slice(false);
    }

    public final ByteBuffer j90() {
        return this.slice(false);
    }

    public final AbstractNdsRom getRom() {
        return this.rom;
    }

    @Override
    public final String toString() {
        return this.name;
    }

    public ByteBuffer slice(boolean decompress) {
        ByteOrder order = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer buf = this.rom.dL.duplicate().order(order);
        buf.position(this.startOffset);
        if (this.length > 0) {
            int limit = ((Buffer) buf).limit();
            AT.i20(this.startOffset, this.length, limit, buf);
        }

        ByteBuffer slice = buf.slice().order(order);
        if (!decompress) {
            return slice;
        } else {
            byte flag = slice.get(0);
            if (flag == 16 || flag == 17) {
                slice = ByteBuffer.wrap(tx_1.Gi(0, slice)).order(order);
            }
            return slice;
        }
    }

    public ByteBuffer MH(boolean decompress) {
        return this.slice(decompress);
    }
}
