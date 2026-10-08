package f;

import cn.pokemmo.rom.nds.bw.BlackWhiteRom;
import cn.pokemmo.rom.nds.bw.BwMapHeaderEntry;
import java.nio.ByteBuffer;

/**
 * 黑白 (Gen 5) 单张地图描述符兼容垫片
 * 已重构至 cn.pokemmo.rom.nds.bw.BwMapHeaderEntry
 */
public final class ug_0 extends BwMapHeaderEntry {
    public ug_0(short s, BlackWhiteRom rom, ByteBuffer byteBuffer) {
        super(s, rom, byteBuffer);
    }

    public ug_0(short s, nj0_0 nj0_0Var, ByteBuffer byteBuffer) {
        super(s, nj0_0Var, byteBuffer);
    }

    @Override
    public ug_0 or() {
        return (ug_0) super.or();
    }
}
