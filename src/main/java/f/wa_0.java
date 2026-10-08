package f;

import cn.pokemmo.rom.nds.bw.BwWorldMapPointHeader;
import java.nio.ByteBuffer;

/**
 * Shim: wa_0 -> BwWorldMapPointHeader
 * @see cn.pokemmo.rom.nds.bw.BwWorldMapPointHeader
 */
public final class wa_0 extends BwWorldMapPointHeader {
    public wa_0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
